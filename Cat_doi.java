import java.util.*;
public class Cat_doi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int check = 1;
            String so = scanner.next();
            char[] ans = so.toCharArray();
            for (int i = 0; i < so.length(); i++) {
                if (ans[i] == '0' || ans[i] == '8' ||ans[i] == '9' ) {
                    ans[i] = '0';
                }
                else if(ans[i] == '1') {
                    ans[i] = '1';
                }
                else {
                    check = 0;
                }
            }
            int idx = 0;
            while(idx < so.length() && ans[idx] == '0') idx++;
            if (idx == so.length()) check = 0;
            if (check==1) {
                for (int i = idx; i < so.length();i++) {
                    System.out.print(ans[i]);
                }
                System.out.println();
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
