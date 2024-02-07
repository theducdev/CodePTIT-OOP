import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Mh {
    private String ma, ten, thi;

    public Mh(String ma, String ten, String thi) {
        this.ma = ma;
        this.ten = ten;
        this.thi = thi;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + thi;
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int t = scanner.nextInt();
        ArrayList <Mh> ds = new ArrayList<>();
        scanner.nextLine();
        while (t-->0) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            String thi = scanner.nextLine();
            ds.add(new Mh(ma, ten, thi));
        }
        Collections.sort(ds, new Comparator<Mh>() {
            @Override
            public int compare(Mh o1, Mh o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for ( Mh x : ds) {
            System.out.println(x);
        }
    }
}
