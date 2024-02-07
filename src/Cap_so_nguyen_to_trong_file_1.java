import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Cap_so_nguyen_to_trong_file_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> xxx = (ArrayList<Integer>) in1.readObject();
        TreeSet<Integer> ds1 = new TreeSet<>(xxx);
        in1.close();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        in2.close();
        for (Integer x : ds1) {
            if ((x < 1000000-x) &&  checkSnt(x) && checkSnt(1000000-x) && ds2.contains(1000000-x)) {
                System.out.println(x + " " + (1000000-x));
            }
        }


    }
    public static boolean checkSnt(int x) {
        if (x<2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}

