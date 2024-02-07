import java.util.*;
public class sap_xep_noi_bot {
    public static void swap(int i, int j, int[] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        for (int z = 1; z <= t; z++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int stt = 1;
            boolean swapped = true;

            while (swapped) {
                swapped = false;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        swap(i, i + 1, a);
                        swapped = true;
                    }
                }

                if (swapped) {
                    System.out.print("Buoc " + stt + ": ");
                    for (int x : a) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    stt++;
                }
            }
        }
    }
}
