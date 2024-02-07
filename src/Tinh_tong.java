import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        long sum = 0;
        while(scanner.hasNext()) {
            try {
                int x = Integer.parseInt(scanner.next());
                sum+=x;
            }catch (NumberFormatException e) {}
        }
        System.out.println(sum);
    }

}
