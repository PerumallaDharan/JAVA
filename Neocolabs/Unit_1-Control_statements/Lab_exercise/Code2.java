// It is IPL season and Preity's favorite team is "Kings XI Punjab". She decided 
// to check with Astrologer to know the performance of players in advance. Astrologer 
// asked about the zodiac sign of each player. But Preity knows only the date of birth. 
// So astrologer suggests checking the below chart and telling the zodiac sign. So Preity 
// asked Manish, her personal assistant to do this task. Manish is good at programming and 
// he decided to solve this using Java program. Help Manish to complete this task. Check 
// whether there is an Invalid Date/Month.

// Input format
// The first line of the input consists of the date and month number separated by space.

// Output format
// The output displays the suitable zodiac as shown in the sample output.

// Print Invalid Date/Month for invalid inputs.

// Code constraints
// 1 ≤ Date ≤ 31

// 1 ≤ Month ≤ 12

// Sample testcases
// Input 1
// 7 8
// Output 1
// Astrological sign for 7-8 is Leo
// Input 2
// 35 7
// Output 2
// Invalid Date/Month

import java.util.Scanner;

class Code2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        String s = "";
        if ((d < 1) || (d > 31) || (m < 1) || (m > 12)) {
            System.out.print("Invalid Date/Month");
        } else {
            if (m == 1) {
                if (d > 20)
                    s = "Capricorn";
                else
                    s = "Aquarius";
            }
            if (m == 2) {
                if (d < 19)
                    s = "Aquarius";
                else
                    s = "Pisces";
            }
            if (m == 3) {
                if (d < 21)
                    s = "Pisces";
                else
                    s = "Aries";
            }
            if (m == 4) {
                if (d < 20)
                    s = "Aries";
                else
                    s = "Taurus";
            }
            if (m == 5) {
                if (d < 21)
                    s = "Taurus";
                else
                    s = "Gemini";
            }
            if (m == 6) {
                if (d < 21)
                    s = "Gemini";
                else
                    s = "Cancer";
            }
            if (m == 7) {
                if (d < 19)
                    s = "Cancer";
                else
                    s = "Leo";
            }
            if (m == 8) {
                if (d < 23)
                    s = "Leo";
                else
                    s = "Virgo";
            }
            if (m == 9) {
                if (d < 23)
                    s = "Virgo";
                else
                    s = "Libra";
            }
            if (m == 10) {
                if (d < 23)
                    s = "Libra";
                else
                    s = "Scorpio";
            }
            if (m == 11) {
                if (d < 22)
                    s = "Scorpio";
                else
                    s = "Sagittarius";
            }
            if (m == 12) {
                if (d < 22)
                    s = "Sagittarius";
                else
                    s = "Capricorn";
            }
            System.out.print("Astrological sign for " + d + "-" + m + " is " + s);
            in.close();
        }
    }
}