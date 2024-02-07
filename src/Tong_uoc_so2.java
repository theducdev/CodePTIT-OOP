import java.util.Scanner;

public class Tong_uoc_so2 {
    static int[] f = new int[1000005];
    public static void sang() {
        for (int i = 0; i <= 1000000; i++) {
            f[i] = 1;
        }
        for (int i = 2; i<= 1000000; i++) {
            for (int j = i*2; j <= 1000000; j+=i) {
                f[j] += i;
            }

        }
        for (int i = 0; i <= 1000000; i++) {
            if (f[i] == 0) {
                f[i] = i;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sang();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (f[i] > i) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
