import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String ten, pass;
    private int id;

    public User(String ten, String pass, int id) {
        this.ten = ten;
        this.pass = pass;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public String getPass() {
        return pass;
    }

    public int getId() {
        return id;
    }
}
public class Bai6_th2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<User> ds = new ArrayList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            ds.add(new User(scanner.next(), scanner.next(), i));
            a[i] = 0;
        }
        int t = scanner.nextInt();
        while (t-->0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            for (User x : ds) {
                if (s1.equals(x.getTen()) && s2.equals(x.getPass())) {
                    a[x.getId()]++;
                }
            }
        }
        for (int i = 0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
