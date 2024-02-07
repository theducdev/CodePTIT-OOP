import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class So_nguyen_to_lon_nhat_trong_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("THISINH.in"));
        ArrayList <Integer> ds = (ArrayList<Integer>) in.readObject();
        int[] a = new int[1000005];
        for (Integer x : ds) {
            a[x]++;
        }
        int cnt = 0;
        for (int i = 1000000; i >= 1; i--) {
            if (cnt == 10) break;
            if (a[i] > 0 && isPrime(i)) {
                System.out.println(i + " " + a[i]);
                cnt++;
            }
        }

    }
    public static boolean isPrime(int x) {
        if (x==0||x==1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
