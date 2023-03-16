// design a class named Rectangle to represent a rectangle. The class contains:

// ■ Two double data fields named width and height that specify the width 
// and height of the rectangle. The default values are 1 for both width and height.

// ■ A no-arg constructor that creates a default rectangle.

// ■ A constructor that creates a rectangle with the specified width and height.

// ■ A method named getArea() that returns the area of this rectangle.

// ■ A method named getPerimeter() that returns the perimeter.

// create 3 rectangle object Rectangle( ), Rectangle(4, 40), Rectangle(3, 35) 
// and display their length, width, area and perimeter.

// Input format
// <No Input required>

// Output format
// <please see the sample output>

// Sample testcases
// Input 1
// Output 1

//  Rectangle()
// -------------
// Width: 1.0
// Height: 1.0
// Area: 1.0
// Perimeter: 4.0

//  Rectangle(4, 40)
// -------------
// Width: 4.0
// Height: 40.0
// Area: 160.0
// Perimeter: 88.0

//  Rectangle(3, 35)
// -------------
// Width: 3.0
// Height: 35.0
// Area: 105.0
// Perimeter: 76.0

// Class to define a Rectangle
class Rectangle {
    double w, h, a, p;

    // default constructor
    Rectangle() {
        // set default width and height as 1
        w = 1;
        h = 1;
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
    }

    // parameterized constructor to assign width and height
    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
        System.out.println("Width: " + w);
        System.out.println("Height: " + h);
    }

    // method to calculate area
    void area() {
        this.a = h * w;
        System.out.println("Area: " + this.a);
    }

    // method to calculate perimeter
    void perimeter() {
        this.p = (h + w) * 2;
        System.out.println("Perimeter: " + this.p);
    }
}

// Main class to test the Rectangle class
public class Code1 {
    public static void main(String args[]) {
        // Create an object for the default constructor
        System.out.println("Rectangle()");
        System.out.println("-------------");
        Rectangle r = new Rectangle();
        r.area();
        r.perimeter();
        System.out.println();

        // Create an object for the parameterized constructor with values 4 and 40.
        System.out.println("Rectangle(4, 40)");
        System.out.println("-------------");
        Rectangle r1 = new Rectangle(4, 40);
        r1.area();
        r1.perimeter();
        System.out.println();

        // Create an object for the parameterized constructor with values 3 and 35.
        System.out.println("Rectangle(3, 35)");
        System.out.println("-------------");
        Rectangle r2 = new Rectangle(3, 35);
        r2.area();
        r2.perimeter();
        System.out.println();
    }
}
