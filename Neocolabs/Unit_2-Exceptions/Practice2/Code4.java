// Write a program to read the Register Number and Mobile 
// Number of a student. Create user defined exception and handle the following: 

//     If the Register Number does not contain exactly 9 
//     characters in specified format(2 numbers followed 
//     by 3 characters followed by 4 numbers) or if the 
//     Mobile Number does not contain exactly 10 characters, 
//     throw an IllegalArgumentException. 
//     If the Mobile Number contains any character other than 
//     a digit, raise a NumberFormatException.
//     If the Register Number contains any character other 
//     than digits and alphabets, throw a NoSuchElementException.
//     If they are valid, print the message ‘valid’ else ‘Invalid’.

// Input format

// Register number as a string in the first line

// Mobile number as a string in the second line
// Output format

// Valid or Invalid with exception message

// Refer sample outputs for format and exact text
// Sample testcases
// Input 1

// 19ABC1001
// 9949596920

// Output 1

// Valid

// Input 2

// 19ABC1001
// 99495969209

// Output 2

// Invalid
// java.lang.IllegalArgumentException: Mobile Number does 
// not contain exactly 10 characters

// Input 3

// 19ABC10019
// 9949596920

// Output 3

// Invalid
// java.lang.IllegalArgumentException: Register Number does 
// not contain exactly 9 characters

// Input 4

// 195AC1001
// 9949596920

// Output 4

// Invalid
// java.util.NoSuchElementException: Registration Number cannot 
// contain any character other than digits and alphabets in format specified

// Input 5

// 19ABC1001
// 994C596920

// Output 5

// Invalid
// java.lang.NumberFormatException: Mobile Number cannot contain 
// any character other than a digit

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Code4 {
    static void validate(String r, String n) {
        if (r.length() != 9) {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        if (n.length() != 10) {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }
        String pattern = "^[1-9]([0-9]){9,9}$";
        Pattern a = Pattern.compile(pattern);
        Matcher m1 = a.matcher(n);
        if (!m1.find()) {
            System.out.println("Invalid");
            throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }
        String pattern2 = "^[1-9][0-9]([A-Z]){3,3}([0-9]){4,4}$";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(r);
        if (!m2.find()) {
            System.out.println("Invalid");
            throw new NoSuchElementException(
                    "Registration Number cannot contain any character other than digits and alphabets in format specified");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String reg = sc.nextLine();
        String no = sc.nextLine();
        sc.close();
        try {
            validate(reg, no);
            System.out.println("Valid");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}