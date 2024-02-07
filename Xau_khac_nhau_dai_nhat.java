
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Xau_khac_nhau_dai_nhat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();            
        scanner.nextLine();
        while(t-->0) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            if (a.equals(b)) {
                System.out.println(-1);
            }
            else {
                System.out.println(Math.max(a.length(),b.length()));
                
            }
            
            
        }
    }
    
}