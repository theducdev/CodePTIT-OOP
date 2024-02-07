public class DoanhNghiep {
    private String ma, ten;
    private int tin;

    public DoanhNghiep(String ma, String ten, int tin) {
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


    @Override
    public String toString() {
        return ma + " " + ten + " " + tin;
    }
}
