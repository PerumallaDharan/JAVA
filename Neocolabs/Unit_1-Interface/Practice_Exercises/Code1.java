// Write a program to move all the uppercase characters to the end of the string.

// Note: Create an interface with a method and the main class should define the interface method.

// Input format
// Input to get a string.

// Output format
// The output prints a string, in which all the uppercase characters to the end of the string.

// Sample testcases

// Input 1
// REasonBehInd
// Output 1
// asonehndREBI

// Input 2
// donald
// Output 2
// donald

// Whitelist
// interface
// class 

import java.util.Scanner;

interface Case {
    String move(String s);
}

class Code1 implements Case {

    public String move(String str) {
        int len = str.length();
        String low = "";
        String upr = "";
        char ch;
        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upr += ch;
            } else {
                low += ch;
            }
        }
        return low + upr;
    }

    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        Code1 obj = new Code1();
        obj.move(str);
        System.out.println(obj.move(str));
    }
}