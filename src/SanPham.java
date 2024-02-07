public class SanPham {
    private String ma, ten, nhom;
    private float mua, ban;
    private float loinhuan;

    public SanPham(int i, String ten, String nhom, float mua, float ban) {
        if (i < 10) {
            this.ma = "MH0" + i;
        }else{
            this.ma = "MH" + i;
        }
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
        this.loinhuan = ban - mua;
    }

    public float getLoinhuan() {
        return loinhuan;
    }


    @Override
    public String toString() {
        return ma + " " + ten + "  " + nhom + " " + String.format("%.2f", loinhuan);
    }
}
