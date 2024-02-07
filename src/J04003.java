import java.math.BigInteger;
import java.util.Scanner;

class PhanSo {
    private BigInteger tu, mau;

    public PhanSo(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

//    private BigInteger gcd(BigInteger a, BigInteger b) {
//        while (a!=BigInteger.ZERO) {
//            BigInteger tmp = a;
//            a = b%a;
//            b = tmp;
//        }
//        return Math.abs(a);
//    }

    public PhanSo rutgon() {
        BigInteger x = tu.gcd(mau);
        return new PhanSo(tu.divide(x), mau.divide(x));
    }
    public PhanSo cong(PhanSo x) {
        BigInteger tuchung = tu.multiply(x.mau).add(x.tu.multiply(mau));
        BigInteger mauchung = x.mau.multiply(mau);
        return new PhanSo(tuchung, mauchung).rutgon();

    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger tu = scanner.nextBigInteger();
        BigInteger mau = scanner.nextBigInteger();
        PhanSo x = new PhanSo(tu, mau);
        System.out.println(x.rutgon());
    }


}
