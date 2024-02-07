import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1_th2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DAYSO.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <BigInteger> ds = new ArrayList<>();
        while(n-->0){
            BigInteger x = new BigInteger(scanner.next());
            ds.add(x);
        }
        System.out.println(Collections.min(ds));
        System.out.println(Collections.max(ds));
        BigInteger sum = BigInteger.ZERO;
        for ( BigInteger x : ds) {
            sum = sum.add(x);
        }
        System.out.println(sum);
    }
}
