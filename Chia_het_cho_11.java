
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Chia_het_cho_11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            BigInteger a = new BigInteger(scanner.next());
            if (a.remainder(new BigInteger("11")) == BigInteger.ZERO) {
                System.out.println(1);
            }else{
                System.out.println(0);

            }
        }
    }
    
}