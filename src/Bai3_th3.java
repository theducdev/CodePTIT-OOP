import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Matrix {
    public int n, m;
    public int a[][];

    public Matrix(int n, int m, int[][] a) {
        this.n = n;
        this.m = m;
        this.a = a;
    }

    public void xuly() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Bai3_th3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-->0) {
            List <Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    if (j==x-1) list.add(a[i][j]);
                }
            }
            int b[][] = new int[n][m];
            Collections.sort(list);
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if (j==x-1) {
                        b[i][j] =  list.get(cnt);
                        cnt++;
                    }else {
                        b[i][j] =  a[i][j];
                    }
                }
            }
            Matrix z = new Matrix(n, m, b);
            z.xuly();

        }
    }
}
