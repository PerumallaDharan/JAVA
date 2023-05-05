// Complete the code snippet by writing the missing lines:

// The program extended the Thread class to implement the Main class and 
// overrides run function, the run function displays a message "This code is running in a thread".
// Input format

// <None>
// Output format

// String
// Sample testcases
// Input 1

// Output 1

// This code is outside of the thread
// This code is running in a thread

public class Code4 extends Thread {
    public static void main(String[] args) {
        Code4 thread = new Code4();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {

        System.out.println("This code is running in a thread");
    }
}
