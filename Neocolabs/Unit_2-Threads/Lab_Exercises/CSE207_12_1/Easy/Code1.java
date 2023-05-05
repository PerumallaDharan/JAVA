// Complete the code snippets by writing the missing lines.

// The program implements the runnable interface, complete the main function and create the thread t1.
// Input format

// <None>
// Output format

// String
// Sample testcases
// Input 1

// Output 1

// thread is running...

class Code1 implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {

        Code1 m1 = new Code1();
        Thread t1 = new Thread(m1);
        t1.start(); // t1 is a Thread type object
    }
}