import java.util.Arrays;
import java.util.Scanner;

public class Quay_phai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int[] b = a.clone();
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (b[i] == a[0]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
