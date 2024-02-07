
import java.util.*;
import java.lang.Character;
import java.math.*;
public class Dao_tu {
    public static StringBuilder[] convertToStringBuilderArray(String[] stringArray) {
        StringBuilder[] stringBuilderArray = new StringBuilder[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilderArray[i] = new StringBuilder(stringArray[i]);
        }
        return stringBuilderArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            StringBuilder[] text = convertToStringBuilderArray(scanner.nextLine().split("\\s+"));
            for (int i = 0; i < text.length; i++) {
                System.out.print(text[i].reverse() + " ");
            }
            System.out.println();
            
        }
    }
    
}