// Create a class with two methods one to read the elements of 
// an array and the other to find all pairs of elements in an 
// array whose sum is equal to a specified number.
// Input format

// The first line of the input consists of the value of n.

// The next input is the array of elements separated by space.

// The last input is the sum value.
// Output format

// The output prints the pair whose sum is equal to a specified 
// number else prints that there are no pairs.

// Refer to the sample outputs for the formatting specifications.
// Sample testcases

// Input 1
// 5
// 1 2 3 4 5
// 8
// Output 1
// 3 5
// 4 4
// 5 3

// Input 2
// 4
// 10 20 30 40
// 24
// Output 2
// There is no pairs for the given sum.

import java.util.*;
// import java.io.*;

class Code3 {
    public static void printArray(int arr[], int n, int sum) {
        int s = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                    s++;
                }
            }
        }

        if (s == 0) {
            System.out.println("There is no pairs for the given sum.");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = scan.nextInt();
        printArray(arr, n, sum);

        scan.close();
    }
}
