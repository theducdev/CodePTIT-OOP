
import java.util.*;
import java.lang.Character;
import java.math.*;
public class So_uu_the {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String num = scanner.nextLine();
            int lenNum = num.length();
            int check = 1;
            int ssChan = 0;
            int ssLe = 0;
            for (int i = 0; i < lenNum; i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    check = 0;
                    break;
                }
                if ((num.charAt(i) - '0') % 2 == 0) {
                    ssChan++;
                }else{
                    ssLe++;
                }
            }
            if (check == 0 || num.charAt(0) == '0') {
                System.out.println("INVALID");
            }else{
                if (lenNum %2 == 0 && ssChan>ssLe) {
                    System.out.println("YES");
                }
                else if (lenNum %2 != 0 && ssChan<ssLe) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");

                }
                
            }
        }
    }
    
}