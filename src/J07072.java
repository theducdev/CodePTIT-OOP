import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07072 {
    public static class HoTen {
        private String ho, dem, ten;
        public HoTen (String ten) {
            String[] a = ten.trim().split("\\s+");
            this.ho = "";
            this.dem = "";
            this.ten = "";
            this.ho+=(Character.toUpperCase(a[0].charAt(0)))+(a[0].substring(1).toLowerCase());
            this.ten+=(Character.toUpperCase(a[a.length - 1].charAt(0)))+(a[a.length - 1].substring(1).toLowerCase());

            for (int i = 1; i < a.length-1; i++) {
                this.dem+=(Character.toUpperCase(a[i].charAt(0)))+(a[i].substring(1).toLowerCase()) + " ";
            }
        }

        public String getHo() {
            return ho;
        }

        public String getDem() {
            return dem;
        }

        public String getTen() {
            return ten;
        }

        @Override
        public String toString() {
            return ho + " " + dem + ten;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner( new File("DANHSACH.in"));
        ArrayList <HoTen> ds= new ArrayList<>();
        while(scanner.hasNextLine()) {
            ds.add(new HoTen(scanner.nextLine()));
        }
        Collections.sort(ds, new Comparator<HoTen>() {
            @Override
            public int compare(HoTen o1, HoTen o2) {
                if (o1.getTen().compareTo(o2.getTen())==0) {
                    if (o1.getHo().compareTo(o2.getHo())==0) {
                        return o1.getDem().compareTo(o2.getDem());
                    }
                    return o1.getHo().compareTo(o2.getHo());
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });

        for (HoTen x : ds) {
            System.out.println(x);
        }
    }
}
