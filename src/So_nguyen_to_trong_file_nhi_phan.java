import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class So_nguyen_to_trong_file_nhi_phan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        int a[] = new int[10000];
        for (Integer i : ds) {
            a[i]++;
        }
        for (int i = 0; i < 10000; i++) {
            if (a[i] > 0 && isPrime(i)) {
                System.out.println(i + " " + a[i]);
            }
        }
    }
    public static boolean isPrime(int x) {
        if(x==0||x==1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
