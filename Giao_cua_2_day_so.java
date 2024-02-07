import java.util.*;
public class Giao_cua_2_day_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int b[] = new int[m];
        int[] check = new int[1005];
        Arrays.fill(check, 0);
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            check[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);
        for(int i=0; i<m; i++) {
            if(check[b[i]] == 1){
                System.out.print(b[i] + " ");
                check[b[i]] = 0;
            }
        }
        
    }
}
