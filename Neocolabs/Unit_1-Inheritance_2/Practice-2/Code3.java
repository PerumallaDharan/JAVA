// Create multilevel inheritance with the below classes.

// Create data members and method as mentioned below.

// WorkerDetail

//     employee code and basic salary as integer
//     name as string
//     methods to display above details and to calculate HRA(60% of basic salary)

// OfficerSal

//     method to calculate DA(98% of basic salary)

// ManagerSal

//     method to calculate City allowance (20% of basic salary)
//     method to calculate Gross pay (basic salary + HRA + DA + City allowance)

// Create Main class to get the employee ID , Name and Basic salary 
// as input. Calculate HRA, DA, CA and Gross Salary.
// Input format

// The first line of input consists of the Employee code.

// The second line of input consists of Employee's name.

// The third line of input consists of the Salary.
// Output format

// The output displays the below details in separate lines:

// Code

// Name

// Salary

// HRA

// DA

// City Allowance

// Gross Salary
// Sample testcases
// Input 1

// 101
// Karthick
// 10000

// Output 1

// Code :101
// Name : Karthick
// Salary 10000
// HRA :6000.0
// DA :9800.0
// City Allowance :2000.0
// Gross Salary :27800.0

// Whitelist
// Set 1:
// class WorkerDetail
// class OfficerSal
// extends
// class ManagerSal 

import java.util.Scanner;

class WorkerDetail {
    int c, s;
    String n;
    float h;

    void setSalary(int x, String y, int z) {
        c = x;
        n = y;
        s = z;
    }

    void showDetail() {
        System.out.println("Code :" + c);
        System.out.println("Name : " + n);
        System.out.println("Salary " + s);
    }

    void getHra() {
        h = (float) s * 60 / 100;
        System.out.println("HRA :" + h);
    }
}

class OfficerSal extends WorkerDetail {
    float d;

    void getDA() {
        d = (float) s * 98 / 100;
        System.out.println("DA :" + d);
    }
}

class ManagerSal extends OfficerSal {
    float ca, g;

    void getCA() {
        ca = (float) s * 20 / 100;
        System.out.println("City Allowance :" + ca);
    }

    void getgross() {
        g = s + h + d + ca;
        System.out.println("Gross Salary :" + g);
    }
}

class Code3 {
    public static void main(String args[]) {
        ManagerSal m = new ManagerSal();
        Scanner myObj = new Scanner(System.in);

        int code = Integer.parseInt(myObj.nextLine());
        String name = myObj.nextLine();
        int sal = Integer.parseInt(myObj.nextLine());

        m.setSalary(code, name, sal);

        m.showDetail();
        m.getHra();
        m.getDA();
        m.getCA();
        m.getgross();
    }
}
