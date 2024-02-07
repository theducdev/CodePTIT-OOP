import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03031 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String text = scanner.nextLine();
            int k = scanner.nextInt();
            scanner.nextLine();
            Map<Character, Integer> mp = new HashMap<>();
            for (int i = 0; i<text.length();i++) {
                mp.put(text.charAt(i), mp.getOrDefault(text.charAt(i), 0)+1);
            }
            int n = mp.size();
            if (k >= (26-n) && text.length()>=26) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }




        }
    }

}
