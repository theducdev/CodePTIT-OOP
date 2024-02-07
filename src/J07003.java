import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static String chiadoi(String a) {
        int n = a.length();
        int mid =(int) n/2;
        BigInteger x = new BigInteger(a.substring(0, mid));
        BigInteger y = new BigInteger(a.substring(mid, n));
        return String.valueOf(x.add(y));

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        String a = scanner.nextLine();
        while (a.length()>1) {
            String ans = chiadoi(a);
            System.out.println(ans);
            a = ans;

        }
    }
}
