import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Nv {
    private String ma, hoten, gt, diachi, masothue, ngayki;
    private Date ns;

    public Nv(int i, String hoten, String gt, String ns, String diachi, String masothue, String ngayki) throws ParseException {
        this.ma = String.format("%05d", i);
        this.hoten = chuanHoaHoTen(hoten);
        this.gt = gt;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayki = ngayki;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
    }

    public String chuanHoaHoTen(String hoten) {
        String line = hoten.trim().toLowerCase();
        String[] a = line.split("\\s+");
        String ten = "";
        for (String i : a) {
            ten+=Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return ten;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + gt + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + diachi + " " + masothue + " " + ngayki;
    }
}
public class J04007 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String gt = scanner.nextLine();
        String ns = scanner.nextLine();
        String diachi = scanner.nextLine();
        String masothue = scanner.nextLine();
        String ngayki = scanner.nextLine();
        System.out.println(new Nv(1, hoten, gt, ns, diachi, masothue, ngayki));

    }
}
