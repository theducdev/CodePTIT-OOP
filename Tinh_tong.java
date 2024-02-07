import java.util.*;
public class Tinh_tong {
    public static long tinh(long n) {
        return (1+n)*n/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0) {
            long n = scanner.nextLong();
            System.out.println(tinh(n));
            t--;
        }
        scanner.close();
        
    }
}
