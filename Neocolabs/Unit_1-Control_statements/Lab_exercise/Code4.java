// Write a java program to program for half-diamond pattern printing using numbers and stars.

// Example:

// Input: 4

// Output:

// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 4*4*4*4
// 3*3*3
// 2*2
// 1
// Input format
// The input consists of an integer N.

// Output format
// The output displays the required pattern.

// Code constraints
// 2 <= N <= 15

// Sample testcases
// Input 1
// 4
// Output 1
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 4*4*4*4
// 3*3*3
// 2*2
// 1

import java.util.Scanner;

class Code4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, N;
        N = sc.nextInt();

        for (i = 1; i <= N; i++) {
            k = 1;
            for (j = 0; j < i; j++) {
                System.out.print(i);
                if (k < i) {
                    System.out.print("*");
                    k = k + 1;
                }
            }
            System.out.println();
        }

        for (i = N; i > 0; i--) {
            k = 1;
            for (j = 0; j < i; j++) {
                System.out.print(i);
                if (k < i) {
                    System.out.print("*");
                    k = k + 1;
                }
            }
            System.out.println();
        }
    }
}