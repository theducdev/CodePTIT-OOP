import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable <SinhVien> {
    private String ma, ten, tengv, doan, lop, email, sdt;

    public SinhVien(String ma, String ten, String lop, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.doan = "";
        this.tengv = "";
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public void setDoan(String doan) {
        this.doan = doan;
    }

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }

    public String getTengv() {
        return tengv;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tengv + " " + doan + " " + " " + sdt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.getMa());
    }
}
public class Bai8_th2 {
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
            a.add(new SinhVien(ma, ten, lop, email, sdt));
        }
        Scanner sc1 = new Scanner(new File("HUONGDAN.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++) {
            String x = sc1.nextLine();
            String so_sv = x.substring(x.length()-1, x.length());
            String ten_gv = x.substring(0, x.length()-2);
            for (int k = 0; k < Integer.parseInt(so_sv); k++) {
                x = sc1.nextLine();
                String ma = x.substring(0, 10);
                String doan = x.substring(11);
                for (SinhVien j : a) {
                    if (j.getMa().equals(ma)) {
                        j.setTengv(ten_gv);
                        j.setDoan(doan);
                    }
                }
            }
        }
        Collections.sort(a);
        for (SinhVien i : a) {
            if (!i.getTengv().equals("")) {
                System.out.println(i);
                System.out.println();
            }
        }
    }
}
