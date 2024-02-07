import java.util.*;
import java.math.*;
public class Hieu_so_nguyen_lon_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            int len_b = b.toString().length();
            int len_a = a.toString().length();
            int len_max;
            if (len_a>len_b) {
                len_max = len_a;
            }else {
                len_max = len_b;
            }
            String ans = a.subtract(b).abs().toString();
            int len_cnt = Math.abs(ans.length()-len_max);
            if (len_cnt != 0) {
                for (int i = 1; i <= len_cnt; i++) {
                    ans = "0" + ans;
                }
            }
            System.out.println(ans);
        }
    }
    
}
