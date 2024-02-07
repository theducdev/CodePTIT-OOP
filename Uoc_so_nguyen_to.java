import java.util.*;
import java.math.*;
public class Uoc_so_nguyen_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Số lượng bộ test
        
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong(); // Số nguyên dương N
            
            long largestPrimeFactor = -1;
            
            for (long i = 2; i * i <= N; i++) {
                while (N % i == 0) {
                    largestPrimeFactor = i;
                    N /= i;
                }
            }
            
            if (N > 1) {
                largestPrimeFactor = N;
            }
            
            System.out.println(largestPrimeFactor);
        }
    }

    
}
