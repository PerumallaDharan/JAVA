// NullPointerException

// Another prominent exception is NullPointerException. It occurs 
// when you try to access a null value. Assign null value to a 
// string and obtain an index position and try to access it. Print the exception.
// Input format

// Input consists of an integer.
// Output format

// Output prints the null pointer exception.
// Sample testcases
// Input 1

// 9

// Output 1

// null
// java.lang.NullPointerException

import java.util.*;

class Code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String str = null;
            int index = Integer.parseInt(scan.nextLine());
            System.out.println(str);
            System.out.println(str.charAt(index));
        } catch (NullPointerException n) {
            System.out.println(n);
        }

        scan.close();
    }
}