// Create an abstract class Shape with the following methods

// abstract void rectangleArea();

// abstract void squareArea();

// abstract void circleArea();

// Create a class Area that extends Shape that calculates 
// and prints all the area.

// Create a Main class, get the inputs, and pass it to the 
// methods.
// Input format

// The first line of the input consists of the length and 
// breadth.

// The second line consists of the side.

// The third line consists of the radius.
// Output format

// The output prints the area of a rectangle, square, and circle.

// Refer sample input and output for formatting specifications.

// Note: Round off the area of the circle to two decimal places.
// Sample testcases
// Input 1
// 10 20
// 4
// 5
// Output 1
// 200
// 16
// 78.54

import java.util.*;
import java.text.*;

abstract class Shape {
    abstract void rectangleArea(int l, int b);

    abstract void squareArea(int s);

    abstract void circleArea(int r);
}

class Area extends Shape {
    public void rectangleArea(int l, int b) {
        System.out.println(l * b);
    }

    public void squareArea(int s) {
        System.out.println(s * s);
    }

    public void circleArea(int r) {
        DecimalFormat d = new DecimalFormat("0.00");
        double res = Math.PI * r * r;
        System.out.println(d.format(res));
    }
}

class Code1 {
    public static void main(String[] args) {
        int length, breadth, radius, side;
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        breadth = scan.nextInt();
        side = scan.nextInt();
        radius = scan.nextInt();
        Area a = new Area();
        a.rectangleArea(length, breadth);
        a.squareArea(side);
        a.circleArea(radius);

        scan.close();
    }
}
