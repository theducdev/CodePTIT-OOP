

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai4_th2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        TreeSet <String> set = new TreeSet<>();
        while(scanner.hasNext()) {
            String a = scanner.next();
            int ok = 0;
            for (int i = 0; i< a.length();i++) {
                if (Character.isDigit(a.charAt(i))) {
                    ok = 1;
                }
                if (a.charAt(i) == '.' || a.charAt(i) == ','|| a.charAt(i) == '!'|| a.charAt(i) == '?'|| a.charAt(i) == ':') {
                    ok = 0; break;
                }
            }
            if (ok ==1) {
                set.add(a);
            }
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
