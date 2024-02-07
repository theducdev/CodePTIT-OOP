import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07011 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList <String> a = new ArrayList<>();
        Scanner scanner = new Scanner(new File("VANBAN.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        while(n-->0) {
            a.add(scanner.nextLine());
        }

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
