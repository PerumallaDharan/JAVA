// Complete the code snippet, by writing the missing lines.

// The desired tasks are commented out in the code snippet
// Input format

// <None>
// Output format

// <String>
// Sample testcases
// Input 1

// Output 1

// My new thread
// Now the thread is running ...

public class Code3 implements Runnable {
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    // main method
    public static void main(String argvs[]) {
        // creating an object of the class MyThread2
        Runnable r1 = new Code3();

        // create an object of the class Thread using Thread(Runnable r, String name)

        Thread th1 = new Thread(r1, "My new thread");
        th1.start();
        String str = th1.getName();

        // use the start() method to move the thread to the active state

        // get the thread name into str by invoking the getName() method

        System.out.println(str);
    }
}
