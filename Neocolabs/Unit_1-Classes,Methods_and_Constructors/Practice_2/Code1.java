// Create a class NumberConverter with the required methods to convert 
// between four major number systems (Decimal, Binary, Octal, and Hexadecimal).

// Create a Main class and call a suitable method using NumberConverter 
// object. Get the source and destination number system as a single character 
// from the user along with the number in the main class. Call a suitable 
// method in NumberConverter class to convert.

// Note : D for Decimal, B for Binary, O for Octal, and H for Hexadecimal.
// Input format

// The first line of input consists of the Number System Code(From).

// The second line of input consists of the Number System Code(To).

// The third line of input consists of a number.
// Output format

// The output prints the result after conversion.
// Code constraints

// Only 4 codes for the Number system.
// Sample testcases

// Input 1
// D
// B
// 23
// Output 1
// 10111

// Input 2
// H
// O
// 27
// Output 2
// 47

import java.util.*;

class Code1 {
    public static String NumberConverter(String number, int sBase, int dBase) {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    public static void main(String[] args) {
        // int a, b;
        // NumberConverter number=new NumberConverter();
        Scanner scan = new Scanner(System.in);
        char sBase = scan.nextLine().charAt(0);
        char dBase = scan.nextLine().charAt(0);

        String input = scan.nextLine();

        if (sBase == 'D' || sBase == 'd')
            sBase = 10;
        else if (sBase == 'B' || sBase == 'b')
            sBase = 2;
        else if (sBase == 'O' || sBase == 'o')
            sBase = 8;
        else if (sBase == 'H' || sBase == 'h')
            sBase = 16;

        if (dBase == 'D' || dBase == 'd')
            dBase = 10;
        else if (dBase == 'B' || dBase == 'b')
            dBase = 2;
        else if (dBase == 'O' || dBase == 'o')
            dBase = 8;
        else if (dBase == 'H' || dBase == 'h')
            dBase = 16;

        System.out.println(NumberConverter(input, sBase, dBase));
        // System.out.println(ans);

        scan.close();
    }
}
