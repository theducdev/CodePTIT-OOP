import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07073 {
    public static class MonHoc {
        private String ma, ten, tin, lt, th;

        public MonHoc(String ma, String ten, String tin, String lt, String th) {
            this.ma = ma;
            this.ten = ten;
            this.tin = tin;
            this.lt = lt;
            this.th = th;
        }

        public String getMa() {
            return ma;
        }

        public String getTh() {
            return th;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + tin + " " + lt + " " + th;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <MonHoc> ds = new ArrayList<>();
        for (int i = 1; i<= n; i++) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            String tin = scanner.nextLine();
            String lt = scanner.nextLine();
            String th = scanner.nextLine();
            if (th.charAt(th.length()-1) == 'n') {
                ds.add(new MonHoc(ma, ten, tin , lt, th));
            }
        }
        Collections.sort(ds, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        for (MonHoc x : ds) {
            System.out.println(x);
        }



    }
}
