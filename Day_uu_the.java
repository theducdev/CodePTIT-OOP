
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Day_uu_the {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            ArrayList <Integer> nums = new ArrayList<>();
            String text = scanner.nextLine();
            String[] a = text.split(" ");
            for (String i : a) {
                int x = Integer.valueOf(i);
                nums.add(x);
            }


            int lenNum = nums.size();
            int ssChan = 0;
            int ssLe = 0;
            for (int i = 0; i < lenNum; i++) {
                if ((nums.get(i)) % 2 == 0) {
                    ssChan++;
                }else{
                    ssLe++;
                }
            }
        
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