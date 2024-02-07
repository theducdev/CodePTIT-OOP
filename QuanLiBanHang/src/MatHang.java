public class MatHang {
    private int ma;
    private String ten, nhom;
    private double gia;

    public MatHang() {
    }

    public MatHang(int ma, String ten, String nhom, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }

    public Object[] toObject() {
        return new Object[]{ma, ten, nhom, gia};
    }

}
