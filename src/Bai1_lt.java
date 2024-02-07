import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Bai1_lt {
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
            return first + " " + second;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
