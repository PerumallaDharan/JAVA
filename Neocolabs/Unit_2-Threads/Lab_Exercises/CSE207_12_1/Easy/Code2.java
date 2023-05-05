// complete the code snippet by writing the missing lines

// instructions related to the missing lines are provided as comment in the the code snippet
// Input format

// int
// Output format

// int numbers

// please see the sample output
// Sample testcases
// Input 1

// 6

// Output 1

// 1
// 2
// 3
// 4
// 5

import java.util.Scanner;

class Code2 extends Thread {
    public void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(500);

                // complete the run function

            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(i);
        }

        in.close();
    }

    public static void main(String[] args) {
        Code2 t1 = new Code2();
        // write the main function and create a thread object

        t1.start();
    }
}