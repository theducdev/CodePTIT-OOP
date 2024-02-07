import java.util.Scanner;

public class Ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while(t-->0) {
            int n = scanner.nextInt();
            int[] a = new int[3*n];
            for (int i = 0; i < 3*n; i++) {
                a[i] = scanner.nextInt();
            }
            int cnt = 0;
            int sum = 0;
            for (int i = 0; i < 3*n; i++) {
                sum+=a[i];
                if (i%3==2) {
                    if (sum == 2 || sum == 3) {
                        cnt++;
                    }
                    sum=0;
                }
            }
            System.out.println(cnt);
        }

    }
}
