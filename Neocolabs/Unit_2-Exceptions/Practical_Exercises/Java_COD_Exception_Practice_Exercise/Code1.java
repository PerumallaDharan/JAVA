// Input an integer as dividend, input another integer as 
// divisor and print the result of division. If the divisor 
// is 0, catch the resulting exception and print the message “divide by 0”
// Input format

// The first line of input consists of an integer that represents the dividend

// The second line of input consists of an integer that represents the divisor

// Output format

// The output prints the result of division.

// Refer to the sample input and output for formatting specifications.
// Sample testcases
// Input 1

// 6
// 3

// Output 1

// 2

// Input 2

// 1
// 0

// Output 2

// java.lang.ArithmeticException: / by zero

import java.util.*;

class Code1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        // Enter dividend
        try {
            int dividend = scan.nextInt();
            // Enter divisor
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
