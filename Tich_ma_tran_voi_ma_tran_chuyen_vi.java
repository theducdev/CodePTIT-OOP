import java.util.*;
import java.math.*;
public class Tich_ma_tran_voi_ma_tran_chuyen_vi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t = 1; t <= T; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] truoc = new int[n+1][m+1];
            int[][] sau = new int[m+1][n+1];
            int[][] kq = new int[n+1][n+1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    truoc[i][j] = scanner.nextInt();
                    sau[j][i] = truoc[i][j];
                }
            }
    
            System.out.println("Test " + t + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= m; k++) {
                        kq[i][j] += truoc[i][k] * sau[k][j];
                    }
                System.out.print(kq[i][j] + " ");
                }
                System.out.println();

            }


        }
        
    }

    
}
