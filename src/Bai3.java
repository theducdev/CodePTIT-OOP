import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int[][] dp = new int[n+5][n+5];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n;j++) {
                    if(s.charAt(i-1) == s.charAt(j-1) && i!=j ) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            System.out.println(dp[n][n]);

        }
    }
}

