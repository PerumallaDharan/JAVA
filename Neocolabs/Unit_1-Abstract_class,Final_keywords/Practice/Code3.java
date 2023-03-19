// Calculate the perimeter of five different geometric shapes and print their sum.

// Sort them in ascending order and print.

// Create an abstract class math with the following methods

// void rectanglePerimeter();

// void squarePerimeter();

// void trianglePerimeter();

// void trapezoidPerimeter();

// void circlePerimeter();

// Create a class perimeter that extends maths and has two more methods

// void calculateSum();

// void sortPerimeter();

// The main method to trigger the above functions.

// The geometric shapes considered are rectangle, square, triangle, trapezoid, and circle.

// Formulas to calculate perimeter :

// Rectangle - 2(length+breadth).

// Square - 4*side.

// Triangle - the sum of all three sides.

// Trapezoid - the sum of all four sides.

// Circle - 2*pi*radius.
// Input format

// The first line of the input consists of the length and breadth.

// The second line consists of the side of the square.

// The third line consists of the three sides of a triangle.

// The fourth line consists of the four sides of a trapezoid.

// The fifth line of the output is the radius of the circle.
// Output format

// The first line of the output prints the perimeter of the rectangle.

// The second line of the output prints the perimeter of the square.

// The third line of the output prints the perimeter of the triangle.

// The fourth line of the output prints the perimeter of the trapezoid.

// The fifth line of the output prints the perimeter of the circle.

// The next line prints the sum of all perimeters.

// The last line prints the perimeter in sorted order.

// Note - There is an extra space at the last line of the output.
// Sample testcases
// Input 1
// 10 12
// 6
// 3 4 6
// 2 4 6 8
// 2
// Output 1
// 44
// 24
// 13
// 20
// 12
// 113
// 12 13 20 24 44 

// Whitelist
// Set 1:
// abstract public void rectanglePerimeter();
// abstract public void squarePerimeter();
// abstract public void trianglePerimeter();
// abstract public void trapezoidPerimeter();
// abstract public void circlePerimeter();
// extends
// class perimeter 

import java.util.*;
import java.lang.Math;

abstract class maths {
    abstract public void rectanglePerimeter();

    abstract public void squarePerimeter();

    abstract public void trianglePerimeter();

    abstract public void trapezoidPerimeter();

    abstract public void circlePerimeter();
}

class perimeter extends maths {
    public int length;
    public int breadth;
    public int side;
    public int t1;
    public int t2;
    public int t3;
    public int tr1;
    public int tr2;
    public int tr3;
    public int tr4;
    public int radius;
    public int[] peri = new int[5];

    public void rectanglePerimeter() {
        this.peri[0] = 2 * (length + breadth);
        System.out.println(this.peri[0]);
    }

    public void squarePerimeter() {
        this.peri[1] = 4 * side;
        System.out.println(this.peri[1]);
    }

    public void trianglePerimeter() {
        this.peri[2] = t1 + t2 + t3;
        System.out.println(this.peri[2]);
    }

    public void trapezoidPerimeter() {
        this.peri[3] = tr1 + tr2 + tr3 + tr4;
        System.out.println(this.peri[3]);
    }

    public void circlePerimeter() {
        this.peri[4] = (int) Math.PI * 2 * radius;
        System.out.println(this.peri[4]);
    }

    public void calculateSum() {
        int sum = 0, i;
        for (i = 0; i < 5; i++) {
            sum += this.peri[i];
        }
        System.out.println(sum);
    }

    public void sortPerimeter() {
        Arrays.sort(this.peri);
        for (int i = 0; i < 5; i++) {
            System.out.print(this.peri[i] + " ");
        }
    }
}

class Code3 {
    public static void main(String[] args) {
        perimeter p = new perimeter();
        Scanner scan = new Scanner(System.in);

        p.length = scan.nextInt();
        p.breadth = scan.nextInt();
        p.rectanglePerimeter();

        p.side = scan.nextInt();
        p.squarePerimeter();

        p.t1 = scan.nextInt();
        p.t2 = scan.nextInt();
        p.t3 = scan.nextInt();
        p.trianglePerimeter();

        p.tr1 = scan.nextInt();
        p.tr2 = scan.nextInt();
        p.tr3 = scan.nextInt();
        p.tr4 = scan.nextInt();
        p.trapezoidPerimeter();

        p.radius = scan.nextInt();
        p.circlePerimeter();

        p.calculateSum();
        p.sortPerimeter();

        scan.close();
    }
}
