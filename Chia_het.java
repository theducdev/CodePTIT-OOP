
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Chia_het {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();            
        scanner.nextLine();
        while(t-->0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            if ((a.remainder(b)).equals(BigInteger.ZERO) || (b.remainder(a)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");

            }
            
        }
    }
    
}