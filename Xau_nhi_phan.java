import java.util.*;
public class Xau_nhi_phan {
    public static long[] fibo = new long[93];

    public static int tinh(int n, long k) {
        if (n==1) return 0;
        if (n==2) return 1;
        if (k <= fibo[n-2]) return tinh(n-2, k);
        return tinh(n-1, k-fibo[n-2]);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2;i <= 92; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(tinh(n, k));

        }
    }
    
}
