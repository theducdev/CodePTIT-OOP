import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//class SinhVien implements Comparable <SinhVien> {
//    private String ma, ten, lop, email, sdt;
//
//    public SinhVien(String ma, String ten, String lop, String email, String sdt) {
//        this.ma = ma;
//        this.ten = ten;
//        this.lop = lop;
//        this.email = email;
//        this.sdt = sdt;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    @Override
//    public String toString() {
//        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
//    }
//    @Override
//    public int compareTo(SinhVien o) {
//        if (this.lop.equals(o.getLop())) {
//            return this.ma.compareTo(o.getMa());
//        }
//        return this.lop.compareTo(o.getLop());
//    }
//}
public class Bai7_th2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList <SinhVien> a = new ArrayList<>();
        int dem = 0;
        while (scanner.hasNextLine()) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            String sdt = scanner.nextLine();
            sdt = "0" + sdt;
            a.add( new SinhVien(ma, ten, lop, email, sdt));
        }
        Collections.sort(a);
        for (SinhVien x : a) {
            System.out.println(x);
            System.out.println();
        }
    }
}
