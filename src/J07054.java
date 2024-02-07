import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07054 {
    public static class Diem {
        private String ma, ten;
        private float tb;
        public Diem(int i, String ten, float d1, float d2, float d3) {
            if ( i<10) {
                ma = ("SV0" + i + " ");
            }else {
                ma = ("SV" + i + " ");
            }
            this.ten = chuanHoaHoTen(ten);
            this.tb =(float) Math.ceil((d1*3 + d2*3 + d3*2)/8*100)/100;
        }
        public String chuanHoaHoTen(String ten) {
            String[] a = ten.trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String x : a) {
                ans.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
            }
            return ans.toString();
        }

        public String getMa() {
            return ma;
        }

        public float getTb() {
            return tb;
        }

        @Override
        public String toString() {
            return ma + ten + tb;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("BANGDIEM.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList <Diem> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String ten = scanner.nextLine();
            float d1 = Float.parseFloat(scanner.nextLine());
            float d2 = Float.parseFloat(scanner.nextLine());
            float d3 = Float.parseFloat(scanner.nextLine());
            ds.add(new Diem(i, ten, d1, d2, d3));
        }
        Collections.sort(ds, new Comparator<Diem>() {
            @Override
            public int compare(Diem o1, Diem o2) {
                if (o2.getTb()==o1.getTb()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return Float.compare(o2.getTb(), o1.getTb());
            }
        });
        int stt = 1;
        int cnt = 1;
        for (int i = 0; i < n-1; i++) {

            System.out.print(ds.get(i) + " "+  stt);
            if (ds.get(i).getTb() == ds.get(i+1).getTb()) {
                cnt ++;
            }else{
                stt= stt+ cnt;
                cnt = 1;
            }
            System.out.println();
        }
        System.out.print(ds.get(ds.size()-1) + " "+  stt);

    }

}