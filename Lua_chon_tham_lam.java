import java.util.*;
import java.math.*;

public class Lua_chon_tham_lam {

    public static void lonNhat(int n, int s) {
        int[] num = new int[n+1];
        num[0] =0;
        for (int i = 0; i < n; i++) {
            if (s==0) break;
            num[i] = Math.min(9, s-num[i]);
            s = Math.max(0, s-num[i]);    
            
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i]);
        }
        
    }
    public static void nhoNhat(int n, int s) {
        int[] num = new int[n+1];
        s-=1;
        for (int i = n-1; i >= 0; i--) {  
            if (s==0) break;
            num[i] = Math.min(9, s-num[i]);
            s = Math.max(0, s-num[i]);           
        }
        num[0] +=1;
        for (int i = 0; i < n; i++) {
            System.out.print(num[i]);
        }
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while(t-->0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            if (s==0||s>n*9) {
                System.out.println("-1 -1");
            }
            // else if (n==1) {
            //     System.out.println(s + " " + s);
            // }
            else{
                nhoNhat(n, s);
                System.out.print(" ");
                lonNhat(n, s);
                
                
                 
            }
        }
        
    }
}
