import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;


public class Bai12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> ds1 = (ArrayList<String>) in1.readObject();
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        in2.close();
        TreeSet <String> ans = new TreeSet<>();
        String tmp = "";
        for (String x : ds1) {
            for (Integer y : ds2) {
                ans.add(x + Integer.toString(y));
            }
        }
        for (String x : ans) {
            System.out.println(x);
        }


    }

}

