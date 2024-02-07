import java.util.*;
import java.lang.Character;
import java.math.*;
public class Chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String[] a = scanner.nextLine().trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String word : a) {
                if (!word.isEmpty()) {
                    ans.append(Character.toUpperCase(word.charAt(0))+ (word.substring(1)).toLowerCase()).append(" ");
                }
            }
            System.out.println(ans.toString());
            
        }
    } 
}
