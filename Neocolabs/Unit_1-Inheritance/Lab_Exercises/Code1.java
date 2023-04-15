// Write a program such that it should have three classes, Person and 
// Student and the Main class where Person is the base class and Student is the derived class.

// Student class should have the following:
// A Student class constructor, which has parameters:
// A string, firstName.
// A string, lastName.
// An integer, id.
// An integer array of test scores.
// A char calculate()﻿ method that calculates a Student object's average 
// and returns the grade character representative of their calculated average:

// Input format
// Input to get :
// A string representing the firstName in the first line.
// A string representing the lastName in the second line.
// An integer, id in the third line.
// A number of test scores are in the fourth line.
// An integer array of test scores is separated by a single space in the last line.

// Output format
// Display the output with Name, ID and Grade.

// Sample testcases

// Input 1
// Shruthi
// Ramesh
// 50
// 5
// 70 80 90 87 99
// Output 1
// Name: Ramesh Shruthi
// ID: 50
// Grade: E

// Whitelist
// class Person
// extends
// class Student
// char calculate() 


// import java.io.*;
// import java.util.*;
import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + " " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;

    }

    char calculate() {
        int i, sum = 0, avg;
        char grade;
        for (i = 0; i < testScores.length; i++)
            sum += testScores[i];
        avg = sum / testScores.length;

        if (avg <= 100 && avg >= 90)
            grade = 'O';
        else if (avg >= 80 && avg < 90)
            grade = 'E';
        else if (avg >= 70 && avg < 80)
            grade = 'A';
        else if (avg >= 55 && avg < 70)
            grade = 'P';
        else if (avg >= 40 && avg < 55)
            grade = 'D';
        else
            grade = 'T';

        return grade;
    }
}

class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
