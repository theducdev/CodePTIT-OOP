import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        long sum = 0;
        while(scanner.hasNext()) {
            String s = scanner.next();
            try{
                int p = Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                try {
                    long k = Long.parseLong(s);
                    sum+=k;
                }
                catch (NumberFormatException r) {

                }
            }

        }
        System.out.println(sum);
    }

}
