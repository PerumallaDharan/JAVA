// Suppose you are the manager of a retail store and you need to 
// manage the details of your employees. You want to create a Java 
// program that can store the personal details of each employee, such 
// as their name and age, as well as their job-related details such 
// as their employee ID and monthly salary.


// You want to use inheritance in your program to make the code more 
// organized and maintainable.


// You create a Person class that defines the common attributes of a 
// person, an Employee class that extends the Person class and adds the 
// employee-specific attributes, and Main class that contains the main() 
// method that prompts the user to input the details of a new employee, 
// creates a new Employee object with those details, and displays the 
// details of that employee.


// For example:


// Suppose you have just hired a new employee, John. He is 25 years old, 
// and his employee ID is 5678. He will be working in the warehouse 
// department and his monthly salary will be $3000. Using the Java 
// program you created, please input these details for John and display 
// them in a readable format.
// Input format

// The first line of the input is a string representing the employee's 
// name

// The second line of the input is an integer value representing the 
// employee's age

// The third line of the input is a string representing the employee's ID

// The fourth line of the input is the double value representing the 
// employee's monthly salary
// Output format

// The output prints a formatted string containing the employee's name, 
// age, ID, and salary.
// Code constraints

// The name string must contain only alphabetical characters, spaces, 
// and dashes.

// The ID string must contain only alphanumeric characters and underscores.

// The salary must be a non-negative value.

// All input values must be within the specified ranges.
// Sample testcases
// Input 1

// John Smith
// 25
// JSM5678
// 100000

// Output 1

// Name: John Smith
// Age: 25
// Employee ID: JSM5678
// Salary: 100000.0


import java.util.Scanner;
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//Number.java
class Number {
    private int value;

    public Number(int value) {
         this.value = value;
    }

    public Number add(Number num) {
         return new Number(this.value + num.value);
    }

    public int getValue() {
         return value;
    }
}
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//StringWrapper.java
class StringWrapper {
    private String value;

    public StringWrapper(String value) {
         this.value = value;
    }

    public StringWrapper add(StringWrapper str) {
         return new StringWrapper(this.value + str.value);
    }

    public String getValue() {
         return value;
    }
}
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//Main.java

public class Code4 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.print("Enter two numbers: ");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         Number n1 = new Number(num1);
         Number n2 = new Number(num2);
         System.out.println(n1.add(n2).getValue());
         // System.out.print("Enter two strings: ");
         String str1 = scan.next();
         String str2 = scan.next();
         StringWrapper s1 = new StringWrapper(str1);
         StringWrapper s2 = new StringWrapper(str2);
         System.out.println(s1.add(s2).getValue());

         scan.close();
    }
}