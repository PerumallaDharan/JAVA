// Define an interface ‘Growing’ which declares the method isGrowing(). 
// Create a class ‘GrowingNumber’ which implements the interface. Override 
// the method isGrowing() to check if the given number is a growing number 
// or not. (A growing number is one in which no digit is exceeded by the 
// digit to its left Ex., 369 is an increasing number but 362 is not).                                  

// Create another class ‘GrowingString’ which also implements the same 
// interface. Override the method isGrowing() to check whether the given 
// string is growing string or not. (If on moving from Left to Right, each 
// character in the string comes after the previous character in alphabetical 
// order. Ex., ANT is an increasing string whereas APPLE is not). 
// Write a java program to check whether the given number is a growing number 
// or not and whether the given string is a growing string or not.

// Input format
// A number followed by a String in first-line (space separated).

// Output format
// Growing number or Not growing number in the first line.
// Growing string or Not growing string in the second line.

// Sample testcases

// Input 1
// 369 ANT
// Output 1
// Growing number
// Growing string

// Input 2
// 369 APPLE
// Output 2
// Growing number
// Not growing string

// Input 3
// 362 APPLE
// Output 3
// Not growing number
// Not growing string

// Input 4
// 362 ANT
// Output 4
// Not growing number
// Growing string

// Whitelist
// interface Growing
// class GrowingNumber
// implements
// class GrowingString
// void isGrowing() 

import java.util.Arrays;
import java.util.Scanner;

interface Growing {
    void isGrowing();
}

class GrowingNumber implements Growing {
    int num;

    public GrowingNumber(int i) {
        num = i;
    }

    public void isGrowing() {
        // int num=423;
        boolean flag = false;
        int currentDigit = num % 10;
        num = num / 10;
        while (num > 0) {
            if (currentDigit <= num % 10) {
                flag = true;
                break;
            }
            currentDigit = num % 10;
            num = num / 10;
        }
        if (flag) {
            System.out.println("Not growing number");
        } else {
            System.out.println("Growing number");
        }

    }
}

class GrowingString implements Growing {
    String s1;

    public GrowingString(String string) {
        s1 = string;
    }

    public void isGrowing() {

        int n = s1.length();
        char c[] = new char[n];

        for (int i = 0; i < n; i++) {
            c[i] = s1.charAt(i);
        }
        Arrays.sort(c);

        boolean flag = true;

        for (int i = 0; i < n; i++)
            if (c[i] != s1.charAt(i))
                flag = false;

        if (flag) {
            System.out.println("Growing string");
        } else {
            System.out.println("Not growing string");
        }
    }
}

class Code4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str = sc.nextLine();
        // System.out.println(i + str);
        GrowingNumber x = new GrowingNumber(i);
        GrowingString s = new GrowingString(str);
        x.isGrowing();
        // System.out.println(str);
        s.isGrowing();

    }

}