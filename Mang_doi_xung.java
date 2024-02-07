import java.util.*;
public class Mang_doi_xung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int check = 1;
            int n = scanner.nextInt();
            int[] mang = new int[n+1];
            for (int i = 0; i < n; i++) {
                mang[i] = scanner.nextInt();
            }
            for (int i = 0; i <= n/2; i++) {
                if(mang[i]!=mang[n-i-1]) {
                    check = 0;
                    break;
                }
            }

            if(check ==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}
