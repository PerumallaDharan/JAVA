// Write a Java program that demonstrates operator overloading 
// for adding numbers and concatenating strings. The program 
// should allow the user to enter two numbers and two strings, and 
// then print the sum of the numbers and the concatenated string.


// The program should consist of three classes: Main, Number, and 
// StringWrapper.


// The Main class should have a main method that prompts the user to 
// enter two numbers and two strings using the Scanner class, creates 
// instances of Number and StringWrapper objects, calls the add method 
// on the objects to perform the addition and concatenation operations 
// and then prints the results.


// The Number class should have a constructor that takes an integer 
// parameter, a getValue method that returns the integer value, and an 
// add method that takes another Number object and returns a new Number 
// object that represents the sum of the two numbers.


// The StringWrapper class should have a constructor that takes a string 
// parameter, a getValue method that returns the string value, and an add 
// method that takes another StringWrapper object and returns a new 
// StringWrapper object that represents the concatenation of the two strings.
// Input format

// The program should prompt the user to enter two numbers and two strings.

// The numbers and strings should be entered on separate lines, with each 
// line containing a single integer or string.
// Output format

// The program should print two lines of output.

// The first line should contain the sum of the two numbers entered by the user.

// The second line should contain the concatenation of the two strings 

// entered by the user. There should be no additional output.
// Code constraints

// The input numbers should be integers.

// The input strings should contain only printable characters.
// The input numbers and strings should not contain whitespace characters 
// (e.g. spaces, tabs, etc.).
// Sample testcases
// Input 1

// 10
// 20
// Good 
// Morning

// Output 1

// 30
// GoodMorning


import java.util.Scanner;
//You are building a 3D modelling software that can calculate the volume of various shapes
//Circle.java
class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
         this.radius = radius;
    }

    public void calculateArea() {
         area = Math.PI * radius * radius;
         System.out.println("Area of circle: " + area);
    }
}
//You are building a 3D modelling software that can calculate the volume of various shapes
// Cylinder.java
class Cylinder extends Circle {
    protected double height;
    protected double volume;

    public Cylinder(double radius, double height) {
         super(radius);
         this.height = height;
    }

    public void calculateVolume() {
         super.calculateArea();
         volume = getArea() * height;
         System.out.println("Volume of cylinder: " + volume);
    }
}
//You are building a 3D modelling software that can calculate the volume of various shapes
//Rectangle.java
class Rectangle{
    public void fnc()
    {
         System.out.println();
    }
}
//You are building a 3D modelling software that can calculate the volume of various shapes
//Shape.java
class Shape {
    protected double area;

    public void calculateArea() {
         System.out.println("Area is not defined.");
    }

    public double getArea() {
         return area;
    }
}
//You are building a 3D modelling software that can calculate the volume of various shapes
//Main.java

public class Code3 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.print("Enter the length of the rectangle: ");
         double length = scan.nextDouble();
         // System.out.print("Enter the width of the rectangle: ");
         // double width = scanner.nextDouble();
         // System.out.print("Enter the radius of the circle: ");
         double radius = scan.nextDouble();
         Cylinder cylinder = new Cylinder(radius, length);
         cylinder.calculateVolume();

         scan.close();
    }
}
