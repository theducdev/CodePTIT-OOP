import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Bai10_th2 {
    static class MonHoc {
        private String maMH, tenMH;

        public MonHoc(String maMH, String tenMH) {
            this.maMH = maMH;
            this.tenMH = tenMH;
        }

        public String getMaMH() {
            return maMH;
        }
    }


    static class GiangVien {
        private String maGV, tenGV;

        public GiangVien(String maGV, String tenGV) {
            this.maGV = maGV;
            this.tenGV = tenGV;
        }

        public String getMaGV() {
            return maGV;
        }

        public String getTenGV() {
            return tenGV;
        }
    }

    static class GioChuan {
        private String maGV, maMH;
        private double gio;

        public GioChuan(String maGV, String maMH, double gio) {
            this.maGV = maGV;
            this.maMH = maMH;
            this.gio = gio;
        }

        public String getMaGV() {
            return maGV;
        }

        public String getMaMH() {
            return maMH;
        }

        public double getGio() {
            return gio;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        ArrayList <MonHoc> arr1 = new ArrayList<>();
        ArrayList <GiangVien> arr2 = new ArrayList<>();
        ArrayList <GioChuan> arr3 = new ArrayList<>();
        int t1 = sc1.nextInt();
        sc1.nextLine();
        while(t1-->0) {
            String s = sc1.nextLine();
            arr1.add(new MonHoc(s.substring(0,7), s.substring(8)));
        }
        int t2 = sc2.nextInt();
        sc2.nextLine();
        while(t2-->0) {
            String s = sc2.nextLine();
            arr2.add(new GiangVien(s.substring(0,4), s.substring(5)));
        }

        int t3 = sc3.nextInt();
        sc3.nextLine();
        while(t3-->0) {
            String s = sc3.nextLine();
            double gio = Double.parseDouble(s.substring(13));
            arr3.add(new GioChuan(s.substring(0,4), s.substring(5,12), gio));
        }

        for (GiangVien x : arr2) {
            double k = 0;
            for (GioChuan y : arr3) {
                if (y.getMaGV().equals(x.getMaGV())) {
                    k+=y.getGio();
                }
            }
            System.out.println(x.getTenGV() + " " + String.format("%.2f", k));
        }

    }
}
