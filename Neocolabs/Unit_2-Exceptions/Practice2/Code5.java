// ArrayIndexOutOfBoundsException:

// The prominent exception which you will see is ArrayIndexOutOfBoundsException. 
// It occurs when the program try to access the array beyond its size. 
// As we know arrays have fixed size. So when you try to use array 
// beyond its size it throws this exception. Let's try to handle this exception.

// Get an Array of size N and get an index, then print the Array[index]. 
// If the index is greater or equal to array size(N), then print the Exception.

// Divide by zero exception:

// When you try to divide any number by Zero it will throw ArithmeticException: / by Zero

// Get two numbers Then print the quotient if the divisor is 0 then print the Exception.

// NullPointerException:

// Another prominent exception is NullPointerException. It occurs when 
// you try to access a null value. Assign a null value to a string and 
// obtain an index position and try to access it. Print the exception.
// Input format

// The first line consists of array size(N).

// The second line consists of N integers separated by space.

// The third line consists of the Index value to retrieve the array element.

// The fourth line consists of two integers(Dividend and Divisor) separated by space.

// The fifth line consists of an index value to get the character from the string.
// Output format

// The first line consists of Array[Index] or ArrayIndexOutOfBoundException.

// The second line consists of the result of division or ArithmeticException.

// The third line consists of String(Which is assigned to null value).

// The fourth line consists of NullPointerException.

// Refer to the sample input and output for formatting specifications.
// Sample testcases
// Input 1

// 5
// 1 2 3 4 5
// 6
// 4 0
// 2

// Output 1

// Array index out of bound.
// java.lang.ArithmeticException: / by zero
// null
// java.lang.NullPointerException

// Input 2

// 4
// 10 89 76 12
// 3
// 4 2
// 9

// Output 2

// 12
// 2
// null
// java.lang.NullPointerException

import java.util.*;

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int size = scan.nextInt();
            int[] intArray = new int[size];
            for (int i = 0; i < size; i++) {
                intArray[i] = scan.nextInt();
            }
            int index = scan.nextInt();
            System.out.println(intArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound.");
        }
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        try {
            String str = null;
            int index = scan.nextInt();
            System.out.println(str);
            System.out.println(str.charAt(index));
        } catch (NullPointerException n) {
            System.out.println(n);
        }

        scan.close();
    }
}