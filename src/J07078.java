import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07078 {

    public static boolean sosanh(String a, String b) {
        int i = 0;
        while(i <b.length()) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        if (i==b.length()) return true;
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("STRING.in"));
        int n = scanner.nextInt();
        scanner.nextLine();
        while(n-->0) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            for (int i = 0; i < s1.length()-s2.length()+1; i++) {
                if ((s1.substring(i, s2.length()+i).equals(s2))) {
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }
    }
}
