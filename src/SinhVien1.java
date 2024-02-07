import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien1 {

    private String ma, ten, lop;
    private Date ns;
    private float gpa;

    public SinhVien1 (int i, String ten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN";
        if ( i > 0 && i < 10) {
            this.ma+=("00" + i);
        }else {
            this.ma+="0" + i;
        }
        this.ten = ten;
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;

    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngaySinhFormatted = dateFormat.format(ns);
        return ma + " " + ten + " " + lop + " " + ngaySinhFormatted + " " + String.format("%.2f", gpa);
    }

}
