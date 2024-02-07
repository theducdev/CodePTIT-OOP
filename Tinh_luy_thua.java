import java.util.*;
public class Tinh_luy_thua {
    public static final long mod = 1000000007;
    public static long tinh(long a, long b) {
        if (a==0) return 0;
        if (b==0) return 1;
        if (b==1) return a;
        long x = tinh(a,b/2);
        x%=mod;
        if (b%2==0) return (x*x)%mod;
        return (((x*x)%mod)*a)%mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0 && b==0) break;
            System.out.println(tinh(a,b));
        }
        scanner.close();
    }
}
