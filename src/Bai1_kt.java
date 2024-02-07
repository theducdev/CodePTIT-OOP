import java.math.BigInteger;
import java.util.Scanner;

public class Bai1_kt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s = scanner.nextLine();
            BigInteger x = new BigInteger(s);
            BigInteger p = new BigInteger("13");
            int dem = 0;
            while(dem<=1000) {
                dem+=1;
                if(x.mod(p)==BigInteger.ZERO) {
                    System.out.println(x);
                    break;
                }
                s = x.toString();
                String kq = "";
                for (int i = s.length()-1; i>=0; i--) {
                    kq+=s.charAt(i);
                }
                BigInteger y = new BigInteger(kq);
                x=x.add(y);
            }
            if(dem>1000) {
                System.out.println(-1);
            }
        }
    }
}
