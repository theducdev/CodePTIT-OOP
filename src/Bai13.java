import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("MONHOC.in"));
        ArrayList <MonHoc> ds = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            String ht = scanner.nextLine();
            MonHoc x = new MonHoc(ma, ten, ht);
            ds.add(x);
        }
        Collections.sort(ds, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        System.out.println(ds.get(0));
        for (int i = 1; i < ds.size(); i++) {
            if (!ds.get(i).getMa().equals(ds.get(i-1).getMa())) {
                System.out.println(ds.get(i));
            }
        }

    }
}
