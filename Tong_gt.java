import java.util.*;
public class Tong_gt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while(t>0) {
            long n = scanner.nextLong();
            long tmp = 1;
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                tmp*=i;
                sum+=tmp;
            }
            System.out.println(sum);
            t--;
        }
        
    }
    
}
