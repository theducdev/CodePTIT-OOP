
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Xau_con_lon_nhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        Set <Character> aSet = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            aSet.add(text.charAt(i));
        }

        List<Character> a = new ArrayList<>(aSet);
        Collections.sort(a);
        StringBuilder ans = new StringBuilder();
        int idx = text.length()-1;
        for (Character x : a) {
            for (int i = idx; i>=0; i--) {
                if ((int) text.charAt(i) == (int) x) {
                    ans.append(x);
                }else if ((int) text.charAt(i) >(int) x) {
                    idx = i;
                    break;
                }
            }
        }
        System.out.println(ans.reverse());
       
    }
    
}