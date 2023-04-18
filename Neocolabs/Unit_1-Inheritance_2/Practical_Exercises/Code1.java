// Area of shape

// Write a program to calculate the area of the circle and 
// rectangle using the overriding concept in java.

// Create a class Shape with the following protected attributes,

// Create the following method in the Shape class,

// Create a class Circle which extends Shape with the following private 
// attributes,

// Override the following method in the Circle class,

// Create a class Rectangle which extends Shape with the following 
// private attributes,

// Override the following method in the Rectangle class,

// Create a class Triangle which extends Shape with the following 
// private attributes,

// Override the following method in the Triangle class,

// Get the option for the shape to compute area and get the attribute 
// according to the shape option. Calculate the area and print the area.

// While printing round off the area to 2 decimal formats.

// Create a driver class Main to test the above classes.

// [Note: Strictly adhere to the object-oriented specifications given as a 
// part of the problem statement.Use the same class names, attribute names 
// and method names]
// Input format

// The first line of the input is an Integer corresponding to the shape.

// The following inputs are Double which corresponds to the shape.

// For Circle(Option 1) get the radius.

// For Rectangle(Option 2) get the length and breadth.

// For Triangle(Option 3) get the base and height.
// Output format

// The output consists area of the shape.

// Refer sample output for formatting specifications.

// Sample testcases

// Input 1
// 1
// 11
// Output 1
// 379.94

// Input 2
// 2
// 10
// 25
// Output 2
// 250.00

// Input 3
// 3
// 15
// 19
// Output 3
// 142.50

// Input 4
// 4
// Output 4
// Invalid Input

// Whitelist
// class Shape
// class Rectangle
// extends
// class Triangle
// public void computeArea()


import java.text.DecimalFormat;
import java.util.*;

class Shape {
    protected double area;

    public void computeArea() {
        area = 0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = 3.14 * (radius * radius);
        System.out.println(d.format(this.area));
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = length * breadth;
        System.out.println(d.format(this.area));
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void computeArea() {
        DecimalFormat d = new DecimalFormat("0.00");
        this.area = 0.5 * base * height;
        System.out.println(d.format(this.area));
    }
}

class Code1 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        if (n == 1) {
            c.setRadius(scan.nextDouble());
            c.computeArea();
        }
        if (n == 2) {
            r.setLength(scan.nextDouble());
            r.setBreadth(scan.nextDouble());
            r.computeArea();
        }
        if (n == 3) {
            t.setBase(scan.nextDouble());
            t.setHeight(scan.nextDouble());
            t.computeArea();
        }
        if (n > 3) {
            System.out.println("Invalid Input");
        }

        scan.close();
    }
}
