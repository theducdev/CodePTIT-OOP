import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> set1 = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().toLowerCase();
            String[] words = line.split("\\s+");
            for (String word: words) {
                set1.add(word);
            }
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<String> set2 = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine().toLowerCase();
            String[] words = line.split("\\s+");
            for (String word: words) {
                set2.add(word);
            }
        }
        scanner.close();
        Set<String> dif1 = new TreeSet<String>(set1);
        dif1.removeAll(set2);

        Set<String> dif2 = new TreeSet<String>(set2);
        dif2.removeAll(set1);

        System.out.println(String.join(" ", dif1));
        System.out.println(String.join(" ", dif2));

    }
}
