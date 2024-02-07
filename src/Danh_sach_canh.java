import java.util.ArrayList;
import java.util.Scanner;

public class Danh_sach_canh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Pair> DScanh = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {
                int x = scanner.nextInt();
                if (x==1 && i < j) {
                    DScanh.add(new Pair(i,j));
                }
            }
        }

        for (Pair x : DScanh) {
            System.out.println(x.toString());
        }

    }
}
