import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J01020 {



    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-->0) {
            int nn = scanner.nextInt();
            scanner.nextLine();
            Map<Character, Integer> mp = new HashMap<>();
            int i = 1;
            int cnt = 0;
            int n = 0+nn;
            int ans = 0;
            if (nn==0) {
                System.out.println("Impossible");
            }
            else {
                while(1>0) {

                    String a = Integer.toString(n);
                    for (int j = 0; j < a.length(); j++) {
                        mp.put(a.charAt(j), mp.getOrDefault(a.charAt(j), 0)+1);
                    }
//                    System.out.println(n + " "+  mp.size());
                    cnt+=1;
                    if (mp.size()==10) break;
                    i+=1;
                    n = nn*i;
                    ans = Math.max(ans, n);
                }
                System.out.println(ans);
            }
        }
    }
}
