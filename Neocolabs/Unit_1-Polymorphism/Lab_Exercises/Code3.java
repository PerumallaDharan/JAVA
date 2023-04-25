// Write a Java program to implement constructor overloading.

// Create a student class with properties like name, dept, and college.

// Create a parametrized constructor such that it takes all 3 
// values to create a student object or just name and dept to create a student object.

// Use appropriate constructors for object creation based on the 
// data provided and print the student details.
// Input format

// The first line of input consists of the total number of inputs

// The second line of input consists of 3 corresponds to name, dept, and college

// The third line of input consists of 2 corresponds to the name and dept
// Output format

// Print the student objects values like name, dept, and college
// Sample testcases
// Input 1

// 2
// Naveen
// ECE

// Output 1

// Name : Naveen
// Dept : ECE
// College : null

// Input 2

// 3
// Shreya
// CSE
// SRMAP

// Output 2

// Name : Shreya
// Dept : CSE
// College : SRMAP

// Whitelist
// Set 1:
// name
// dept
// college 


import java.util.*;

class Student {
    String name;
    String dept;
    String college;

    public Student(String name, String dept, String college) {
        this.name = name;
        this.dept = dept;
        this.college = college;
    }

    public Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void printStudentDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Dept : " + this.dept);
        System.out.println("College : " + this.college);
    }
}

class Code3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // dummy
        Student s1;
        if (n == 2) {
            String name = scan.nextLine();
            String dept = scan.nextLine();
            s1 = new Student(name, dept);
            s1.printStudentDetails();
        } else if (n == 3) {
            String name = scan.nextLine();
            String dept = scan.nextLine();
            String college = scan.nextLine();
            s1 = new Student(name, dept, college);
            s1.printStudentDetails();
        }

        scan.close();
    }
}