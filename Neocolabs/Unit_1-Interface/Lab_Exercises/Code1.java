// Create an interface rotate with the following three functions.
//   void leftRotate(int arr[], int d, int n) ; //d=1
//   void leftRotatebyOne(int arr[], int n);
//   void printArray(int arr[], int n) ;
// Implement the interface in the main class and rotate the given array by one to left.

// Input format
// The input consists of the number of elements.
// The next input is the array elements.

// Output format
// Print the array elements after rotation.
// Code constraints
// Integers only.

// Sample testcases
// Input 1
// 6
// 7 8 9 0 1 2
// Output 1
// 8 9 0 1 2 7 

// Whitelist
// public void leftRotate(int arr[], int d, int n)
// public void leftRotatebyOne(int arr[], int n)
// public void printArray(int arr[], int n)
// interface
// implements 

import java.util.*;

interface rotate {
    void leftRotate(int arr[], int d, int n);

    void leftRotatebyOne(int arr[], int n);

    void printArray(int arr[], int n);
}

class Code1 implements rotate {
    public void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    public void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    public void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Code1 a = new Code1();
            int q, i;
            q = sc.nextInt();
            int arr[] = new int[q];
            for (i = 0; i < q; i++)
                arr[i] = sc.nextInt();
            a.leftRotate(arr, 1, q);
            a.printArray(arr, q);
        }
    }

}
