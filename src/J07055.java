import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07055 {
    public static class Diem {
        private String ma, ten, xl;
        private float tb;
        public Diem(int i, String ten, float d1, float d2, float d3) {
            if ( i<10) {
                ma = ("SV0" + i + " ");
            }else {
                ma = ("SV" + i + " ");
            }
            this.ten = chuanHoaHoTen(ten);
            this.tb =Float.parseFloat(String.format("%.2f",d1*25/100 + d2*35/100 + d3*40/100));
            if (this.tb < 5) {
                xl = "KEM";
            }else if(this.tb < 6.5) {
                xl = "TRUNG BINH";
            }else if (this.tb < 8) {
                xl = "KHA";
            }else {
                xl = "GIOI";
            }
        }
        public String chuanHoaHoTen(String ten) {
            String[] a = ten.trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String x : a) {
                ans.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
            }
            return ans.toString();
        }
        public float getTb() {
            return tb;
        }

        public String toString() {
            return ma + ten + String.format("%.2f", getTb()) + " " + xl;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("BANGDIEM.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Diem> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = scanner.nextLine();
            float d1 = Float.parseFloat(scanner.nextLine());
            float d2 = Float.parseFloat(scanner.nextLine());
            float d3 = Float.parseFloat(scanner.nextLine());
            ds.add(new Diem(i, ten, d1, d2, d3));
        }
        Collections.sort(ds, new Comparator<Diem>() {
            @Override
            public int compare(Diem o1, Diem o2) {
                return Float.compare(o2.getTb(), o1.getTb());
            }
        });
        for ( Diem x : ds) {
            System.out.println(x);
        }

    }



}
