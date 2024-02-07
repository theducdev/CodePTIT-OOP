import java.util.*;
public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            long n = scanner.nextLong();
            long cnt = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    if(i%2==0) cnt++;
                    if(i*i!=n && n/i%2==0) cnt++;
                }
                
            }
            System.out.println(cnt);
        } 

    }
    
}
