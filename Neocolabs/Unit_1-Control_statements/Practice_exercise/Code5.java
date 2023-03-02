// Write a Java program to find the sum of digits till the sum is single digits.

// Example:-

// 123 => (1+2+3) => 6

// Input format
// The input consists of an integer N.

// Output format
// The output displays the sum of the integer.

// Code constraints
// Add the digits till the sum is a single digit.

// 2 <= N <= 1000000

// Sample testcases
// Input 1
// 1235
// Output 1
// 2

import java.util.*;

class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig, sum;
        do {
            sum = 0;
            while (num != 0) {
                dig = num % 10;
                sum += dig;
                num /= 10;
            }
            num = sum;
        } while (num / 10 != 0);
        System.out.println(sum);
        sc.close();
    }
}