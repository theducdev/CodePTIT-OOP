import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07031 {

    public static boolean checkSnt(int x) {
        if (x<2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeSet <Integer> ds1 = new TreeSet<>((ArrayList <Integer>) in1.readObject());
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        in2.close();

        for (Integer x : ds1) {
            if (checkSnt(x) && ds1.contains(1000000-x) && checkSnt(1000000-x) && x < 1000000-x && !ds2.contains(x) && !ds2.contains(1000000-x) ) {
                System.out.println(x + " " + (1000000-x));
            }
        }



    }
}
