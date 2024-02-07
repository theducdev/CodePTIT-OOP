import java.util.*;
public class Boi_so_chung_nho_nhat_cua_n_so_nguyen {
    public static long gcd(long a, long b) {
        return (a==0 ? b : gcd(b%a, a));
    }
    public static long lcm(long a, long b) {
        return a*b/gcd(a, b);
    }

    public static void main(String[] args) {
        long[] f = new long[10002];
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i <= 10000; i++) {
            f[i] = lcm(f[i-1], i);
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            System.out.println(f[n]);
        }
        
    }
}

