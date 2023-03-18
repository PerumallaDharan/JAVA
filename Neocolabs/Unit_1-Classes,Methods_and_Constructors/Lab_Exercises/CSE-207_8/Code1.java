import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        MyPoint p1 = new MyPoint(x1, y1);
        MyPoint p2 = new MyPoint(x2, y2);
        double distance = p1.distance(p2);

        System.out.printf("The distance between (%.1f, %.1f) and (%.1f, %.1f) is: %.2f\n", 
        x1, y1, x2, y2, distance);
        sc.close();
    }
}

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(MyPoint p) {
        double dx = this.x - p.getX();
        double dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {
        MyPoint p = new MyPoint(x, y);
        return this.distance(p);
    }
}
