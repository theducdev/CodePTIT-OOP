import java.io.File;
import java.io.IOException;
import java.util.*;

public class Bai3_th2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        ArrayList <String> ans = new ArrayList<>();
        HashMap <String, Boolean> mp = new HashMap<>();
        while(scanner.hasNextLine() ) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            for (String x : words) {
                ans.add(x);
            }
        }
        Collections.sort(ans);

        for ( String x : ans) {
            if (check(x) && !mp.containsKey(x)) {
                System.out.println(x);
                mp.put(x, true);
            }
        }

    }

    public static boolean check(String x) {
        for (int i = 0; i < x.length();i++) {
            if (Character.isDigit(x.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
