// A Multiplication Game

// John and Michael play the game of multiplication by multiplying 
// an integer p by one of the numbers 2 to 9. John always starts with 
// p = 1 and multiplies it by 1, and passes the result to Michael. Then, 
// Michael multiplies the number by 2 and sends the result to John, 
// then John multiplies by 3, and so on. Before a game starts, they 
// draw an integer N and the winner is the one who first reaches p ≥ n.

// Create a class that has two functions:

// 1) A function to perform the multiplication operation

// 2) The main()
// Input format

// The input consists of the value of n.
// Output format

// The output prints the n value and who won the game separated by a space.

// Refer to the sample output for formatting specifications.
// Sample testcases
// Input 1
// 10
// Output 1
// 10 Michael wins

// Input 2
// 100
// Output 2
// 100 John wins

//import java.io.*;
import java.util.*;

class Code2 {
    public static void game(int n) {
        int sum = 1, i = 2, count = 1;
        while (sum < n && i <= 9) {
            sum *= i;
            if (sum < n) {
                i++;
                count++;
            } else {
                break;
            }
        }
        if (count % 2 != 0) {
            System.out.println(n + " Michael wins");
        } else {
            System.out.println(n + " John wins");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        game(n);
        sc.close();
    }
}