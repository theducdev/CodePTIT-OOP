import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Hang {
    public String ma, ten, donvi;
    public long mua, ban, loinhuan;

    public Hang(int i , String ten, String donvi, long mua, long ban) {
        this.ma = "MH" +  String.format("%03d", i);
        this.ten = ten;
        this.donvi = donvi;
        this.ban = ban;
        this.mua = mua;
        this.loinhuan = (ban-mua);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi+  " " + mua + " " + ban + " " + loinhuan;
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Hang> ds = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            String ten = scanner.nextLine();
            String donvi = scanner.nextLine();
            Long mua = Long.parseLong(scanner.nextLine());
            Long ban = Long.parseLong(scanner.nextLine());

            ds.add(new Hang(i, ten, donvi, mua, ban));
        }
        Collections.sort(ds, new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                if(o1.loinhuan==o2.loinhuan) {
                    return o1.ma.compareTo(o2.ma);
                }
                return Long.compare(o2.loinhuan, o1.loinhuan);
            }
        });
        for (Hang x : ds) {
            System.out.println(x);
        }
    }
}
