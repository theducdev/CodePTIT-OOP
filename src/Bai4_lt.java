import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Bai4_lt {
    private int[] a;
    public static class IntSet {
        private int[] a;

        public IntSet(int[] a) {
            this.a = chuyen(a);

        }
        public int[] chuyen(int[] a) {
            TreeSet <Integer> ans = new TreeSet<>();
            for (Integer x : a) {
                ans.add(x);
            }
            int[] tmp = new int[ans.size()];
            int i = 0;
            for (Integer x : ans) {
                tmp[i] = x;
                i++;
            }
            return tmp;
        }
        public IntSet union(IntSet s2) {
            TreeSet <Integer> ans = new TreeSet<>();
            for (Integer x : a) {
                ans.add(x);
            }
            for (Integer x : s2.a) {
                ans.add(x);
            }
            int[] tmp = new int[ans.size()];
            int i = 0;
            for (Integer x : ans) {
                tmp[i] = x;
                i++;
            }
            return new IntSet(tmp);
        }

        @Override
        public String toString() {
            String str = "";
            for (Integer x : a) {
                str+=x + " ";
            }
            return str;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
