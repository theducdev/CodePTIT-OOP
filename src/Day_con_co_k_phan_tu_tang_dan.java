import java.util.*;

public class Day_con_co_k_phan_tu_tang_dan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            ArrayList <Integer> cauhinh = new ArrayList<>();
            Try(n, k,1, a, cauhinh);
            System.out.println();

        }
    }
    public static void Try(int n, int k,int start, int[] a, ArrayList <Integer> cauhinh) {
        if (k==0) {
            for (int x : cauhinh) {
                System.out.print(a[x] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= n; i++) {
            cauhinh.add(i);
            Try(n,k-1, i+1, a, cauhinh);
            cauhinh.remove(cauhinh.size()-1);
        }
    }
}
