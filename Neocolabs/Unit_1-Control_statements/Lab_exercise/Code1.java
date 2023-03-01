// Write a program to display the grade of a student. If the mark is > 85 then display 'A', 
// if the mark is > 75 then display 'B', if the mark is > 65 then display 'C', for others display 'D'.

// Note: Use if else statement

// Input format
// The input consists of an integer N.

// Output format
// The output displays the respective grade as shown in the sample output.

// Print Invalid if N<0.

// Sample testcases
// Input 1
// 67
// Output 1
// C
// Input 2
// -50
// Output 2
// Invalid

import java.util.Scanner;

class Code1 {
    public static void main(String args[]) {
        int mark;
        Scanner in = new Scanner(System.in);
        mark = in.nextInt();
        if (mark >= 85) {
            System.out.println("A");
        } else if (mark >= 75) {
            System.out.println("B");
        } else if (mark >= 65) {
            System.out.println("C");
        } else if (mark >= 0) {
            System.out.println("D");
        } else {
            System.out.println("Invalid");
        }
        in.close();
    }
}
