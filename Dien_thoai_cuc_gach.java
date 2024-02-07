
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Dien_thoai_cuc_gach {

    public static int convert(char a) {
        if (a=='A'||a=='B'||a=='C'||a=='a'||a=='b'||a=='c') return 2;
        if (a=='D'||a=='d'||a=='E'||a=='e'||a=='F'||a=='f') return 3;
        if (a=='G'||a=='g'||a=='H'||a=='h'||a=='I'||a=='i') return 4;
        if (a=='J'||a=='j'||a=='K'||a=='k'||a=='L'||a=='l') return 5;
        if (a=='M'||a=='m'||a=='n'||a=='N'||a=='O'||a=='o') return 6;
        if (a=='P'||a=='p'||a=='Q'||a=='q'||a=='R'||a=='r'||a=='S'||a=='s') return 7;
        if (a=='T'||a=='t'||a=='U'||a=='u'||a=='V'||a=='v') return 8;
        if (a=='W'||a=='w'||a=='X'||a=='x'||a=='Y'||a=='y'||a=='Z'||a=='z') return 9; 
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            ArrayList <Integer> num = new ArrayList<>();
            String text = scanner.next();
            for (int i = 0; i < text.length();i++) {
                num.add(convert(text.charAt(i)));
            }
            int check = 1;
            for (int i = 0; i <= text.length()/2;i++) {
                if (num.get(i)!=num.get(text.length()-1-i)) {
                    check = 0;
                    break;
                }
            }

            if (check==1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");

            }
                
            
        }
    }
    
}