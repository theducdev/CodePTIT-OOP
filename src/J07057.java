import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ts1 {
    private String ma, ten, tt;
    private Double diem;

    public Ts1(int i, String ten, Double diem, String dantoc, int kv) {
        double uu = 0;
        if (kv==1) {
            uu+=1.5;
        }else if(kv==2) {
            uu+=1;
        }
        if (!dantoc.equals("Kinh")) {
            uu+=1.5;
        }
        this.ma ="TS" + String.format("%02d", i);
        this.ten = chuanHoaHoTen(ten);
        this.diem = diem+uu;
        if (this.diem < 20.5) {
            tt = "Truot";
        }else {
            tt = "Do";
        }
    }
    public String chuanHoaHoTen(String x) {
        String[] a = x.trim().toLowerCase().split("\\s+");
        String hoten = "";
        for (String i : a) {
            hoten+=Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return hoten.trim();
    }

    public String getMa() {
        return ma;
    }

    public Double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return ma + " " + ten +" " + String.format("%.1f", diem) + " " + tt;
    }
}
public class J07057 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <Ts1> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ds.add(new Ts1(i, scanner.nextLine(), Double.parseDouble(scanner.nextLine()), scanner.nextLine(), Integer.parseInt(scanner.nextLine()) ));
        }
        Collections.sort(ds, new Comparator<Ts1>() {
            @Override
            public int compare(Ts1 o1, Ts1 o2) {
                if (o2.getDiem()==o1.getDiem()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return Double.compare(o2.getDiem(), o1.getDiem());
            }
        });
        for (Ts1 x : ds) {
            System.out.println(x);
        }
    }
}
