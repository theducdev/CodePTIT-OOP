import java.util.*;
public class So_tamphan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int check = 1;
            String a = scanner.next();
            char[] num = a.toCharArray();
            for (int i = 0; i < num.length; i++ ) {
                if (num[i] != '0' && num[i] != '1' && num[i] != '2') {
                    check = 0; break;
                }
            }
            if(check==1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }

}
