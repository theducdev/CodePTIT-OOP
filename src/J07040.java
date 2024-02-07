import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String, Boolean> mp1 = new HashMap<>();
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream( new File("NHIPHAN.in")));
        ArrayList <String> x = (ArrayList<String>) in1.readObject();
        ArrayList <String> ds1 = new ArrayList<>();
        for (String i : x) {
            String[] a = i.trim().toLowerCase().split("\\s+");
            for (String j : a) {
                ds1.add(j);
            }
        }
        for (String i : ds1) {
            if (!mp1.containsKey(i)) {
                mp1.put(i, true);
            }
        }
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        ArrayList <String> ds2 = new ArrayList<>();
        Map<String, Boolean> mp2 = new HashMap<>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] b = line.trim().toLowerCase().split("\\s+");
            for (String j : b) {
                if (!mp2.containsKey(j)) {
                    ds2.add(j);
                    mp2.put(j, true);
                }
            }
        }
        for (String i : ds2) {
            if (mp1.containsKey(i)) {
                System.out.println(i);
            }
        }





    }
}
