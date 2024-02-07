import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07081 {
    public static class SinhVien {
        private String ma, ho, dem, ten, sdt, email;

        public String getMa() {
            return ma;
        }

        public String getHo() {
            return ho;
        }

        public String getDem() {
            return dem;
        }

        public String getTen() {
            return ten;
        }


        public SinhVien(String ma, String hoten, String sdt, String email) {
            this.ma = ma;
            this.sdt = sdt;
            this.email = email;
            String[] a = hoten.trim().split("\\s+");
            this.ho = "";
            this.dem = "";
            this.ten = "";
            this.ho+=(Character.toUpperCase(a[0].charAt(0)))+(a[0].substring(1).toLowerCase());
            this.ten+=(Character.toUpperCase(a[a.length - 1].charAt(0)))+(a[a.length - 1].substring(1).toLowerCase());

            for (int i = 1; i < a.length-1; i++) {
                this.dem+=(Character.toUpperCase(a[i].charAt(0)))+(a[i].substring(1).toLowerCase()) + " ";
            }

        }
        @Override
        public String toString() {
            return ma + "  " + ho + " " + dem + ten + " " + sdt + " " + email;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("SINHVIEN.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <SinhVien> ds = new ArrayList<>();
        for (int i = 1; i<=n; i++) {
            String ma = scanner.nextLine();
            String hoten = scanner.nextLine();
            String sdt = scanner.nextLine();
            String email = scanner.nextLine();
            ds.add(new SinhVien(ma, hoten, sdt, email));
        }
        Collections.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getTen().equals(o2.getTen())) {
                    if (o1.getHo().compareTo(o2.getHo())==0) {
                        if (o1.getDem().compareTo(o2.getDem())==0) {
                            return o1.getMa().compareTo(o2.getMa());
                        }
                        return o1.getDem().compareTo(o2.getDem());
                    }
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for (SinhVien x : ds) {
            System.out.println(x);
        }
    }
}
