
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Bien_so_dep {
    public static boolean tangChat(ArrayList <Integer> num) {
        for (int i = 0; i < 4; i++) {
            if (num.get(i) >= num.get(i+1)) return false;
        }
        return true;
    }
    public static boolean bangNhau(ArrayList <Integer> num) {
        for (int i = 0; i < 4; i++) {
            if (num.get(i) != num.get(i+1)) return false;
        }
        return true;
    }
    public static boolean baDauBangNhau(ArrayList <Integer> num) {
        if (num.get(0) != num.get(1) || num.get(2) != num.get(1)) return false;
        if (num.get(3) != num.get(4)) return false;
        return true;
    }
    public static boolean sauHoacTam(ArrayList <Integer> num) {
        for (int i = 0; i < 5; i++) {
            if (num.get(i)!=6 && num.get(i)!=8) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();            
        scanner.nextLine();            
        while(t-->0) {
            String text = scanner.next();
            ArrayList <Integer> nums = new ArrayList<>();
            nums.add(text.charAt(5) -'0');
            nums.add(text.charAt(6) -'0');
            nums.add(text.charAt(7) -'0');
            nums.add(text.charAt(9) -'0');
            nums.add(text.charAt(10) -'0');
            if (tangChat(nums) || bangNhau(nums) ||baDauBangNhau(nums) ||sauHoacTam(nums)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");

            }



            
            
        }
    }
    
}