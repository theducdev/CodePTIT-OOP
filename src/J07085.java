import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {


    public static void tachso(String x) {
        String num = "";
        long tongchuso = 0;
        boolean leadingZero = true;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (Character.isDigit(c)) {
                if (c != '0' || !leadingZero) {
                    num += c;
                    tongchuso += Character.getNumericValue(c);
                    leadingZero = false;
                }
            }
        }
        if (num!="") {
            System.out.println( num + " " +  tongchuso);
        }else {
            System.out.println("0 0");
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <String> ds = (ArrayList<String>) in.readObject();
        for (String x : ds){
            tachso(x);
        }
    }
}
