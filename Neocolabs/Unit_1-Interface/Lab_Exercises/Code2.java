// Write a program to count a minimum number of front moves to sort an array.

// Note: Create an interface and declare a method, the class should implement the interface.

// Input format
// Input to get the size of array N in the first line, followed by N elements 
// separated by a single space in the second line.

// Note: The elements must be the first N natural numbers jumbled.

// Output format
// The output prints the count of the minimum number of front moves to sort an array

// Code constraints
// N- integer type(Natural numbers)

// Sample testcases

// Input 1
// 5
// 2 3 1 4 5
// Output 1
// 1

// Input 2
// 7
// 5 6 3 2 4 1 7
// Output 2
// 4

// Whitelist
// interface
// implements
// class 

import java.util.*;

interface S {
    void minimove(int arr[], int n);
}

class Code2 implements S {
    public void minimove(int arr[], int n) {
        int e = n;
        int ans;

        for (int i = n - 1; i >= 0; i--)
            if (arr[i] == e)
                e--;
        ans = e;
        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code2 o = new Code2();
        int q;
        q = sc.nextInt();
        int arr[] = new int[q];

        for (int i = 0; i < q; i++)
            arr[i] = sc.nextInt();
        o.minimove(arr, q);

    }
}