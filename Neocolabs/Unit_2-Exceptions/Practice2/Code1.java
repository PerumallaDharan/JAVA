// Divide by zero exception.

// Write a program to obtain two numbers and print their quotient. In case of exception print the same.
// Input format

// Given a single line input separated by space.get the Integer N1 and N2
// Output format

// Display the quotient if there is no Exception.else print the Exception,
// Code constraints

// Integers only.
// Sample testcases
// Input 1

// 44 2

// Output 1

// 22

// Input 2

// 2 0

// Output 2

// java.lang.ArithmeticException: / by zero

// Whitelist
// Set 1:
// try
// Set 2:
// catch
// Set 3:
// Exception
// ArithmeticException 

import java.util.*;

class Code1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);

        try {
            int dividend = scan.nextInt();

            int divisor = scan.nextInt();

            try {
                System.out.println(dividend / divisor);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        scan.close();
    }
}