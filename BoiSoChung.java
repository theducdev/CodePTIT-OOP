import java.util.Scanner;

public class BoiSoChung {
    public static long findGCD(long a, long b) {
        return (a==0 ? b : findGCD(b%a, a));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long gcd = findGCD(a, b);
            System.out.println(a*b/gcd + " " + gcd);

        }
    }
    
}
