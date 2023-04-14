// Create an interface ShapeCalculator with the following method

// void calc(int n)

// Create two classes Square and Circle that implement the interface 
// and implement the method in it.

// Calculate the area and perimeter of both squares and circles.

// Input format
// The input contains one integer which is taken as the side of the square 
// as well as the radius of the circle.

// Output format
// The output must contain the area and perimeter of each of the shapes. It 
// must be displayed in two lines where the first line consists of the area 
// and perimeter of the square separated by a space and the second line has 
// the details of the circle in a similar format.
// Details of the square must be calculated in integer type whereas for the 
// circle the calculations must be of double type

// Sample testcases
// Input 1
// 8
// Output 1
// 64 32
// 200.96 50.24

// Whitelist
// interface ShapeCalculator
// class Square
// implements
// class Circle
// void calc(int n) 

import java.util.*;
import java.math.*;

interface ShapeCalculator {
    void calc(int n);
}

class Square implements ShapeCalculator {
    int ar, pr;

    public void calc(int s) {
        ar = s * s;
        pr = 4 * s;
        System.out.print(ar + " " + pr + "\n");
    }
}

class Circle implements ShapeCalculator {
    double ar, pr;
    double pi = 3.14;

    public void calc(int r) {
        ar = Math.round(pi * r * r * 100.0) / 100.0;
        pr = Math.round(2 * pi * r * 100.0) / 100.0;
        System.out.println(ar + " " + pr);
    }
}

class Code3 {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Square sq = new Square();
        sq.calc(n);
        Circle cr = new Circle();
        cr.calc(n);
    }
}