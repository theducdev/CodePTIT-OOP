import java.util.*;
public class So_xa_cach {
    public static void generateXacachNumbers(int N, String current, int lastDigit, boolean[] used) {
        if (current.length() == N) {
            System.out.println(current);
            return;
        }

        for (int i = 1; i <= N; i++) {
            if(Math.abs(i-lastDigit) >= 2 && !used[i]) {
                used[i] = true;
                generateXacachNumbers(N, current+i, i, used);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int N = scanner.nextInt();
            boolean[] used = new boolean[N+1];
            generateXacachNumbers(N, "", -1, used);
        }
        scanner.close();
    }
}
