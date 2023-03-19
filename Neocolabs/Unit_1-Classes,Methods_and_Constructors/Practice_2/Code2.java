// Create two classes a Box class and a Main class, create an object for 
// the Box class in the Main class, and calculate the volume of the box.
// Input format

// The input consists of the width, height, and depth separated by space.
// Output format

// The output displays the volume of the box.

// If inputs <= 0 then print "Invalid".
// Code constraints

// Inputs (double type).
// Sample testcases

// Input 1
// 7.2 8.0 1.1
// Output 1
// 63.36

// Input 2
// -1.5 -8.5 -88.0
// Output 2
// Invalid

import java.util.*;

class Box {
    double w, h, d;
}

class Code2 {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        Scanner scan = new Scanner(System.in);
        myBox.w = scan.nextDouble();
        myBox.h = scan.nextDouble();
        myBox.d = scan.nextDouble();

        if (myBox.w > 0 && myBox.h > 0 && myBox.d > 0) {
            vol = myBox.w * myBox.h * myBox.d;
            System.out.printf("%.2f", vol);
        } else {
            System.out.println("Invalid");
        }

        scan.close();
    }
}
