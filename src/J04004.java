import java.math.BigInteger;
import java.util.Scanner;



public class J04004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger tu1 = scanner.nextBigInteger();
        BigInteger mau1 = scanner.nextBigInteger();
        BigInteger tu2 = scanner.nextBigInteger();
        BigInteger mau2 = scanner.nextBigInteger();
        PhanSo x1 = new PhanSo(tu1, mau1);
        PhanSo x2 = new PhanSo(tu2, mau2);
        System.out.println(x1.cong(x2));
    }
}
