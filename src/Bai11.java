import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("THISINH.in"));
        ArrayList <String> ds = (ArrayList<String>) in.readObject();
        for (String x : ds) {
            StringBuilder a = new StringBuilder();
            for (int i = 0; i < x.length();i++) {
                if (x.charAt(i) == '0' || x.charAt(i) == '1') {
                    a.append(x.charAt(i));
                }
            }
            long kq = 0;
            for (int i = 0; i < a.length();i++) {
                kq= kq*2 + (a.charAt(i)-'0');
            }
            System.out.println(a + " " + kq);
        }
    }
}
