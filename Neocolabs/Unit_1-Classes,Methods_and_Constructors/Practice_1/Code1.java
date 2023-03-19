// Write a program to display the day of the week.

// Note: Create a constructor and perform the above task, the object in 
// the main method should pass the value to the constructor.
// Input format

// The input consists of an integer N.
// Output format

// The output displays the day of the week.
// Code constraints

// N < 7
// Sample testcases
// Input 1
// 7
// Output 1
// Saturday

// Input 2
// 0
// Output 2
// Weekend

// Input 3
// 9
// Output 3
// Invalid

import java.util.Scanner;

class Code1 {
    Code1(int day) {
        if (day <= 7) {
            switch (day) {
                case 1:
                    System.out.print("Sunday");
                    break;
                case 2:
                    System.out.print("Monday");
                    break;
                case 3:
                    System.out.print("Tuesday");
                    break;
                case 4:
                    System.out.print("Wednesday");
                    break;
                case 5:
                    System.out.print("Thursday");
                    break;
                case 6:
                    System.out.print("Friday");
                    break;
                case 7:
                    System.out.print("Saturday");
                    break;
                default:
                    System.out.print("Weekend");
                    break;
            }
        } else {
            System.out.print("Invalid");
        }

    }

    public static void main(String s[]) {
        int d;
        Scanner in = new Scanner(System.in);
        d = in.nextInt();
        // Code1 obj = new Code1(d);
        new Code1(d);
        in.close();
    }
}
