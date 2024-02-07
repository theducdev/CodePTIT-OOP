import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J03022 {
    public static String xulyCau(String cau) {
        String[] a = cau.toLowerCase().split("\\s+");
        String ans = "";
        ans+=Character.toUpperCase(a[0].charAt(0)) + a[0].substring(1) + " ";
        for (int i = 1; i< a.length; i++) {
            ans+=a[i] + " ";
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> ds = new ArrayList<>();
        while(scanner.hasNextLine()) {
            for (String x : scanner.nextLine().trim().split("[.!?]")) {
                ds.add(x.trim());
            }
        }

        for (String x : ds) {
            System.out.println(xulyCau(x));
        }

    }
}
