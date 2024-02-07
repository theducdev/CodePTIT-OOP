import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liet_ke_to_hop_2 {
    public static void Try(int n, int k, int start, List <Integer> cauhinh, List <List <Integer>> ans) {
        if (k==0) {
            ans.add(new ArrayList<>(cauhinh));
            return;
        }
        for (int i = start; i <= n; i++) {
            cauhinh.add(i);
            Try(n, k-1, i+1, cauhinh, ans);
            cauhinh.remove(cauhinh.size() -1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList <Integer> cauhinh = new ArrayList<>();
        ArrayList <List<Integer>> ans = new ArrayList<>();
        Try(n, k, 1, cauhinh, ans);
        for (List<Integer> x : ans) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("Tong cong co " + ans.size() +" to hop");


    }
}
