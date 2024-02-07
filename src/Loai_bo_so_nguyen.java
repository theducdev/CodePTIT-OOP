import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loai_bo_so_nguyen {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( new File("THISINH.in"));
        ArrayList <String> a = new ArrayList<>();
        while (scanner.hasNext()) {
            String x = scanner.next();
            if (!isInteger(x)) {
                a.add(x);
            }
        }
        Collections.sort(a);
        for (String x : a) {
            System.out.print( x + " ");
        }
    }

    public static boolean isInteger(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
