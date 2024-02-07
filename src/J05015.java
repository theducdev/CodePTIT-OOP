import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Cua {
    private String ma, hoten, donvi;
    private double vantoc;

    public Cua(String hoten, String donvi, String thoidiem) {
        this.ma = tinhMa(hoten, donvi);
        this.hoten = hoten;
        this.donvi = donvi;
        String[] x = thoidiem.split(":");
        int gio = Integer.valueOf(x[0]);
        int phut = Integer.valueOf(x[1]);
        this.vantoc = 120*60/(chuyen(gio,phut)-chuyen(6,0));
    }

    public static String tinhMa(String hoten, String donvi) {
        String[] a = hoten.split(" ");
        String[] b = donvi.split(" ");
        String ans = "";
        for (String x : b) {
            ans+=x.charAt(0);
        }
        for (String x : a) {
            ans+=x.charAt(0);
        }
        return ans;
    }
    public static double chuyen(int gio, int phut) {
        return gio*60+phut;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " +donvi + " " + new DecimalFormat("#.##").format(vantoc)+ " " + "Km/h";
    }

    public double getVantoc() {
        return vantoc;
    }
}

public class J05015 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList <Cua> ds = new ArrayList<>();
        while(n-->0) {
            String hoten = scanner.nextLine();
            String donvi = scanner.nextLine();
            String thoidiem = scanner.nextLine();
            ds.add(new Cua(hoten, donvi, thoidiem));
        }
        Collections.sort(ds, new Comparator<Cua>() {
            @Override
            public int compare(Cua o1, Cua o2) {
                return Double.compare(o2.getVantoc(), o1.getVantoc());
            }
        });

        for (Cua x : ds) {
            System.out.println(x);
        }

    }
}
