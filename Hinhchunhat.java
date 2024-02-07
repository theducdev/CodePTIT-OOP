import java.util.Scanner;
public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dai = scanner.nextInt();
        int rong = scanner.nextInt();
        if (dai < 0 || dai == 0 || rong < 0 || rong == 0) {
            System.out.println("0");
        }
        else {
            System.out.println((dai+rong)*2 + " " + dai*rong);
        }
    }
}
