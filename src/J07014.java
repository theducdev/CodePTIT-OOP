import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class J07014 {

    public static class WordSet {
        private TreeSet<String> ds;


        public WordSet(String filename) throws FileNotFoundException {
            Scanner scanner = new Scanner(new File(filename));
            ds = new TreeSet<>();
            while(scanner.hasNextLine()) {
                String[] a = scanner.nextLine().trim().split("\\s+");
                for (String x : a) {
                    ds.add(x.toLowerCase());
                }
            }
        }
        public String union(WordSet s2) {
            TreeSet <String> ans = new TreeSet<>(this.ds);
            for (String x : s2.ds) {
                ans.add(x);
            }
            String tmp = "";
            for (String x : ans) {
                tmp+=x + " ";
            }
            return tmp;
        }

        public String intersection(WordSet s2) {
            TreeSet<String> ans = new TreeSet<>();
            for (String x : this.ds) {
                if (s2.ds.contains(x)) {
                    ans.add(x);
                }
            }
            String tmp = "";
            for (String x : ans) {
                tmp += x + " ";
            }
            return tmp;
        }
    }

    public static void main(String[] args) throws IOException{
        WordSet s1 = new WordSet("DATA.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
