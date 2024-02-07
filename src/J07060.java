import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Mon1 {
    public String mamon, tenmon, ht;

    public Mon1(String mamon, String tenmon, String ht) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.ht = ht;
    }
}

class Ca1 {
    public String maca, phongthi;
    public String ngaythi;
    public String giothi;

    public Ca1(String ma, String phongthi, String ngaythi, String giothi) throws ParseException {
        this.maca = ma;
        this.phongthi = phongthi;
        this.ngaythi = (ngaythi);
        this.giothi = giothi;
    }

    @Override
    public String toString() {
        return "Ca1{" +
                "maca='" + maca + '\'' +
                ", phongthi='" + phongthi + '\'' +
                ", ngaythi=" + ngaythi +
                ", giothi='" + giothi + '\'' +
                '}';
    }
}
class Lich1 {
    private String maca, manhom, phongthi, tenmon, sosinhvien;
    private Date ngaythi;
    private String giothi;


    public Lich1(String maca, String manhom, String phongthi, String tenmon, String sosinhvien, String ngaythi, String giothi) throws ParseException {
        this.maca = maca;
        this.manhom = manhom;
        this.phongthi = phongthi;
        this.tenmon = tenmon;
        this.sosinhvien = sosinhvien;
        this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
        this.giothi = giothi;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngaythi) + " " + giothi +" "+ phongthi + " " + tenmon + " " + manhom + " " + sosinhvien;
    }
    public String getMaca() {
        return maca;
    }

    public Date getNgaythi() {
        return ngaythi;
    }

    public String getGiothi() {
        return giothi;
    }
}

public class J07060 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in1 = new Scanner(new File("MONTHI.in"));
        int somon = Integer.parseInt(in1.nextLine());
        Map <String, Mon1> dsMon = new HashMap<>();
        for (int i = 0; i< somon; i++) {
            String mamon = in1.nextLine();
            String tenmon = in1.nextLine();
            String ht = in1.nextLine();
            dsMon.put(mamon, new Mon1(mamon, tenmon, ht));
        }
        in1.close();


        Scanner in2 = new Scanner(new File("CATHI.in"));
        int soca = Integer.parseInt(in2.nextLine());
        Map <String, Ca1> dsCa = new HashMap<>();
        for (int i = 0; i< soca; i++) {
            String maca = String.format("C%03d", i+1);
            String ngaythi = in2.nextLine();
            String giothi = in2.nextLine();
            String phongthi = in2.nextLine();
            dsCa.put(maca, new Ca1(maca,phongthi, ngaythi, giothi));
        }
        in2.close();


        Scanner in3 = new Scanner(new File("LICHTHI.in"));
        int sodong = Integer.parseInt(in3.nextLine());
        ArrayList <Lich1> soLich = new ArrayList<>();
        for (int i = 0; i< sodong; i++) {
            String[] x = in3.nextLine().split(" ");
            String maca = x[0];
            String mamon = x[1];
            String manhom = x[2];
            String sosv = x[3];
            soLich.add(new Lich1(maca, manhom, dsCa.get(maca).phongthi, dsMon.get(mamon).tenmon, sosv, dsCa.get(maca).ngaythi, dsCa.get(maca).giothi));
        }
        Collections.sort(soLich, new Comparator<Lich1>() {
            @Override
            public int compare(Lich1 o1, Lich1 o2) {
                if (o1.getNgaythi().equals(o2.getNgaythi())) {
                    if (o1.getGiothi().equals(o2.getGiothi())) {
                        return o1.getMaca().compareTo(o2.getMaca());
                    }
                    return o1.getGiothi().compareTo(o2.getGiothi());
                }
                return o1.getNgaythi().compareTo(o2.getNgaythi());
            }
        });
        for (Lich1 x : soLich) {
            System.out.println(x);
        }


    }

}
