import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TaoFileNhiPhan {
    public static void main(String[] args) throws IOException {
        ArrayList <Integer> data = new ArrayList<>();
        data.add(939);
        data.add(93939);
        data.add(13471);
        data.add(11311);
        data.add(113111);
        data.add(11111);
        data.add(111);
        data.add(333);
        data.add(777);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(555);
        data.add(999);
        data.add(99999);
        data.add(99199);
        data.add(99399);
        data.add(99799);
        ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("DATA2.in"));
        out.writeObject(data);
        out.close();
    }
}
