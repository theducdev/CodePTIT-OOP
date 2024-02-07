import java.util.ArrayList;
import java.util.Scanner;

public class Bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            ArrayList <Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                a.add((long) Math.pow(x, 2));
            }
            int check = 0;
            for (int i = n-1 ; i >=2; i--) {
                int left = 0;
                int right = i-1;

                while(left < right) {
                    if (a.get(i) == a.get(left) + a.get(right)) {
                        check = 1;
                        break;
                    }else if (a.get(left) + a.get(right) < a.get(i)){
                        left++;
                    }else{
                        right--;
                    }
                }

            }
            if (check==1) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
