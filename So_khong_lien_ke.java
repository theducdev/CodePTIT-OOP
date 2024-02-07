import java.util.*;
public class So_khong_lien_ke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            String a = scanner.next();
            int check = 1;
            int sum  = 0;
            char[] num = a.toCharArray();
            for (int i = 0; i < num.length - 1; i++) {
                sum+=num[i] -'0';
                if (Math.abs(num[i] - num[i+1]) != 2) {
                    check = 0; break;
                }

            }
            sum+=num[num.length-1] -'0';
            if (check==1 && sum%10==0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
}
