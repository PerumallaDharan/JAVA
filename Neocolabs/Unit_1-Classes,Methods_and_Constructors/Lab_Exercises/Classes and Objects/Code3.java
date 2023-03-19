// Problem Statement

// Develop a Java program that performs various arithmetic operations 
// on two numbers inputted by the user. The program should be implemented 
// using two different class files: Main and Calculator.

// The Main class should contain the main method and be responsible for 
// getting user input for two numbers using the Scanner class, creating an 
// instance of the Calculator class, and calling its methods to perform addition, 
// subtraction, multiplication, division, and modulus operations on the two 
// numbers. The Main class should output the results of these operations to the 
// console.

// The Calculator class should contain methods that perform the various arithmetic 
// operations on two numbers passed as arguments. The Calculator class should have 
// separate methods for addition, subtraction, multiplication, division, and modulus 
// operations, and each method should take two parameters and return the result of 
// the corresponding operation.

// The program should be designed to be modular, with each class responsible for a 
// specific set of tasks. The use of object-oriented concepts such as class and 
// object should be emphasized in the implementation of the program.
// Input format

// The program expects the user to input two decimal numbers, one at a time, using 
// the console.

// Output format

// The program outputs the results of various arithmetic operations performed on 
// the two inputted numbers, using the console. The output should be in the following 
// format:

// Sum: [sum of the two numbers]

// Difference: [difference between the two numbers]

// Product: [product of the two numbers]

// Quotient: [quotient of the two numbers]

// Modulus: [modulus of the two numbers]
// Code constraints

// The input numbers should be decimal numbers.

// The program assumes that the input is valid and doesn't do any input validation. 
// If the user enters invalid input, the program may throw an exception and 
// terminate abruptly.

// The program is designed to work with decimal numbers within the range of the double 
// data type in Java. If the input numbers are outside of this range, the program may 
// produce incorrect results or throw an exception.

// The program assumes that the user inputs only two numbers. If the user inputs more 
// than two numbers or inputs other characters along with the numbers, the program may 
// produce incorrect results or throw an exception.
// Sample testcases
// Input 1

// 5
// 2

// Output 1

// Sum: 7.0
// Difference: 3.0
// Product: 10.0
// Quotient: 2.5
// Modulus: 1.0

// Input 2

// -5
// 2.5

// Output 2

// Sum: -2.5
// Difference: -7.5
// Product: -12.5
// Quotient: -2.0
// Modulus: -0.0

import java.util.Scanner;

// The main class that contains the main method
public class Code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the first number
        // System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get input from the user for the second number
        // System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Create an object of the Calculator class
        Calculator calculator = new Calculator();

        // Call the methods of the Calculator class to perform various operations
        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));
        System.out.println("Quotient: " + calculator.divide(num1, num2));
        System.out.println("Modulus: " + calculator.modulus(num1, num2));
        scanner.close();
    }
}

class Calculator {
    // The methods that perform various calculations
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public double modulus(double num1, double num2) {
        return num1 % num2;
    }
}