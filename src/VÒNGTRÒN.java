import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class VÒNGTRÒN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int cnt=0;
        for (int i = 0; i < text.length();i++) {
            int j = text.indexOf(text.charAt((i)), i+1);
//            System.out.println(i+ " "+j);
            if (j!=-1 && j!=i+1 ) {
                for (int p = i+1; p <= j-1; p++) {
                    int q = text.indexOf(text.charAt((p)), j+1 );
                    if (q!=-1) {
                        cnt++;
//                        System.out.println(cnt);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
