import java.util.*;
import java.lang.Character;
import java.math.*;
public class Chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String[] a = scanner.nextLine().trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < a.length; i++) {
                if (i!=0) {
                    ans.append(Character.toUpperCase(a[i].charAt(0))+ (a[i].substring(1)).toLowerCase()).append(" ");
                }
            }
            System.out.print(ans.toString().trim());
            System.out.print(", " + a[0].toUpperCase());
            System.out.println();
            
        }
    } 
}
