public class MonHoc {
    private String ma, ten, ht;

    public MonHoc(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }


    public String getMa() {
        return ma;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + ht;
    }
}
