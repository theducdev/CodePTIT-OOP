import java.util.*;
public class Tong_uoc_so {
    public static int[] a = new int[2000005];

    public static void sang() {
        
        for (int i = 2; i*i <= 2000000; i++) {
            if (a[i] == 0) {
                for (int j = i*i; j <= 2000000; j+=i) {
                    a[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; i++) {
            if (a[i] == 0) {
                a[i] = i;
            }
        }
    }


    
    public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		sang();
		int n = cin.nextInt();
		long tong =0;
		while(n-->0) {
			int t = cin.nextInt();
			while(t!=1) {
				tong +=a[t];
				t/=a[t];
			}
		}
		System.out.println(tong);
	}

    
}
