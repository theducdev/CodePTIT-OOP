import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Tgian {
    public Long h, m, s;

    public Tgian(Long h, Long m, Long s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <Tgian> ds = new ArrayList<>();
        while (n-->0) {
            long h = scanner.nextLong();
            long m = scanner.nextLong();
            long s = scanner.nextLong();
            scanner.nextLine();
            ds.add(new Tgian(h, m,s));
        }
        Collections.sort(ds, new Comparator<Tgian>() {
            @Override
            public int compare(Tgian o1, Tgian o2) {
                if(o1.h==o2.h) {
                    if (o1.m==o2.m) {
                        return o1.s.compareTo(o2.s);
                    }
                    return o1.m.compareTo(o2.m);
                }
                return o1.h.compareTo(o2.h);
            }
        });
        for (Tgian x : ds) {
            System.out.println(x);
        }
    }
}
