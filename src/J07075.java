import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Mh1 {
    private String ma, ten;
    private int tin;

    public Mh1(String ma, String ten, int tin) {
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
}

class LH {
    private String manhom, mamon, ngay, kip, hoten, phong, tenMon;

    public LH(int i, String mamon, String ngay, String kip, String hoten, String phong) {
        this.manhom = "HP" + String.format("%03d", i);
        this.mamon = mamon;
        this.ngay = ngay;
        this.kip = kip;
        this.hoten = hoten;
        this.phong = phong;
    }

    public String getMamon() {
        return mamon;
    }

    public String getNgay() {
        return ngay;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getKip() {
        return kip;
    }

    public String getHoten() {
        return hoten;
    }

    @Override
    public String toString() {
        return manhom + " " + tenMon + " " +  ngay + " " + kip + " " + phong;
    }

    public String timTen(String maMon, ArrayList <Mh1> dsMon) {
        String tenMon = "";
        for (Mh1 i : dsMon) {
            if (i.getMa().equals(maMon)) {
                tenMon = i.getTen();
                break;
            }
        }
        return tenMon;
    }

}




public class J07075 {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("MONHOC.in"));
        int somon = scanner1.nextInt();
        scanner1.nextLine();
        ArrayList <Mh1> dsMon = new ArrayList<>();
        for (int i = 0; i < somon; i++) {
            dsMon.add(new Mh1(scanner1.nextLine(), scanner1.nextLine(), Integer.parseInt(scanner1.nextLine())));
        }
        Scanner scanner2 = new Scanner(new File("LICHGD.in"));
        ArrayList <LH> dsLop = new ArrayList<>();
        int soLop = scanner2.nextInt();
        scanner2.nextLine();
        for (int i = 1; i <= soLop; i++) {
            dsLop.add(new LH(i, scanner2.nextLine(), scanner2.nextLine(), scanner2.nextLine(), scanner2.nextLine(), scanner2.nextLine()));
        }
        String tenGVCanLK = scanner2.nextLine();


        Collections.sort(dsLop, new Comparator<LH>() {
            @Override
            public int compare(LH o1, LH o2) {
                if (o1.getNgay().equals(o2.getNgay())) {
                    if (o1.getKip().equals(o2.getKip())) {
                        o1.getHoten().compareTo(o2.getHoten());
                    }
                    return o1.getKip().compareTo(o2.getKip());
                }
                return o1.getNgay().compareTo(o2.getNgay());
            }
        });
        for (LH i : dsLop) {
            i.setTenMon(i.timTen(i.getMamon(), dsMon));
        }


        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGVCanLK + ":" );
        for (LH i : dsLop) {
            if (i.getHoten().equals(tenGVCanLK)) {
                System.out.println(i);
            }
        }


    }
}
