
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Tim_tu_thuan_nghich_dai_nhat {

    public static boolean thuanNghich(String a) {
        for (int i = 0; i <= a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> text = new ArrayList<>();
        Map <String, Integer> appear = new HashMap<>();
        int maxLen = 0;
        while(scanner.hasNextLine()) {
            String x = scanner.nextLine();
            if (x.isEmpty()) break;
            text.add(x);
            maxLen = Math.max(maxLen, x.length());
            if (!appear.containsKey(x)) {
                appear.put(x, 1);
            }else{
                appear.put(x, appear.get(x) + 1);
            }
            
        } 
        System.out.println(maxLen);
       
    }
    
}