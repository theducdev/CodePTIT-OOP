import java.util.*;
import java.lang.Character;
import java.math.*;
public class So_dep_2 {
    public static boolean thuanNghich(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean tongChuSo(String num) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += (num.charAt(i) - '0');
        }
        if (sum%10 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String num = scanner.next();
            if (tongChuSo(num) && thuanNghich(num) && num.charAt(0) == num.charAt(num.length()-1) && num.charAt(0) == '8') {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");

            }
            
        }
    } 
}