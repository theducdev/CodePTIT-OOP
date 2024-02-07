import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Day_con_co_tong_ngto {

    public static boolean checkSnt(int n) {
        if (n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    public static void khoitao(int n, int[] a) {
        for (int i = 1; i <= n; i++) {
            a[i] = 0;
        }
    }
    public static void Try(int i, int n, int[] a, ArrayList<Integer> b) {
        if (i==n+1) {
//            for (Integer x : a) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
            int sum =0;
            for (int k = 1; k <= n; k++) {
                sum+=a[k]*b.get(k-1);
            }
            if (checkSnt(sum)) {
                for (int k = 1; k <= n; k++) {
                    if (a[k] == 1) {
                        System.out.print(b.get(k-1) + " ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int j = 0; j <= 1; j++) {
                a[i] = j;
                Try(i+1, n, a, b);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            int n = scanner.nextInt();
            ArrayList <Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(scanner.nextInt());
            }
            b.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            int[] a = new int[n+1];
            khoitao(n, a);
            Try(1, n, a, b);


        }
    }
}
