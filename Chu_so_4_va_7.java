import java.util.*;
public class Chu_so_4_va_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String so = scanner.next();
        int cnt = 0;
        for (int i = 0; i < so.length(); i++) {
            if (so.charAt(i) == '4' || so.charAt(i) == '7') {
                cnt++;
            }
        }
        if (cnt == 4 || cnt == 7) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
