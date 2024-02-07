import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiaDinh {
    private String ma, hoten;
    private long trong, vuot,thue, tong;

    public GiaDinh(int i, String hoten, String loaiho) {
        this.ma = "KH" + String.format("%02d", i);
        this.hoten = chuanHoaHoTen(hoten);
        String[] a = loaiho.split(" ");
        String loai = a[0];
        long so = Long.parseLong(a[2]) - Long.parseLong(a[1]);
        long dinhmuc = 0;
        if (loai.equals("A")) {
            dinhmuc = 100;
        } else if(loai.equals("B")) {
            dinhmuc = 500;
        }else {
            dinhmuc = 200;
        }
        trong = 0;
        vuot = 0;
        if (so<dinhmuc) {
            trong = so*450;
        }else if(so == dinhmuc) {
            trong = dinhmuc*450;
        }else if (so>dinhmuc) {
            vuot = (so-dinhmuc)*1000;
            trong = dinhmuc*450;
        }
        this.thue = vuot/20;
        this.tong = trong+vuot+thue;
    }

    public String chuanHoaHoTen(String x) {
        String[] a = x.trim().toLowerCase().split("\\s+");
        String hoten = "";
        for (String i : a) {
            hoten+=Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return hoten;
    }

    public long getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + trong + " " + vuot + " " + thue + " " + tong;
    }
}
public class J07056 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("KHACHHANG.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <GiaDinh> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ds.add(new GiaDinh(i, scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(ds, new Comparator<GiaDinh>() {
            @Override
            public int compare(GiaDinh o1, GiaDinh o2) {
                return Long.compare(o2.getTong(), o1.getTong());
            }
        });
        for ( GiaDinh x : ds) {
            System.out.println(x);
        }
    }


}
