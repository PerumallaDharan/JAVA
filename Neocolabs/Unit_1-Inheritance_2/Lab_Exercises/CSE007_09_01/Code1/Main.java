// Write the following code in your editor below:

//     A class named Arithmetic with a method named add that takes  
//     integers as parameters and returns an integer denoting their sum.
//     A class named Adder that inherits from a superclass named 
//     Arithmetic. and a member function callAdd which calls base 
//     class (Arithmetic) add function.

// Your classes should not be be public (except main class).

// the main class is given as hint
// Input format

// num1 num2

// num3 num4
// Output format

// please see the sample output
// Sample testcases
// Input 1

// 2 4
// 9 3

// Output 1

// My superclass is: Arithmetic
// 6 12

//Design a class named Person
//Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Person, Student, Employee, Faculty, and Staff objects
        Person person = new Person("John", "12 Bell street", "3473339999", "john12@aol.com");
        Student student = new Student("Mary", "100 Town Ave", "5149993333", "mary100@aol.com", "freshman");
        Employee employee = new Employee("Mike", "34 West street", "6189999999", "mike80@aol.com", 910, 60000);

        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}