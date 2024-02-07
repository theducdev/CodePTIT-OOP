import java.util.*;
public class Sap_xep_chen {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 1;
        for (int z = 1; z <= t; z++) {
            int n = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt());
            }
            
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ans.add(a.get(i));

                for (int j = i - 1; j >= 0; j--) {
                    if (a.get(i) < ans.get(j)) {
                        ans.set(j + 1, ans.get(j));
                        ans.set(j, a.get(i));
                    } else {
                        break;
                    }
                }

                System.out.print("Buoc " + i + ": ");
                for (int x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
    
}
