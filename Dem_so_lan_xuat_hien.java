import java.util.*;
public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int z = 1; z <= t; z++) {
            int m = scanner.nextInt();
            int b[] = new int[m];
            int[] check = new int[100005];
            Arrays.fill(check, 0);
    
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
                check[b[i]]++;
            }
            System.out.println("Test " + z + ":");
            for(int i=0; i<m; i++) {
                if(check[b[i]] > 0) {
                    System.out.println(b[i] + " xuat hien " + check[b[i]] + " lan");
                    check[b[i]] = 0;

                }

            }
        }
        
    }
    
}
