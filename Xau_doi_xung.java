
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Xau_doi_xung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String text = scanner.nextLine();
            int error = 0;
            for (int i = 0; i <= text.length()/2-1; i++) {
                if (text.charAt(i) != text.charAt(text.length()-1-i) ) {
                    error++;
                }
            }
            if (error == 1 || (error == 0 && text.length() %2 != 0)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
            
        }
    }
    
}