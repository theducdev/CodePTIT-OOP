import java.util.*;
public class Kiem_tra_fibo {
    public static long[] f = new long[93];
    public static void fibo() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i-1] + f[i-2];
        } 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        fibo();
        while(t-->0) {
            long n = scanner.nextLong();
            String check = "NO";
            for(int i = 0; i <= 92; i++) {
                if(n == f[i]) {
                    check = "YES";
                    break;
                }
            }
            System.out.println(check);

        }
    }
}
