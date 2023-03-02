// Target Practice

// Drona normally trains his disciples using a board that consists of concentric 
// circles. When the student correctly hits the center of the concentric circles, 
// his score is 100. The score gets reduced depending on where the students hit on 
// the board. When the student hits outside the board, his score is 0. Drona will not 
// allow a student to have his food unless he scores 100. Arjuna will always hit the 
// target on his first attempt and he will leave early. Others may take more turns to 
// reach a score of 100. Can you write a program to determine the number of turns a 
// disciple takes to reach the target score of 'n'?

// Input format
// The input consists of a list of positive integers.

// The first integer corresponds to the target score 'n'.

// Assume that all the other integers input are less than or equal to the target score

// Output format
// The output consists of a single line representing a number of turns.

// Refer to the sample outputs for the formatting specifications.

// Sample testcases
// Input 1
// 100
// 4
// 40
// 60
// Output 1
// The number of turns is 3

import java.util.Scanner;

class Code1 {
    public static void main(String args[]) {
        int target, score, attempt = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        target = s.nextInt();
        while (sum < target) {
            score = s.nextInt();
            sum = sum + score;
            attempt++;
        }
        System.out.println("The number of turns is " + attempt);
        s.close();
    }
}