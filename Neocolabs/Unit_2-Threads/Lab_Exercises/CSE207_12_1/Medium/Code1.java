// Complete the code snippet, by writing the missing lines:

// Implement MyThread1 and MyThread2 class which prints a table of two given numbers respectively
// Input format

// two integer number separated by space
// Output format

// integer numbers

// please see the output
// Sample testcases
// Input 1

// 5 100

// Output 1

// 5
// 10
// 15
// 20
// 25
// 100
// 200
// 300
// 400
// 500

import java.util.Scanner;

//example of java synchronized method  
class Table {
    synchronized void printTable(int n) {// synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(30);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    Table t;
    int n;

    MyThread1(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }
}

class MyThread2 extends Thread {
    Table t;
    int n;

    MyThread2(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }
}
// Implement MyThread1 and MyThread2 class

public class Code1 {
    public static void main(String[] args) {

        Table obj = new Table();// only one object
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        MyThread1 t1 = new MyThread1(obj, a);
        MyThread2 t2 = new MyThread2(obj, b);
        t1.start();
        t2.start();
        in.close();
    }
}