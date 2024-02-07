import java.util.Scanner;

//class Point {
//    private double x,y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    public double distance(Point a) {
//        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
//    }
//    public double distance(Point a, Point b) {
//        return a.distance(b);
//    }
//
//    @Override
//    public String toString() {
//        return x + " " + y;
//    }
//}
public class J04009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            double d = scanner.nextDouble();
            double e = scanner.nextDouble();
            double f = scanner.nextDouble();
            Point x = new Point(a, b);
            Point y = new Point(c, d);
            Point z = new Point(e, f);
            double xy = x.distance(y);
            double yz = y.distance(z);
            double xz = x.distance(z);
            if (xy+yz>xz && yz + xz>xy && xy+xz>yz) {
                System.out.println(String.format("%.2f",0.25*(Math.sqrt((xy+yz+xz)*(xy+yz-xz)*(yz-xy+xz)*(xz+xy-yz)))));
            }else {
                System.out.println("INVALID");
            }
        }
    }
}
