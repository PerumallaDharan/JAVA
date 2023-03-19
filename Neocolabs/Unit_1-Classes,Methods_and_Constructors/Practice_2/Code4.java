// Write a program to check whether the given character is a 
// vowel or consonant.

// Create two methods namely main method and alph. Create an object 
// in the main method and access the alph method, that performs the 
// above operation.
// Input format

// The input consists of a character.
// Output format

// The output prints whether the character is a vowel or consonant.

// Display the output as shown in the sample output.
// Sample testcases

// Input 1
// j
// Output 1
// j :consonant

// Input 2
// e
// Output 2
// e :vowel

// Input 3
// 5
// Output 3
// 5 :consonant

import java.util.*;

class Code4 {
    void alph(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " :vowel");
        else
            System.out.println(ch + " :consonant");
    }

    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        Code4 obj = new Code4();
        obj.alph(ch);

        scan.close();
    }
}