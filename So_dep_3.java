import java.util.*;
import java.lang.Character;
import java.math.*;
public class So_dep_3 {
    public static boolean thuanNghich(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length()-1-i) || check_snt(num.charAt(i) - '0') == false ) {
                return false;
            }
        }
        return true;
    }

    public static boolean check_snt(int n) {
        if (n==2 || n == 3 || n == 5 || n == 7) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String num = scanner.next();
            if (thuanNghich(num)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");

            }
            
        }
    } 
}