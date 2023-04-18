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
