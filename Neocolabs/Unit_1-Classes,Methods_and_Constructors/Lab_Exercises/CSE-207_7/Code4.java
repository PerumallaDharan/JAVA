// Design a class named Location for locating a maximal value and its location in a two-dimensional array. The class contains public data fields row, column, and maxValue that store the maximal value and its indices in a two-dimensional array with row and column as int types and maxValue as a double type.

// Write the following method that returns the location of the largest element in a two-dimensional array:

// public static Location locateLargest(double[][] a)

// The return value is an instance of Location.

// Write a test program that prompts the user to enter a 
// two-dimensional array and displays the location of the 
// largest element in the array.

// Input format
// <row> <col.>

// [ 2D array]

// please see the sample input

// Output format
// The location of the largest element is <double> at 
// (row, col)
// [Hint: give (row, col) in actual array indexing]
// please see the sample output

// Sample testcases
// Input 1
// 3 4
// 23.5 35 2 10
// 4.5 3 45 3.5
// 35 44 5.5 9.6
// Output 1
// The location of the largest element is 45.0 at (1, 2)
// Input 2
// 3 4
// 23.5 35 2 10
// 4.5 3 45 3.5
// 35 44 5.5 96
// Output 2
// The location of the largest element is 96.0 at (2, 3)

import java.util.Scanner;

class Code4 {
    public static void main(String args[]) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        float a[][] = new float[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                float x = sc.nextFloat();
                a[i][j] = x;
            }
        }
        double max = a[1][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("The location of the largest element is " + max + " at (" + x + ", " + y + ")");
        sc.close();
    }
}