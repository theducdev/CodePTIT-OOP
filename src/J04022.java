import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private TreeSet<String> ds;

    public WordSet(TreeSet<String> ds) {
        this.ds = ds;
    }

    public WordSet(String line) {
        String[] a = line.trim().toLowerCase().split("\\s+");
        TreeSet <String> ans = new TreeSet<>();
        for (String x : a) {
            ans.add(x);
        }
        this.ds = ans;
    }

    public WordSet union(WordSet s2) {
        TreeSet <String> ans = new TreeSet<>();
        for (String x : s2.ds) {
            ans.add(x);
        }
        for (String x : ds) {
            ans.add(x);
        }
        return new WordSet(ans);
    }

    public WordSet intersection(WordSet s2) {
        TreeSet <String> ans = new TreeSet<>();
        for (String x : s2.ds) {
            if (ds.contains(x)) {
                ans.add(x);
            }
        }
        return new WordSet(ans);

    }

    @Override
    public String toString() {
        String ans = "";
        for (String x : ds) {
            ans += x + " ";
        }
        return ans;
    }
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
