// You are building a 3D modeling software that can calculate the 
// volume of various shapes. You need to implement a program in Java 
// that uses multilevel inheritance to calculate the volume of a 
// cylinder. The program should take input from the user for the 
// length and width of a rectangle and the radius of a circle, and 
// use these dimensions to calculate the volume of a cylinder with a given height.


// To solve this problem, you need to create five classes: Main, 
// Shape, Circle, and Cylinder.


// Main class:

//     Contains the main method to start the program.

//     Takes input from the user for length, width, radius, and height.

//     Creates an object of Cylinder with the input values.

//     Calls the calculateVolume() method of the Cylinder object to 
//     calculate and print the volume of the cylinder.


// Shape class:

//     Defines a protected field area to store the area of a shape.

//     Defines a virtual method calculateArea() to calculate the area 
//     of a shape.


//  Circle class (subclass of Shape):

//     Has a field radius representing the radius of a circle.

//     Overrides the calculateArea() method to calculate and store 
//     the area of the circle.


// Cylinder class (subclass of Circle):

//     Has a field height representing the height of a cylinder.

//     Overrides the calculateVolume() method to calculate the volume 
//     of the cylinder by calling the calculateArea() method of its 
//     superclass Circle to calculate and store the area of the base 
//     of the cylinder, then multiplying the base area by the height.


// Your program should be a multi-file program with no menu-driven 
// interface, and the main class should be called Main.
// Input format

// The user should enter the height of the cylinder.

// The user should input a positive integer radius representing the 
// radius of a circle.
// Output format

// The first line of the output prints the area of the circle.

// The second line of the input prints the volume of the cylinder.
// Code constraints

// All input integers are positive integers.

// The value of length, width, radius, and height is not greater than 10^3.

// The value of the radius should be at least 1.

// The value of length should be at least 1.
// Sample testcases
// Input 1

// 4
// 2

// Output 1

// Area of circle: 12.566370614359172
// Volume of cylinder: 50.26548245743669


import java.util.Scanner;
//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Employee.java
class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
         super(name, age);
         this.employeeId = employeeId;
         this.salary = salary;
    }

    public void display() {
         super.display();
         System.out.println("Employee ID: " + employeeId);
         System.out.println("Salary: " + salary);
    }
}
//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Person.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
         this.name = name;
         this.age = age;
    }

    public void display() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
    }
}
//Suppose you are the manager of a retail store and you want to manage the details of your employees
//Main.java

public class Code2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.print("Enter employee name: ");
         String name = scan.nextLine();
         // System.out.print("Enter employee age: ");
         int age = scan.nextInt();
         scan.nextLine();
         // System.out.print("Enter employee ID: ");
         String employeeId = scan.nextLine();
         // System.out.print("Enter employee salary: ");
         double salary = scan.nextDouble();
         Employee employee = new Employee(name, age, employeeId, salary);
         employee.display();

         scan.close();
    }
}