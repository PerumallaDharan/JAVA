// Design a class named MyPoint to represent a point with x- and y-coordinates. 
// The class contains:

// ■ The data fields x and y that represent the coordinates with getter methods.

// ■ A no-arg constructor that creates a point (0, 0).

// ■ A constructor that constructs a point with specified coordinates.

// ■ A method named distance that returns the distance from this point to a 
// specified point of the MyPoint type.

// ■ A method named distance that returns the distance from this point to 
// another point with specified x- and y-coordinates (round it to two decimal 
// place).
// Input format

// x1 y1

// x2 y2

// <all are double>
// Output format

// The distance between (x1, y1) and (x2, y2) is: <value>


// Sample testcases
// Input 1

// 0 0
// 4 4

// Output 1

// The distance between (0.0, 0.0) and (4.0, 4.0) is: 5.66

// Input 2

// -1 -5
// -10 -20

// Output 2

// The distance between (-1.0, -5.0) and (-10.0, -20.0) is: 17.49

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
