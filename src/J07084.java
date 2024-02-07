import java.io.File;
import java.io.FileNotFoundException;
import java.security.AlgorithmConstraints;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J07084 {
    public static class SinhVien {
        private String hoten;
        private long onl;

        public SinhVien(String hoten, Date bd, Date kt) {
            this.hoten = chuanHoaHoTen(hoten);
            this.onl = (kt.getTime() - bd.getTime())/1000/60;
        }
        public String chuanHoaHoTen(String ten) {
            String[] a = ten.trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String x : a) {
                ans.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
            }
            return ans.toString();
        }

        @Override
        public String toString() {
            return hoten + " " + onl;
        }

        public long getOnl() {
            return onl;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("ONLINE.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        ArrayList <SinhVien> ds = new ArrayList<>();
        for (int i = 1; i<= n; i++) {
            String hoten = scanner.nextLine();
            String bd = scanner.nextLine();
            String kt = scanner.nextLine();
            Date bd1 = df.parse(bd);
            Date kt1 = df.parse(kt);
            ds.add(new SinhVien(hoten, bd1, kt1));

        }
        Collections.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Long.compare(o2.getOnl(), o1.getOnl());
            }
        });
        for (SinhVien x : ds) {
            System.out.println(x);
        }

    }
}
