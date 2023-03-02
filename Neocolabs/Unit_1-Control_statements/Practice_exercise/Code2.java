// Write a program to check whether the given year is a leap year or not.

// Note: Use nested if else statement

// Input format
// The input consists of a year.

// Output format
// The output displays input followed by Leap year or Not leap year based on the condition.

// Sample testcases
// Input 1
// 1900
// Output 1
// 1900 Not leap year
// Input 2
// 1880
// Output 2
// 1880 Leap year

import java.util.Scanner;

class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println(year + " Leap year");
        else
            System.out.println(year + " Not leap year");
        sc.close();
    }
}