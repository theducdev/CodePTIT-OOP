import java.util.*;
import java.text.DecimalFormat;
public class Giaiptbac1 {
    public static double giai(double a, double b) {
        if (a == 0 && b != 0) {
            System.out.println("VN");
        }
        else if (a == 0 && b == 0) {
            System.out.println("VSN");
        }
        else {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(-b/a));
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        giai(a,b);
    }
    
}
