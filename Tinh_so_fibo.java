import java.util.*;
public class Tinh_so_fibo {
    public static long fibo(int n ) {
        long[] f = new long[93];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++) {
            f[i] = f[i-1] + f[i-2];
        } 
        return f[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        fibo(92);
        while(t-->0) {
            int n = scanner.nextInt();
            System.out.println(fibo(n));
        }
    }
}
