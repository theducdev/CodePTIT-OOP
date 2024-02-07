
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Boi_so_chung_nho_nhat_cua_2_so_nguyen_lon {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();            
        scanner.nextLine();            
        while(t-->0) {
            BigInteger a = new BigInteger(scanner.next());
            BigInteger b = new BigInteger(scanner.next());
            
            System.out.println((a.multiply(b)).divide(a.gcd(b)));

        
        }
    }
    
}