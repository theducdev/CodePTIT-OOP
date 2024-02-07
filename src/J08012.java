import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList <ArrayList <Integer>> ke = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ke.add(new ArrayList <Integer>());
        }
        for (int i = 0; i < n-1; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ke.get(x).add(y);
            ke.get(y).add(x);
        }
        int check = 0;
        for (int i = 0; i < n-1; i++) {
            System.out.println(ke.get(i));
        }
    }

}
