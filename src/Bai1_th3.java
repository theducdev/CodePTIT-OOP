import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai1_th3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            int n = scanner.nextInt();
            TreeSet <Integer> in = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                in.add(scanner.nextInt());
            }
            ArrayList <Integer> le = new ArrayList<>();
            for (Integer x : in) {
                if (x%2==0) {
                    System.out.print(x + " ");
                }else {
                    le.add(x);
                }
            }
            System.out.println();
            Collections.sort(le, Collections.reverseOrder());
            for (Integer x : le) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
