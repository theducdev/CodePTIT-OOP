import java.util.*;
import java.math.*;
public class Hinh_vuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> x = new ArrayList<>();
        ArrayList <Integer> y = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        Collections.sort(x);
        Collections.sort(y);
        int maxNum = Math.max(x.get(3) - x.get(0), y.get(3) - y.get(0));
        System.out.println(maxNum*maxNum);
    }

    
}
