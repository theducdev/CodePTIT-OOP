import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class Taomoi {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new DataOutputStream(new FileOutputStream("DATA.in")));
        ArrayList <String> ds1 = new ArrayList<>();
        ds1.add("a111. . toi la");
        ds1.add(" ");

        out.writeObject(ds1);




    }

}
