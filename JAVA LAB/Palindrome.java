//Palindrome 

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int x = 0, n, num = num1;
        while (num > 0) {
            n = num % 10;
            x = x * 10 + n;
            num /= 10;
        }
        if (num1 == x) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
        sc.close();
    }
}
