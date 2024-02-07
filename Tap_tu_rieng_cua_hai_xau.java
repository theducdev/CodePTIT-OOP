
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String[] a = scanner.nextLine().split("\\s++");
            String[] b = scanner.nextLine().split("\\s++");
            Map <String, Integer> appear = new HashMap<>();
            for (String word : a) {
                if (!appear.containsKey(word)) {
                    appear.put(word, 1);
                }
            }
            for (String word : b) {
                if (appear.containsKey(word)) {
                    appear.put(word, appear.get(word)+1);
                }
            }
            Arrays.sort(a);
            for (String word : a) {
                if (appear.get(word) == 1) {
                    System.out.print(word + " ");
                    appear.put(word, 0);
                }
            }
            System.out.println();
            
        }
    }
    
}