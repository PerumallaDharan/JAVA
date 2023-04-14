// Write a simple program to demonstrate the interface.

// Interface details:
// Set the value of the integer as 10 and then call the display function.
// In the display method, obtain the value of the string and display them.
// In the main method, display the integer value.

// Input format
// The input consists of the string.

// Output format
// The first line of the output prints the string.
// The second line prints the integer value which is set as 10.

// Code constraints
// Integers and strings only.

// Sample testcases

// Input 1
// spring
// Output 1
// spring
// 10

// Input 2
// neet
// Output 2
// neet
// 10

// Whitelist
// interface
// implements
// class 


//import java.io.*;
import java.util.Scanner;

interface in1 {
    final int a = 10;

    void display();
}

class Code2 implements in1 {
    public void display() {
        String sr;
        Scanner sc = new Scanner(System.in);
        sr = sc.nextLine();
        System.out.println(sr);
    }

    public static void main(String[] args) {
        Code2 t = new Code2();
        t.display();
        System.out.println(a);
    }
}