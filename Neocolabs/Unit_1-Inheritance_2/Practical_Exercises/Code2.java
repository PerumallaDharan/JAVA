// A company maintains a database that has the details of all the 
// employees. There are two levels of employees where level 1 is 
// the top management having a salary of more than 100 dollars and 
// level 2 is the staff who are getting a salary of fewer than 100 
// dollars. Create a class named Employee with empId and salary as 
// attributes. Create another class empLevel that extends employee 
// and categorizes the employee into various levels.
// Input format

// The input should contain only the employee id and salary of the 
// employee separated by space.

// Employee id should be of integer type and salary float type.
// Output format

// The output of the program must display the employee id, salary, and 
// level of the employee one below the other in the same order.

// Sample testcases

// Input 1
// 253 5.6
// Output 1
// 253
// 5.6
// 2

// Whitelist
// class Employee
// class empLevel
// extends
// empId
// salary .

import java.util.Scanner;

class Employee {
    public int empId;
    public float salary;

    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }

    public String toString() {
        return (empId + "\n" + salary);
    }
}

class empLevel extends Employee {
    public int level;

    public empLevel(int empId, float salary) {
        super(empId, salary);
        if (salary > 100)
            level = 1;
        else
            level = 2;
    }

    public String toString() {
        return (super.toString() + "\n" + level);
    }
}

class Code2 {
    public static void main(String args[]) {
        int emplId;
        float salary;
        Scanner in = new Scanner(System.in);
        emplId = in.nextInt();
        salary = in.nextFloat();
        empLevel el = new empLevel(emplId, salary);
        System.out.println(el.toString());
    }
}