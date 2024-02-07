import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class So_khac_nhau_trong_file_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        int a[] = new int[1001];
        while(scanner.hasNextInt()) {
            a[scanner.nextInt()]++;
        }
        for (int i = 0; i <= 1000; i++) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
            }
        }

    }

}
