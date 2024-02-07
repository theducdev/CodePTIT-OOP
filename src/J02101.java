import java.util.Scanner;

public class J02101 {

    public static String in(int[][] a) {
        int n = a.length;
        String ans = "";
        for (int i = 0; i<n; i++) {
            if (i%2==0) {
                for (Integer x : a[i]) {
                    ans += x + " ";
                }
            }
            else {
                for (int j = n-1; j >= 0; j--) {
                    ans+=a[i][j] + " ";
                }
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while ((t-->0)) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j<n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            System.out.println(in(a));

        }
    }
}
