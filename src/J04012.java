import java.util.Scanner;

class NhanVien {
    private String ma, hoten, chuc;
    private long coban, songay, luongthang, thuong, phucap, thunhap;

    public NhanVien(int i, String hoten, String chuc,long coban, long songay) {
        this.ma = "NV" + String.format("%02d", i);
        this.hoten = hoten;
        this.chuc = chuc;
        if (chuc.equals("GD")) {
            this.phucap = 250000;
        }else if (chuc.equals("PGD")) {
            this.phucap = 200000;
        }else if(chuc.equals("TP")) {
            this.phucap = 180000;
        }else {
            this.phucap = 150000;
        }
        this.coban = coban;
        this.luongthang = coban*songay;
        if(songay>=25) {
            this.thuong = luongthang/5;
        }else if (songay >=22 && songay <25) {
            this.thuong = luongthang/10;
        }else {
            this.thuong = 0;
        }
        this.songay = songay;
        this.thunhap = this.luongthang + this.thuong + this.phucap;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + luongthang + " " + thuong + " " + phucap + " " + thunhap;
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        long coban = Long.parseLong(scanner.nextLine());
        long songay = Long.parseLong(scanner.nextLine());
        String chucvu = scanner.nextLine();
        System.out.println(new NhanVien(1, hoten, chucvu,coban, songay));
    }
}
