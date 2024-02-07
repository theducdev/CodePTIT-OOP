
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Dia_chi_email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        List <String> list = new ArrayList<>();
        
        while(t-->0) {
            String[] name = scanner.nextLine().trim().toLowerCase().split("\\s+");
            String ans = "";
            ans+=(name[name.length-1]);
            for (int i = 0; i < name.length - 1; i++) {
                ans+=((name[i]).charAt(0));
            }
            list.add(ans);
            String tmp = ans;
            long count = list.stream().filter(element -> element.equals(tmp)).count();
            if (count > 1) {
                ans += String.valueOf(count);
            }
            ans+=("@ptit.edu.vn");
            System.out.println(ans);


        }
    }
    
}