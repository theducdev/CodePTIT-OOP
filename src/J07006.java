import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList <Integer> ds = (ArrayList<Integer>) in.readObject();
        int[] used = new int[1001];
        for (Integer x : ds){
            used[x]+=1;
        }
        for (int i = 0; i<1001; i++) {
            if (used[i]>0) {
                System.out.println(i + " " + used[i]);
                used[i] = 0;
            }
        }


    }
}
