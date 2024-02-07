import java.util.*;
public class Diem_can_bang {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int idx = -1;
            int n = scanner.nextInt();
            long sum = 0;
            long[] a = new long[n+5];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
                sum+=a[i];
            }
            long tmp = 0;
            for (int i = 1; i <= n-1; i++) {
                tmp+= a[i];
                if (tmp == (sum-a[i+1])/2) {
                    idx = i+1;
                    break;

                    
                }
            }
            System.out.println(idx);
        }
    }
}
