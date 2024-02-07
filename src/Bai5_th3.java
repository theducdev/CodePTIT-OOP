import java.util.Scanner;
import java.util.Stack;

public class Bai5_th3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            int n = scanner.nextInt();
            String arr[] = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            Stack <Long> st = new Stack<>();
            for (int i = arr.length-1; i>=0; i--) {
                if(arr[i].equals("+")) {
                    Long a = st.peek();
                    st.pop();
                    Long b = st.peek();
                    st.pop();
                    st.push(a+b);
                }
                else if(arr[i].equals("-")) {
                    Long a = st.peek();
                    st.pop();
                    Long b = st.peek();
                    st.pop();
                    st.push(a-b);
                }
                else if(arr[i].equals("*")) {
                    Long a = st.peek();
                    st.pop();
                    Long b = st.peek();
                    st.pop();
                    st.push(a*b);
                }
                else if(arr[i].equals("/")) {
                    Long a = st.peek();
                    st.pop();
                    Long b = st.peek();
                    st.pop();
                    st.push(a/b);
                }
                else {
                    st.push(Long.valueOf(arr[i]));
                }
            }
            System.out.println(st.peek());
        }
    }
}
