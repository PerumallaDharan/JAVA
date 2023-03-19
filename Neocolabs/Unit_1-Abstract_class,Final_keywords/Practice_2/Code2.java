// Write a program to find the sum of divisors using the concept of 
// abstract classes.

// Create an abstract class "AbstractClass" which contains abstract 
// methods getValue() and divisorSum(int n). Then write a class 
// called Calculator which extends the abstract class.

// getValue(): Method needs to get input from the user.

// divisorSum(int n): Method get's "n" as a parameter and returns 
// the sum of the numbers divisor.

// Eg: The divisor of the number 4 is 1, 2, 4. Output is 1+2+4 = 7
// Input format

// The input consists of a number.
// Output format

// The output prints the sum of its proper divisors.
// Code constraints

// 0 <= n <= 9999
// Sample testcases
// Input 1
// 4
// Output 1
// 7

import java.util.Scanner;

abstract class AbstractClass {
    int val;

    abstract int getValue();

    abstract int divisorSum(int n);
}

class Calculator extends AbstractClass {
    public int getValue() {
        Scanner in = new Scanner(System.in);
        val = in.nextInt();
        in.close();
        return val;
    }

    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class Code2 {
    public static void main(String[] args) {
        Calculator calObj = new Calculator();
        int value = calObj.getValue();
        int a = calObj.divisorSum(value);
        System.out.println(a);
    }
}
