import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Doc_file_van_ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        ArrayList <String> a = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String x = scanner.nextLine();
            a.add(x);
        }
        for (String x : a) {
            System.out.println(x);
        }

    }

}
