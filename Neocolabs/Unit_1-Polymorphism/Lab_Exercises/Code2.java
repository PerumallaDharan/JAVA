// Function Overloading

// Write a program to implement function overloading.

// Ram is given two or three inputs as an integer, if he has two 
// integers then add the two numbers. If he has three inputs,then multiply the three numbers.

// Function Header:

// public void fun1(int a,int b,int c)

// public void fun1(int a,int b)
// Input format

// The first line represents the number of elements(N) followed by the elements separated by a single space.

// If the number of the elements exceeds 2 or 3, then display the message as WRONG INPUT.
// Output format

// Display the sum, if there are two integers or

// Displays product, if there are three integers.
// Code constraints

// N > 0 and N < 4
// Sample testcases
// Input 1

// 3 1 2 3

// Output 1

// 6

// Input 2

// 2 14 56

// Output 2

// 70

// Input 3

// 4 67 89 43 21

// Output 3

// WRONG INPUT

// Whitelist
// Set 1:
// fun1(int a,int b)
// fun1(int a,int b,int c) 


import java.util.*;

class Code2 {
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun1(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }
        Code2 m = new Code2();
        if (a == 1)
            System.out.println(arr[0]);
        else if (a == 2)
            System.out.println(m.fun1(arr[0], arr[1]));
        else if (a == 3)
            System.out.println(m.fun1(arr[0], arr[1], arr[2]));
        else
            System.out.println("WRONG INPUT");

        scan.close();
    }
}
