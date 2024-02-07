import java.util.*;
public class So_chinh_phuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int x =(int) Math.sqrt(n);
            if(x*x==n) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
    
}
