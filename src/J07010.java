import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class J07010 {
    public static class SinhVien {
        private String ma, ten, lop;
        private Date ns;
        private float gpa;

        public SinhVien (int i, String ten, String lop, String ns, float gpa) throws ParseException {
            this.ma = "B20DCCN";
            if ( i > 0 && i < 10) {
                this.ma+=("00" + i);
            }else {
                this.ma+="0" + i;
            }
            this.ten = ten;
            this.lop = lop;
            this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
            this.gpa = gpa;

        }

        @Override
        public String toString() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String ngaySinhFormatted = dateFormat.format(ns);
            return ma + " " + ten + " " + lop + " " + ngaySinhFormatted + " " + String.format("%.2f", gpa);
        }
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("SV.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <SinhVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String ns = scanner.nextLine();
            float gpa = Float.parseFloat(scanner.nextLine());
            ds.add(new SinhVien(i, ten, lop, ns, gpa));
        }
        for ( SinhVien x : ds) {
            System.out.println(x);
        }
    }
}
