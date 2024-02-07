import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String text = scanner.next();
            ArrayList <Character> ans = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if ((Character.isDigit(text.charAt(i)))) {
                    sum+=text.charAt(i) - '0';
                }else{
                    ans.add(text.charAt((i)));
                }
            }
            Collections.sort(ans);
            for (Character x : ans) {
                System.out.print(x);
            }
            System.out.print(sum);
            System.out.println();

        }
    }
}
