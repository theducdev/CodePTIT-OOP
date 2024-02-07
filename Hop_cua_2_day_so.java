import java.util.*;
public class Hop_cua_2_day_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int m = scanner.nextInt();
        
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < m; i++) {
            b.add(scanner.nextInt());
        }
        
        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
