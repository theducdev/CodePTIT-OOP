import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        int[] a = new int[100000];
        for (Integer i : ds1) {
            if (isValid(i)) {
                a[i]++;
            }
        }
        in1.close();


        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int[] b = new int[100000];
        for (Integer i : ds2) {
            if (isValid(i)) {
                b[i]++;
            }
        }
        in2.close();

        for (int i = 10; i < 100000; i++) {
            if (a[i] > 0 && b[i] > 0) {
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }


    }
    public static boolean isValid(int n) {
        if (n < 10) {
            return false;
        }
        String s = n + "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

