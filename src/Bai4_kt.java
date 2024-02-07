import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Giangvien {
    private String ma, ten;
    private double gio;

    public Giangvien(String ma, String ten, Double gio ) {
        this.ma = ma;
        this.ten = ten;
        this.gio = gio;
    }

    public String getMa() {
        return ma;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }

    @Override
    public String toString() {
        return ten + String.format("%.2f", gio);
    }
}

public class Bai4_kt {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <Giangvien> ds = new ArrayList<>();
        Scanner sc1 = new Scanner(new File("GIANGVIEN.in"));
        int t = sc1.nextInt();
        sc1.nextLine();
        HashMap <String, String> gv = new HashMap<>();
        ArrayList <String> in = new ArrayList<>();
        while(t-->0) {
            String line = sc1.nextLine();
            String[] a = line.trim().split(" ");
            String ten = "";
            for (int i = 1; i < a.length;i++) {
                ten+=a[i] + " ";
            }
            gv.put(a[0], ten);
            in.add(a[0]);
        }

        Scanner sc2 = new Scanner(new File("GIOCHUAN.in"));
        int q = sc2.nextInt();
        sc2.nextLine();
        HashMap <String, Double> giochuan = new HashMap<>();
        while(q-->0) {
            String line = sc2.nextLine();
            String a[] = line.trim().split(" ");
            if (!giochuan.containsKey(a[0])) {
                giochuan.put(a[0], Double.parseDouble(a[2]));
            }else{
                giochuan.put(a[0], giochuan.get(a[0]) + Double.parseDouble(a[2]));
            }
        }
        for (String x : giochuan.keySet()) {
            ds.add(new Giangvien(x, gv.get(x), giochuan.get(x)));
        }

        for (String x : in) {
            for (Giangvien y : ds) {
                if (x.equals(y.getMa())) {
                    System.out.println(y);
                }
            }
        }


    }
}
