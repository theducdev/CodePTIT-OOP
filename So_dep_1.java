import java.util.*;
import java.lang.Character;
import java.math.*;
public class So_dep_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            int check = 1;
            String num = scanner.next();
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) != num.charAt(num.length()-1-i) || (num.charAt(i) - '0') % 2!= 0) {
                    check = 0;
                    break;
                }
            }
            if (check == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");

            }
            
        }
    } 
}