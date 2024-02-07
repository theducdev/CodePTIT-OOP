public class LoaiPhong implements Comparable<LoaiPhong> {
    private String ma, ten;
    private int gia;
    private float phi;

    public LoaiPhong(String line) {
        String[] a = line.trim().split("\\s+");
        this.ma = a[0];
        this.ten = a[1];
        this.gia = Integer.parseInt(a[2]);
        this.phi = Float.parseFloat(a[3]);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public int compareTo(LoaiPhong x) {
        return ten.compareTo(x.getTen());
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + phi;
    }
}
