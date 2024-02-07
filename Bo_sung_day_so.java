import java.util.*;
import java.math.*;
public class Bo_sung_day_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] check = new int[205];
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if(x > max_num) max_num = x;
            check[x] = 1;
        }
        int isFull = 1;

        for (int i = 1; i <= max_num; i++) {
            if (check[i]==0) {
                System.out.println(i);
                isFull = 0;
            }
        }
        if (isFull==1) System.out.println("Excellent!");

        
        
        
        
    }

    
}
