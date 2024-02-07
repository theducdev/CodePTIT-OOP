import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai2_kt {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList <String> ds1 = (ArrayList<String>) input1.readObject();
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) input2.readObject();
        TreeSet <String> t = new TreeSet<>();
        for (String x : ds1) {
            for (Integer y : ds2) {
                t.add(x+y+"");
            }
        }
        for (String x :t) {
            System.out.println(x);
        }

    }


}
