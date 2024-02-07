import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] used = new int[1000005];
        ArrayList <Integer> ans = new ArrayList<>();
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> ds1 = (ArrayList<Integer>) in1.readObject();
        in1.close();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList <Integer> ds2 = (ArrayList<Integer>) in2.readObject();
        for (Integer x : ds1) {
            if (isValid(x.toString()) && ds2.contains(x)) {
                used[x]++;
            }
        }
        for (Integer x : ds2) {
            if (isValid(Integer.toString(x)) && used[x]!=0) {
                used[x]++;
            }
        }
        in2.close();

        int dem = 0;
        for (int i = 10; i <= 1000000; i++) {
            if (used[i] > 0) {
                System.out.println(i + " " + used[i]);
                dem++;
            }
            if (dem==10) break;
        }
//        for (Integer x : ds1) {
//            if (isValid(Integer.toString(x)) && ds2.contains(x) ) {
//                ans.add(x);
//            }
//        }
//        Collections.sort(ans);
//        for (int i = 0; i < Math.min(10, ans.size() ); i++) {
//            System.out.println(ans.get(i) + " " + used[ans.get(i)]);
//        }

    }
    public static boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }

        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

}
