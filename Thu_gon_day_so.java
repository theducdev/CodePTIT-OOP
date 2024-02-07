import java.util.*;
public class Thu_gon_day_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (temp.isEmpty() || (a.get(i) + temp.get(temp.size() - 1)) % 2 != 0) {
                temp.add(a.get(i));
            } else {
                temp.remove(temp.size() - 1);
            }
        }
        System.out.println(temp.size());
    }

    
}
