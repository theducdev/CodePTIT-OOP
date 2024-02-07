import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DAYSO.in"));
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            int n = scanner.nextInt();
            ArrayList <Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt());
            }
            Collections.sort(a);
            long num1 = 0;
            long num2 = 0;
            for (int i = 0; i < n; i++){
                if (i%2==0) {
                    num1 = num1*10 + a.get(i);
                }else {
                    num2 = num2*10 + a.get(i);
                }
            }
            System.out.println(num1+num2);
        }
    }
}
