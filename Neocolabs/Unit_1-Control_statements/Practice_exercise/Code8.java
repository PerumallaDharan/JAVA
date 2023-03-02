// Write a program to generate the first 'n' terms of the following 
// series 6, 11, 21, 36, 56,...

// Input format
// The input is an integer 'n' which denotes the number of terms to be 
// printed in the series.

// Output format
// The output consists of the series separated by space.

// Refer to the sample outputs for the formatting specifications.

// Sample testcases
// Input 1
// 5
// Output 1
// 6 11 21 36 56 
// Input 2
// 6
// Output 2
// 6 11 21 36 56 81 

import java.util.*;

class Code8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 6;
        for (int i = 1; i <= n; i++) {
            System.out.print(j + " ");
            j = j + (5 * i);
        }
        sc.close();
    }
}