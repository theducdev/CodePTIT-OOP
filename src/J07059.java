import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class J07059 {
    public static class CaThi {
        private String ma, phong;
        private Date thoigian;


        public CaThi(String ma, String phong, Date thoigian) {
            this.ma = ma;
            this.phong = phong;
            this.thoigian = thoigian;
        }

        public String getMa() {
            return ma;
        }

        public Date getThoigian() {
            return thoigian;
        }
        @Override
        public String toString() {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return ma + " " + df.format(thoigian) + " " + phong;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("CATHI.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        ArrayList <CaThi> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ma = String.format("C%03d", i);
            String ngay = scanner.nextLine();
            String gio = scanner.nextLine();
            String phong = scanner.nextLine();
            Date thoigian =df.parse(ngay + " " + gio);
            ds.add(new CaThi(ma, phong, thoigian));
        }
        Collections.sort(ds, new Comparator<CaThi>() {
            @Override
            public int compare(CaThi o1, CaThi o2) {
                if (o1.getThoigian().compareTo(o2.getThoigian())==0) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getThoigian().compareTo(o2.getThoigian());
            }
        });

        for (CaThi x : ds) {
            System.out.println(x);
        }
    }
}
