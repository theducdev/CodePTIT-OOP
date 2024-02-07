import java.util.ArrayList;
import java.util.Scanner;

//65 - 90
public class J03028 {
    public static ArrayList <Character> f = new ArrayList<>();

    public static Character chuyen(Character a, Integer k) {
        Integer idx = f.indexOf(a);
        return f.get((idx + k) % 26);
    }

    public static String xoay(String a) {
        int k = 0;
        for (int i = 0; i < a.length(); i++) {
            k+=f.indexOf(a.charAt(i));
        }
        String ans = "";
        for (int i = 0; i < a.length(); i++) {
            ans+=chuyen(a.charAt(i), k);
        }
        return ans;
    }
    public static String hop(String a, String b) {
        String ans ="";
        for (int i = 0; i < a.length(); i++) {
            int k = f.indexOf(b.charAt(i));
            ans+=chuyen(a.charAt(i), k);
        }
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            f.add((char) i);
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while ((t-->0)) {
            String line = scanner.nextLine();
            int n = line.length();
            String nuadau = xoay(line.substring(0, n/2));
            String nuasau = xoay(line.substring(n/2));
            System.out.println(hop(nuadau, nuasau));

        }


    }
}
