// Write a program to print Pascal's Triangle.

// Example - Input: 6

// Output:

//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 
//  1 5 10 10 5 1 
// Input format
// The input consists of a number.

// Output format
// The output displays the required pattern.

// Sample testcases
// Input 1
// 6
// Output 1
//       1 
//      1 1 
//     1 2 1 
//    1 3 3 1 
//   1 4 6 4 1 
//  1 5 10 10 5 1 

import java.util.*;

class Code7 {

    public static void main(String[] args) {
        int row, i, j, space, num;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        for (i = 0; i < row; i++) {
            for (space = row; space > i; space--) {
                System.out.print(" ");
            }
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}