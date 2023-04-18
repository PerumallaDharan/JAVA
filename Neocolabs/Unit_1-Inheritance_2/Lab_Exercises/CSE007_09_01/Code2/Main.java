// Design a class named Person and its two subclasses named 
// Student and Employee.

// Make Faculty and Staff subclasses of Employee.

// A person has a name, address, phone number, and email address.

// A student has a class status (string: freshman, sophomore, 
// junior, or senior).

// An employee has an office and salary.

// Override the toString method in each class to display the class 
// name and the person’s info / students info / employee info.


// Create a Person (object name: person ) name: "John" address: 
// "12 Bell street",   phone number: "3473339999", and email address: 
// "john12@aol.com"

// Create a Student (object name: student ) name: "Mary", address: 
// "100 Town Ave", phone number: "5149993333", email address: 
// "mary100@aol.com", and status "freshman"

// Create a Employee (object name: employee ) name: "Mike", address: 
// "34 West street", phone number: "6189999999", email address:	
// "mike80@aol.com", office: 910, and salary: 60000


// Input format

// <no input required>'

// create the objects as specified
// Output format

// Please see the sample output
// Sample testcases
// Input 1

// Output 1


// Name: John
// Address: 12 Bell street
// Phone number: 3473339999
// Email address: john12@aol.com

// Name: Mary
// Address: 100 Town Ave
// Phone number: 5149993333
// Email address: mary100@aol.com
// Status: freshman

// Name: Mike
// Address: 34 West street
// Phone number: 6189999999
// Email address: mike80@aol.com
// Office: 910
// Salary: 60000.00

//Write the following code - A class named Arithmetic - A class named Adder
//Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a new Adder object
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        Adder obj = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " +
                obj.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3
        // spaceseparated integers:
        System.out.print(obj.add(x1, y1) + " " + obj.callAdd(x2, y2) + "\n");

        scan.close();
    }
}