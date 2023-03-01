// Write a program to find whether the given number is Kaprekar Number or not.

// Note:

// Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. 
// If the resultant sum is k, then k is called a Kaprekar number.

// For example, 9 is a Kaprekar number since 92 = 81 & 8+1=9. and 92 is not a Kaprekar number since 
// 922 = 8464 & 84 + 64 = 148.

// Input format
// The input consists of a single integer.

// Output format
// The output displays whether the given number is Kaprekar Number or not.

// Refer to the sample outputs for the formatting specifications.

// Sample testcases
// Input 1
// 9
// Output 1
// Kaprekar Number
// Input 2
// 92
// Output 2
// Not a Kaprekar Number

import java.util.Scanner;

class Code5 {
    public static void main(String args[]) {
        int k = 1, n = 0, r;
        int s, sum1 = 0, sum2 = 0;
        int c, temp, sum, a = 1;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        temp = k;
        s = k * k;
        sc.close();
        do {
            n++;
            temp /= 10;
        } while (temp > 0);
        for (c = 0; c < n; c++) {
            r = s % 10;
            s = s / 10;
            sum1 = sum1 + r * a;
            a *= 10;
        }
        a = 1;
        while (s > 0) {
            r = s % 10;
            s = s / 10;
            sum2 = sum2 + r * a;
            a *= 10;
        }
        sum = sum1 + sum2;
        if (sum == k) {
            System.out.print("Kaprekar Number");
        } else {
            System.out.print("Not a Kaprekar Number");
        }
    }
}
