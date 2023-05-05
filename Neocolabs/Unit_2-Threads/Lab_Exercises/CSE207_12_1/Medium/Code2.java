// Complete the code snippet, by writing the missing lines:

// Write two Thread MyThread1 and MyThread2 as used in Main function

// MyThread1 and MyThread2 have one member variable of type Table

// The constructor of MyThread1 and MyThread2 takes a Table type object -- MyThread1(Table t)

// the run function only calls printTable 

// complete the printTable function which will be used concurrently by MyThread1 and MyThread2

// Input format

// <None>
// Output format

// integers

// please see the sample output
// Sample testcases
// Input 1

// Output 1

// 11
// 22
// 33
// 44
// 55
// 101
// 202
// 303
// 404
// 505

public class Code2 {
    public static void main(String args[]) {
        Table obj = new Table();// only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

// Write two Thread MyThread1 and MyThread2 as used in Main function
// MyThread1 and MyThread2 have one member variable of type Table
// The constructor of MyThread1 and MyThread2 takes a Table type object --
// MyThread1(Table t)
// the run function only calls printTable

class Table {
    void printTable(int n) {

        // complete the printTable function which will be used concurrently by MyThread1
        // and MyThread2

        synchronized (this) {
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
}

class MyThread1 extends Thread {
    Table t;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(11);
    }
}

class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(101);
    }
}
