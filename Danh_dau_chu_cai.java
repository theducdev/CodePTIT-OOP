
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Danh_dau_chu_cai {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while(t-->0) {
            String text = scanner.nextLine();
            Set <Character> ans = new HashSet<>();
            for (int i = 0; i < text.length(); i++) {
                ans.add(text.charAt(i));
            }
            System.out.println(ans.size());
            
        }
    }
    
}