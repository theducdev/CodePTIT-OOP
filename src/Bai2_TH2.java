import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai2_TH2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds2= (ArrayList<Integer>) in2.readObject();
        in2.close();


        int[] a1 = new int[1000005];
        int[] a2 = new int[1000005];

        for (Integer x : ds1) {
            if (check(x)) {
                a1[x]++;
            }
        }
        for (Integer x : ds2) {
            if (check(x)) {
                a2[x]++;
            }
        }
        for (int i = 10; i <= 9999; i++) {
            if (a1[i] >= 1 && a2[i] >= 1) {
                System.out.println(i +" " + a1[i] + " " + a2[i]);
            }
        }

    }

    public static boolean check(int n) {
        String num = Integer.toString(n);
        if (num.length()<2) return false;
        for (int i = 0; i < num.length()-1;i++) {
            if (num.charAt(i) > num.charAt(i+1)) return false;
        }
        return true;

    }
}
