import java.util.Scanner;

public class Day_con_lien_tiep_tong_bang_k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            long[] a = new long[n];
            long[] b = new long[n+1];
            b[0] = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (i==0) {
                    b[i+1] = a[i];
                }else{
                    b[i+1] = a[i] + b[i];
                }
            }
            int check = 0;
            for (int i = 0; i < n; i++) {
                if (binarySearch(b, b[i] + k, i)) {
                    check = 1;
                    break;
                }
            }
            if (check == 1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }

    }
    public static boolean binarySearch(long[] a, long target, int i) {
        int left = i+1;
        int right = a.length - 1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return false;
    }
}
