import java.text.DecimalFormat;
import java.util.Scanner;

class ThiSinh1 {
    private String ma, hoten, tt;
    private double toan, ly, hoa, uutien, tong;

    public ThiSinh1(String ma, String hoten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.hoten = hoten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if (ma.charAt(2) == '1') {
            this.uutien = 0.5;
        }else if(ma.charAt(2) == '2') {
            this.uutien = 1.0;
        }else {
            this.uutien = 2.5;
        }
        this.tong = toan*2 + ly + hoa;
        if (tong+uutien>=24) {
            this.tt = "TRUNG TUYEN";
        }else {
            this.tt = " TRUOT";
        }
    }

    public void setTt(String tt) {
        this.tt = tt;
    }


    @Override
    public String toString() {
        return ma + " " + hoten + " " + new DecimalFormat("#.#").format(uutien) + " "  + new DecimalFormat("#.#").format(tong) + " " + tt;
    }
}
public class J04013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        String hoten = scanner.nextLine();
        double toan = scanner.nextFloat();
        double ly = scanner.nextFloat();
        double hoa = scanner.nextFloat();
        System.out.println(new ThiSinh1(ma, hoten, toan, ly, hoa));

    }
}
