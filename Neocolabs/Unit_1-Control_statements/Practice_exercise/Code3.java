// Special Number

// Write a program to find all special numbers between the given range m and 
// n(both inclusive). Assume that m and n are 2-digit numbers. A 2-digit number 
// is said to be a special number if the sum of its digits and the products of its 
// digits is equal to the number itself.

// For example, 19 is a special number.

// The digits in 19 are 1 and 9. The sum of the digits is 10 and the product of the digits is 9.

// 10+9 = 19.  

// Input format
// The input consists of two integers m and n denoting the range.

// Output format
// The output prints the special numbers as shown in the sample output.

// Sample testcases
// Input 1
// 11
// 30
// Output 1
// 19
// 29

import java.util.Scanner;

class Code3 {
    public static void main(String args[]) {
        int n, m, sum = 0, i, pro = 1, sum1, j;
        try (Scanner io = new Scanner(System.in)) {
            m = io.nextInt();
            n = io.nextInt();
            for (i = m; i <= n; i++) {
                j = i;
                int first = i / 10;
                int last = i % 10;
                sum = first + last;
                pro = first * last;
                sum1 = sum + pro;
                if (sum1 == j)
                    System.out.println(sum1);
            }
        }
    }
}