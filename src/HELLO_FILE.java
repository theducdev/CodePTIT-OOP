import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HELLO_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Hello.txt"));
        ArrayList <String> ans = new ArrayList<>();
        while (scanner.hasNextLine()) {
            ans.add(scanner.nextLine());
        }
        for (String x : ans) {
            System.out.println(x);

        }
    }
}
