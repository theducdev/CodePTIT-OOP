import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Khach_hang {
    String ma, ten, sophong;
    Date den, di;
    long dichvu;
    long tongtien;
    long[] gia = {25, 34, 50, 80};

    public Khach_hang(int i, String ten, String sophong, String den, String di, long dichvu) throws ParseException {
        if (i < 10) {
            this.ma = "KH0" + i;
        }else {
            this.ma = "KH" + i;
        }
        this.ten = normalizeName(ten);
        this.sophong = sophong;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
        this.dichvu = dichvu;
        this.tongtien = (dichvu + calculateTime(this.den, this.di) * gia[(sophong.charAt(0)-'0'-1)]);
    }

    private long calculateTime(Date checkIn, Date checkOut) {
        long in = checkIn.getTime();
        long out = checkOut.getTime();
        return  ((out - in) / (1000 * 60 * 60 * 24)) + 1;
    }

    private String normalizeName(String s) {
        String[] words = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i != words.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public long getTongtien() {
        return tongtien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sophong + " " + calculateTime(den, di) +  " " + tongtien;
    }


}
