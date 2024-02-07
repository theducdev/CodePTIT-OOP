import java.util.*;

public class Songuyento {
    public static String checksnt(long n) {
        if (n == 1 || n == 0) return "NO";
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0) {
            long n = scanner.nextLong();
            System.out.println(checksnt(n));
            t--;
        }
    }
}
