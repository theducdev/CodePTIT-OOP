import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Khoang_cach_nho_hon_k {
    public static int lower_bound(int[] arr, int target, int start) {
        int left = start;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                cnt+=(lower_bound(a, a[i]+k, i) - i -1);
            }
            System.out.println(cnt);
        }
    }
}
