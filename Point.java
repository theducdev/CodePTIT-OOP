import java.math.*;
import java.util.Scanner;
public class Point {
    private double x, y;

    public Point() {

    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public double distance(Point a) {
        return Math.sqrt(Math.pow(a.x - this.x, 2)+ Math.pow(a.y - this.y, 2)); 

    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2)+ Math.pow(a.y - b.y, 2)); 
    }

    @Override
    public String toString() {
        return  this.x + " " + this.y ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
            Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
            System.out.printf("%.4f" ,distance(a,b));
            System.out.println();
        }
    }


    
}
