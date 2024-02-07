import java.util.Scanner;

class Gv {
    private String ma, hoten;
    private long phucap, thunhap, heso;

    public Gv(String ma, String hoten, long coban) {
        this.ma = ma;
        this.hoten = hoten;
        String x = ma.substring(0,2);
        if (x.equals("HT")) {
            this.phucap = 2000000;
        }else if(x.equals("HP")) {
            this.phucap = 900000;
        }else {
            this.phucap = 500000;
        }
        this.heso = Long.valueOf(ma.substring(2));
        this.thunhap = this.heso*coban + phucap;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + heso + " " + phucap + " " +thunhap;
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        String hoten = scanner.nextLine();
        long coban = scanner.nextLong();
        System.out.println(new Gv(ma, hoten, coban));
    }


}
