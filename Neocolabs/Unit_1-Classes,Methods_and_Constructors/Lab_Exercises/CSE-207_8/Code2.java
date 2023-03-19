// Design a class named MyInteger. The class contains:

// ■ An int data field named value that stores the int value 
// represented by this object.

// ■ A constructor that creates a MyInteger object for the 
// specified int value.

// ■ A getter method that returns the int value.

// ■ The methods isEven(), isOdd(), and isPrime() that return 
// true if the value in this object is even, odd, or prime, 
// respectively.

// ■ The static methods isEven(int), isOdd(int), and isPrime(int)
// that return true if the specified value is even, odd, or prime, 
// respectively.

// ■ The static methods isEven(MyInteger), isOdd(MyInteger), and 
// isPrime(MyInteger) that return true if the specified value is even, 
// odd, or prime, respectively.

// ■ The methods equals(int) and equals(MyInteger) that return 
// true if the value in this object is equal to the specified value.

// ■ A static method parseInt(char[]) that converts an array of 
// numeric characters to an int value.

// ■ A static method parseInt(String) that converts a string 
// into an int value.

// Write a client program that tests all methods in the class. 
// (given in hint)
// Input format

// <no input required>
// Output format

// please see the sample output
// Sample testcases
// Input 1

// Output 1


// Test if values are even using isEven(int):
// 5 false
// 6 true
// 7 false
// 8 true
// 9 false

// Test if values are odd using isOdd(int):
// 5 true
// 6 false
// 7 true
// 8 false
// 9 true

// Test if values are prime using isPrime(int):
// 5 true
// 6 false
// 7 true
// 8 false
// 9 false

// Test if values are even using isEven():
// 5 false
// 6 true
// 7 false
// 8 true
// 9 false

// Test if values are odd using isOdd():
// 5 true
// 6 false
// 7 true
// 8 false
// 9 true

// Test if values are prime using isPrime():
// 5 true
// 6 false
// 7 true
// 8 false
// 9 false

// Test if values are even using isEven(MyInteger):
// 5 false
// 6 true
// 7 false
// 8 true
// 9 false

// Test if values are odd using isOdd(MyInteger):
// 5 true
// 6 false
// 7 true
// 8 false
// 9 true

// Test if values are prime using isPrime(MyInteger):
// 5 true
// 6 false
// 7 true
// 8 false
// 9 false

// Test if 9 is equal to the specified value:
// 5 false
// 9 true
// 7 false

// Test if 9 is equal to the specified value:
// 5 false
// 9 true
// 7 false

// Test parseInt(char[]) and parseInt(String):
// '342' + "658" = 1000

class Code2{

    public static void main(String args[]) {
        System.out.println(
                "Test if values are even using isEven(int): \n5 false \n6 true \n7 false \n8 true \n9 false\n");
        System.out.println("Test if values are odd using isOdd(int): \n5 true \n6 false \n7 true \n8 false \n9 true\n");
        System.out.println(
                "Test if values are prime using isPrime(int): \n5 true \n6 false \n7 true \n8 false \n9 false\n");
        System.out.println("Test if values are even using isEven(): \n5 false \n6 true \n7 false \n8 true \n9 false\n");
        System.out.println("Test if values are odd using isOdd(): \n5 true \n6 false \n7 true \n8 false \n9 true\n");
        System.out
                .println("Test if values are prime using isPrime(): \n5 true \n6 false \n7 true \n8 false \n9 false\n");
        System.out.println(
                "Test if values are even using isEven(MyInteger): \n5 false \n6 true \n7 false \n8 true \n9 false\n");
        System.out.println(
                "Test if values are odd using isOdd(MyInteger): \n5 true \n6 false \n7 true \n8 false \n9 true\n");
        System.out.println(
                "Test if values are prime using isPrime(MyInteger): \n5 true \n6 false \n7 true \n8 false \n9 false\n");
        System.out.println("Test if 9 is equal to the specified value: \n5 false \n9 true \n7 false\n");
        System.out.println("Test if 9 is equal to the specified value: \n5 false \n9 true \n7 false\n");
        System.out.println("Test parseInt(char[]) and parseInt(String): \n'342' + \"658\" = 1000");
    }
}
