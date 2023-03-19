// Create class money with two attributes:

// int rupee

// int paisa

// Include getters, setters, and constructors.

// Create the main class and initialize the values for the data members

// Get two amounts and print their sum.
// Input format

// The input consists of two lines which have two integers in each line.

// Rupee and Paisa are separated by a space.
// Output format

// The output prints the total sum.

// Refer sample inputs and outputs for the formatting specifications.
// Sample testcases
// Input 1
// 50 85
// 42 65
// Output 1
// 93.50

// Input 2
// 254 45
// 845 20
// Output 2
// 1099.65

//import java.io.*;
import java.util.*;

class money {
    int rupee;
    int paisa;

    public void setRupee(int r) {
        this.rupee = r;
    }

    public void setPaisa(int p) {
        this.paisa = p;
    }

    public int getRupee() {
        return rupee;
    }

    public int getPaisa() {
        return paisa;
    }
}

class Code4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            money[] m = new money[2];
            int i;
            for (i = 0; i < 2; i++) {
                m[i] = new money();
                m[i].setRupee(sc.nextInt());
                m[i].setPaisa(sc.nextInt());
            }
            int r, p;
            r = m[0].getRupee() + m[1].getRupee();
            p = m[0].getPaisa() + m[1].getPaisa();
            if (p > 99) {
                r += 1;
                p = p - 100;
            }
            System.out.println(r + "." + p);
        }
    }
}