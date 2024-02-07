import java.util.*;
public class Sap_xep_chon {
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
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                System.out.print("Buoc " + (i+1) + ": ");
                int min_idx = i;
                for(int j = i+1; j < n; j++) {
                    if (a[j] < a[min_idx]) {
                        min_idx = j;
                    }
                }
                swap(min_idx, i, a);

                for (int x : a) System.out.print(x + " ");
                System.out.println();

            }
        }
    }
}
        
        
    
    

