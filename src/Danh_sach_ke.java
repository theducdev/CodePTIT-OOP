import java.util.ArrayList;
import java.util.Scanner;

public class Danh_sach_ke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> DScanh = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            ArrayList <Integer> canh = new ArrayList<>();
            for (int j = 1; j<= n; j++) {
                int x = scanner.nextInt();
                if (x==1) {
                    canh.add(j);
                }
            }
            DScanh.add(canh);
        }

        int cnt = 1;
        for (ArrayList <Integer> canh : DScanh) {
            System.out.printf("List(%d) = ", cnt );
            for ( int x : canh) {
                System.out.print(x + " ");
            }
            System.out.println();
            cnt++;
        }

    }
}
