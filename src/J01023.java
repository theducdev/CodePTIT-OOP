import java.util.ArrayList;
import java.util.Scanner;

public class J01023 {
    public static ArrayList <Integer> gena(String a) {
        ArrayList <Integer> x = new ArrayList<>();
        if (a.charAt(0)=='?' && a.charAt(1)!='?') {
            for (int i = 1; i <= 9; i++) {
                x.add(Integer.parseInt(i +""+ a.charAt(1)));
            }
        }else if(a.charAt(0)!='?' && a.charAt(1)=='?') {
            for (int i = 0; i <= 9; i++) {
                x.add(Integer.parseInt(a.charAt(0)+""+i));
            }
        }else if (a.charAt(0)=='?' && a.charAt(1)=='?') {
            for (int i = 10; i <= 99; i++) {
                x.add(Integer.valueOf(i));
            }
        }else {
            x.add(Integer.valueOf(a));
        }
        return x;
    }

    public static ArrayList <Character> geno(Character o) {
        ArrayList <Character> x = new ArrayList<>();
        if (o =='?') {
            x.add('+');
            x.add('-');
            x.add('*');
            x.add('/');
        }else {
            x.add(o);
        }
        return x;
    }

    public static boolean check(Integer a, Character o, Integer b, Integer kq) {
        if (o=='+') return a+b==kq;
        if (o=='-') return a-b==kq;
        if (o=='*') return a*b==kq;
        if (o=='/') return false;
        return false;
    }

    public static void checkans(ArrayList<Integer> a, ArrayList<Character> o, ArrayList<Integer> b, ArrayList<Integer> kq) {
        int ok = 0;
        for (Integer x : a) {
            for (Character y : o) {
                for (Integer z : b) {
                    for (Integer t : kq) {
                        if (check(x,y,z,t)) {
                            ok = 1;
                            System.out.println(x +" "+ y+" " + z + " = " + t);
                            return;
                        }
                    }
                }
            }
        }
        if (ok ==0) System.out.println("WRONG PROBLEM!");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            String[] x = scanner.nextLine().split(" ");
            ArrayList<Integer> a = gena(x[0]);
            ArrayList<Character> o = geno(x[1].charAt(0));
            ArrayList<Integer> b = gena(x[2]);
            ArrayList<Integer> kq = gena(x[4]);
            checkans(a,o,b,kq);
        }
    }
}
