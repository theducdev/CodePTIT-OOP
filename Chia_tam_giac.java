import java.util.*;
import java.text.DecimalFormat;
public class Chia_tam_giac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");
        int t = scanner.nextInt();
        while(t>0) {
            int n = scanner.nextInt();
            double h = scanner.nextInt();
            for(int i = 1; i <= n-1; i++) {
                System.out.print(df.format(Math.sqrt(h*h*i/n)));
                System.out.print(" ");
            }
            t--;
            System.out.println();
        }
        
    }
}
