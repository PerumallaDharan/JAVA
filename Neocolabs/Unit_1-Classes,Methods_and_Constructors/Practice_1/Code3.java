// Write a program to find the number of occurrences of a character 
// in a string. Create a constructor with two parameters, pass the value 
// from the main method to the constructor, and perform the mentioned 
// task in the constructor and display it.
// Input format

// The first line of input consists of a string.

// The second line of input consists of a character.
// Output format

// The output displays the number of occurrences of a character in a 
// string.
// Code constraints

// If the character is an alphabet, it is case-sensitive.
// Sample testcases
// Input 1
// utter
// t
// Output 1
// 2

// Input 2
// Mobile_Screen
// "
// Output 2
// 0

import java.util.Scanner;

class Code3 {
    Code3(String s, char c) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                res++;
        }
        System.out.print(res);
    }

    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        char c;
        c = in.next().charAt(0);
        // Code3 obj = new Code3(str, c);
        new Code3(str, c);
        in.close();
    }
}