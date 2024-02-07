import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class sv implements Comparable<sv> {
    private String ten;
    private int dung, da;

    public sv(String a, int b, int c) {
        ten = a;
        dung = b;
        da = c;
    }

    public int compareTo(sv a) {
        if (this.dung != a.dung) {
            return  a.dung - this.dung;
        }else if(this.da!=a.da){
            return this.da-a.da;
        }else{
            return this.ten.compareTo(a.ten);
        }
    }
    public String toString() {
        return ten + " " + dung + " " + da;
    }
}

public class Bai10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("LUYENTAP.in"));
        int n = scanner.nextInt();
        List<sv> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            scanner.nextLine();
            ds.add(new sv(scanner.nextLine(), scanner.nextInt(), scanner.nextInt()));
        }
        Collections.sort(ds);
        for (sv a : ds) {
            System.out.println(a);
        }
    }

}
