import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class ThiSinh {
    private String ma, hoten, xeploai;
    private int diem;
    private long tuoi;

    public ThiSinh(int i, String hoten, String ns, float lt, float th) {
        if (i< 10) {
            this.ma="PH0" + i;
        }else {
            this.ma="PH" + i;
        }
        this.hoten = chuanHoaHoTen(hoten);
        this.tuoi = tinhTuoi(ns);
        float diemthuong = 0;
        if (lt >=8 && th>=8) diemthuong = 1;
        else if (lt >= 7.5 && th>=7.5) diemthuong = 0.5f;
        this.diem =(int) Math.min(Math.round((lt+th)/2 + diemthuong), 10);
        if (this.diem <5) {
            this.xeploai = "Truot";
        } else if (this.diem <=6) {
            this.xeploai = "Trung binh";
        } else if (this.diem == 7) {
            this.xeploai = "Kha";
        } else if (this.diem == 8) {
            this.xeploai = "Gioi";
        } else if (this.diem == 9 || this.diem == 10) {
            this.xeploai = "Xuat sac";
        }
    }


    public long tinhTuoi(String dob) {
        int namSinh = Integer.parseInt(dob.substring(dob.length()-4));
        return 2021 - namSinh;
    }
    public String chuanHoaHoTen(String x) {
        String[] a = x.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (String i : a) {
            ans.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1).toLowerCase()).append(" ");
        }
        return ans.toString();
    }

    @Override
    public String toString() {
        return ma + " " + hoten +" " + (tuoi) + " " + diem + "  " + xeploai;
    }
}
public class Xet_tuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("XETTUYEN.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <ThiSinh> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++ ) {
            String hoten = scanner.nextLine();
            String ns = scanner.nextLine();
            Float lt = Float.parseFloat(scanner.nextLine());
            Float th = Float.parseFloat(scanner.nextLine());
            ThiSinh x = new ThiSinh(i, hoten, ns, lt, th);
            ds.add(x);
        }
        for (ThiSinh x : ds) {
            System.out.println(x);
        }

    }


}
