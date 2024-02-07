import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class J07012 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new DataInputStream(new FileInputStream("DATA.in")));
        ArrayList <String> a = (ArrayList<String>) in.readObject();
        HashMap <String, Integer> ds = new HashMap<>();
        for (String i : a) {
        String[] word = i.trim().toLowerCase().split("[^a-z0-9]");
            for (String x : word) {
                if(x.length()>0) ds.put(x, ds.getOrDefault(x, 0) + 1);
            }
        }

        ArrayList <Map.Entry<String, Integer>> sortds = new ArrayList<>(ds.entrySet());
        sortds.sort((x1, x2) -> {
            int res = x2.getValue().compareTo(x1.getValue());
            return (res!=0) ? res : x1.getKey().compareTo(x2.getKey());
        });

        for (Map.Entry<String, Integer> x : sortds) {
            System.out.println(x.getKey() + " " + x.getValue());
        }


    }
}
