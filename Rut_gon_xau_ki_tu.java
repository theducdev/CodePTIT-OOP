
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Rut_gon_xau_ki_tu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        while(t-->0) {
            String text = scanner.nextLine();
            List <Character> ans = new ArrayList<> ();
            for (int i = 0; i < text.length(); i++) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != text.charAt(i)) {
                    ans.add(text.charAt(i));
                }
                else {
                    ans.remove(ans.size()-1);
                }
            }
            if (ans.isEmpty()) {
                System.out.println("Empty String");
            }
            else {
                for (Character x : ans) {
                    System.out.print(x);
                }
            }
            System.out.println();
            
            
        }
    }
    
}