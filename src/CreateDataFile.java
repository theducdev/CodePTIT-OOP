import java.io.*;
import java.util.ArrayList;

public class CreateDataFile {
//    public static class Pair implements Serializable, Comparable <Pair> {
//        private int a;
//        private int b;
//
//        public Pair(int a, int b) {
//            this.a = a;
//            this.b = b;
//        }
//        public int compareTo(Pair o) {
//            return this.a - o.getA();
//
//        }
//
//        public int getA() {
//            return a;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//
//        public int getB() {
//            return b;
//        }
//
//        public void setB(int b) {
//            this.b = b;
//        }
//
//        @Override
//        public String toString() {
//            return "(" + a + ", " + b + ")";
//        }
//    }

    public static void main(String[] args) throws IOException {
        ArrayList<Pair> data = new ArrayList<>();
        data.add(new Pair(1,10));
        data.add(new Pair(1,4));
        data.add(new Pair(1,2));
        data.add(new Pair(1,2));
        data.add(new Pair(2,4));
        data.add(new Pair(9,10));
        data.add(new Pair(10,9));
        data.add(new Pair(4,5));


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("DATA.in"))) {
            out.writeObject(data);
        }

        System.out.println("Tệp DATA.in đã được tạo và dữ liệu đã được ghi vào.");
    }
}
