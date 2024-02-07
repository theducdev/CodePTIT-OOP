import java.util.ArrayList;
import java.util.Scanner;

public class Bai2_lt {
    public static class Pair <T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public boolean isPrime(){
            if (checkSnt((Integer) this.first) && checkSnt((Integer) this.second) ) {
                return true;
            }
            return false;
        }
        public static boolean checkSnt(int n) {
            if (n<2) return false;
            for (int i = 2; i < (int)Math.sqrt(n) + 1; i++) {
                if (n%i==0) return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" +  first + "," + second + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList <ArrayList<Integer>> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList <Integer> tmp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                tmp.add(x);
            }
            ds.add(tmp);
        }
        ArrayList < Pair<Integer, Integer> > ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (ds.get(i).get(j)==1) {
                    ans.add(new Pair<>(i+1, j+1));
                }
            }
        }
        for (Pair <Integer, Integer> x : ans) {
            System.out.println(x);
        }
    }
}
