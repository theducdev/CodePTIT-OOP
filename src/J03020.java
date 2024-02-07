import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class J03020 {
    public static boolean check(String a) {
        String dao = new StringBuilder(a).reverse().toString();
        if (dao.compareTo(a)==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> ds = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        int ans = 0;
        while(scanner.hasNextLine()) {
            String[] x = scanner.nextLine().split(" ");
//            if (x[0].compareTo("0")==0) break;
            for (String i : x) {
                if (check(i)) {
                    ds.add(i);
                    mp.put(i, mp.getOrDefault(i, 0)+1);
                    ans = Math.max(ans, i.length());
                }
            }
        }
        for (String x : ds) {
            if (x.length()==ans&&mp.get(x)>0) {
                System.out.println(x +" "+ mp.get(x));
                mp.put(x, 0);
            }
        }

    }
}
