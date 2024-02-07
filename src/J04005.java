import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Ts {
    private String hoten;
    private Date ns;
    private float d1,d2,d3,tong;

    public Ts(String hoten, String ns, float d1, float d2, float d3) throws ParseException {
        this.hoten = chuanHoaHoTen(hoten);
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1+d2+d3;
    }

    private String chuanHoaHoTen(String hoten) {
        String line = hoten.trim().toLowerCase();
        String[] a = line.split("\\s+");
        String ten = "";
        for (int i = 0; i < a.length; i++) {
            ten+=Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1) + " ";
        }
        return ten;

    }

    @Override
    public String toString() {
        return hoten + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.1f", tong);
    }
}

public class J04005 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String ns = scanner.nextLine();
        Float d1 = scanner.nextFloat();
        Float d2 = scanner.nextFloat();
        Float d3 = scanner.nextFloat();
        System.out.println(new Ts(hoten, ns, d1, d2, d3));
    }
}
