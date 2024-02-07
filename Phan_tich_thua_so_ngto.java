import java.util.*;

public class Phan_tich_thua_so_ngto {
    public static Map<Long, Long> primeFactorization(long n) {
        Map<Long, Long> factors = new HashMap<>();
        long i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                n /= i;
                factors.put(i, factors.getOrDefault(i, (long)0) + 1);
            }
            i++;
        }
        if (n > 1) {
            factors.put(n, factors.getOrDefault(n, (long) 0) + 1);
        }
        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        for (int testCase = 1; testCase <= numTestCases; testCase++) {
            long n = scanner.nextLong();
            System.out.print("Test " + testCase + ": ");
            if (n == 0) {
                System.out.print(0 + "(" + 1 + ") ");
            }
            Map<Long, Long> factors = primeFactorization(n);

            for (Map.Entry<Long, Long> entry : factors.entrySet()) {
                System.out.print(entry.getKey() + "(" + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}
