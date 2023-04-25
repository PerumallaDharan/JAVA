// METHOD OVERLOADING

// Create a class named 'Hello'. Define a method 'sayHello'

//     Create an object obj.
//     Call method 'sayHello' without argument, Output should display 'Hello'.
//     Call method 'sayHello' with one argument, Output should display 
//     'Hello 'argument value'' (Ex: If the argument passed is 'John' Output should display 'Hello John')

// Input format

// The input contains a string.
// Output format

// The first line of the output should display 'Hello'

// The second line of the output should display 'Hello <input>'
// Sample testcases
// Input 1

// John

// Output 1

// Hello
// Hello John

// Whitelist
// Set 1:
// class Hello
// sayHello()
// sayHello(String s) 
import java.util.*;

class Code1 {
    public String sayHello() {
        return "Hello";
    }

    public String sayHello(String s) {
        return ("Hello " + s);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Code1 s = new Code1();
        System.out.println(s.sayHello());
        System.out.println(s.sayHello(str));

        scan.close();
    }
}
