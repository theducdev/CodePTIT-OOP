import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("THISINH.in"));
        while(scanner.hasNextLine()) {
            String[] hoten = scanner.nextLine().trim().split("\\s+");
            if (hoten[0].equals("END")) break;
            StringBuilder word = new StringBuilder();
            for (String x : hoten) {
                word.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1).toLowerCase()).append(" ");
            }
            System.out.println(word);

        }

    }

}
