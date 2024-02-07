import java.util.Scanner;

public class Bai11_th2 {
    public static void solve(int n) {
        for (int i = 0; i < (1<<(n/2)); i++) {
            String s = Integer.toBinaryString(i);
            while(s.length()<n/2) {
                s= "0" + s;
            }
            StringBuilder sb = new StringBuilder(s);
            for (int j = s.length()-1-(n%2); j>=0;j-- ) {
                sb.append(s.charAt(j));
            }
            System.out.print(sb.toString() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            for (int i = 2; i<= n; i+=2) {
                solve(i);
            }
            System.out.println();

        }
    }
}
