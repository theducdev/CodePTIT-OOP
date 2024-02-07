
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

class Nguoi {
    public String ten;
    public Date ns;
    public long tuoi;

    public Nguoi(String ten, String ns) throws ParseException {
        this.ten = ten;
        Date x = new SimpleDateFormat("dd/mm/yyyy").parse(ns);
        Date bd = new Date(2023,12,19);
        long tuoi = TimeUnit.MILLISECONDS.toDays(bd.getTime()-x.getTime());
        this.ns = x;
        this.tuoi = tuoi;
    }

}
public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList <Nguoi> ds = new ArrayList<>();
        while(n-->0) {
            String[] a = scanner.nextLine().split(" ");
            String ten = a[0];
            String ns = a[1];
            ds.add(new Nguoi(ten, ns));
        }
        Collections.sort(ds, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                return Long.compare(o1.tuoi, o2.tuoi);
            }
        });
        for (Nguoi x: ds) {
            System.out.println(x.ten + " " + x.tuoi);
        }
        System.out.println(ds.get(0).ten);
        System.out.println(ds.get(ds.size()-1).ten);
    }
}
