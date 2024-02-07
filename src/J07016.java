import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class J07016 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new DataInputStream(new FileInputStream("DATA1.in")));
        ArrayList <Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        int[] used1 = new int[100005];
        Arrays.fill(used1, 0);
        for (Integer x : ds1) {
            used1[x]++;
        }
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new DataInputStream(new FileInputStream("DATA2.in")));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        int[] used2 = new int[100005];
        Arrays.fill(used2, 0);
        for (Integer x : ds2) {
            used2[x]++;
        }
        in2.close();

        for (int i = 2; i <= 10005; i++) {
            if (used2[i]>0 && used1[i]>0 && checkSnt(i)) {
                System.out.println(i + " " + used1[i] + " " + used2[i]);
                used2[i] = 0;
                used1[i] = 0;
            }
        }


    }
    public static boolean checkSnt(int n) {
        if (n==0||n==1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }

}
