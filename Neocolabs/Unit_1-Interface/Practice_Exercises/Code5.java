// Create an interface that has the following method:
// void diagonalsMinMax(int a[][]);
// In the main method, find the smallest and largest elements in the diagonals.

// Note: Only square matrix.

// Input format
// Input to get the size N of the matrix in the first line, then get the N*N 
// elements in the following lines.

// Output format
// The output prints the smallest and largest elements in the diagonals.

// Code constraints
// N - Integer type.

// Sample testcases

// Input 1
// 5
// 7 8 9 0 1
// 2 3 4 5 6
// 5 4 2 0 8
// 23 5 6 8 9
// 12 5 6 7 32
// Output 1
// Smallest Element - 1: 2
// Greatest Element - 1: 32
// Smallest Element - 2: 1
// Greatest Element - 2: 12

// Whitelist
// void diagonalsMinMax(int a[][])
// interface 

import java.util.Scanner;

interface Matrix {
    void diagonalsMinMax(int a[][]);
}

class Code5 implements Matrix {
    public void diagonalsMinMax(int[][] mat) {
        int n = mat.length;
        if (n == 0)
            return;
        int principalMin = mat[0][0], principalMax = mat[0][0];
        int secondaryMin = mat[n - 1][0], secondaryMax = mat[n - 1][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (mat[i][j] < principalMin) {
                        principalMin = mat[i][j];
                    }
                    if (mat[i][j] > principalMax) {
                        principalMax = mat[i][j];
                    }
                }
                if ((i + j) == (n - 1)) {
                    if (mat[i][j] < secondaryMin) {
                        secondaryMin = mat[i][j];
                    }
                    if (mat[i][j] > secondaryMax) {
                        secondaryMax = mat[i][j];
                    }
                }
            }
        }

        System.out.println("Smallest Element - 1: "
                + principalMin);
        System.out.println("Greatest Element - 1: "
                + principalMax);

        System.out.println("Smallest Element - 2: "
                + secondaryMin);
        System.out.println("Greatest Element - 2: "
                + secondaryMax);
    }

    static public void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        Code5 obj = new Code5();
        obj.diagonalsMinMax(matrix);
    }
}