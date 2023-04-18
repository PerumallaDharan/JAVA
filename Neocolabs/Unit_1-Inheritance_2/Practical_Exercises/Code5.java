// Create 5 classes as shown in the below diagram and create data 
// members and methods as mentioned below. 

// Person

//     name and birthYear
//     Parameterized constructor and overload toString method

// Student

//     department and attendance percentage
//     Parameterized constructor and overload toString method
//     method to calculate whether the student is eligible to attend the exam or not

// Staff

//     salary
//     Parameterized constructor and overload toString method

// TeachingStaff

//     subject and result percentage
//     Parameterized constructor and overload toString method
//     method to calculate new salary based on result percentage

// NonTeachingStaff

//     Lab and experience
//     Parameterized constructor and overload toString method
//     method to calculate new salary based on experience

// Create a Main class to test above classes based on below conditions.

//     Minimum attendance percentage required to attend exam is 75
//     Teaching staff new salary will be calculated based on their result 
//     percentage (i.e.if result percentage is 87, increment will be 8.7%)
//     Non teaching staff new salary will be calculated based on their 
//     experience (i.e.if experience is 2 years, the increment will be 2%)

// Input format

// Person code (1 for student, 2 for Teaching Staff, 3 for Nonteaching staff)

// Name

// Year of birth

// Next 2 or 3 lines are based on below conditions

// Department and Attendance percentage if Person code is 1

// Subject, Result percentage and salary if Person code is 2

// Lab Name, Experience and Salary if Person code is 3

// Output format

// The output prints the details.

// Sample testcases

// Input 1
// 1
// Kumar
// 1986
// MCA
// 85
// Output 1
// Name : Kumar
// BirthYear : 1986
// Department : MCA
// Eligible : Yes

// Input 2
// 2
// Vikram
// 1980
// Maths
// 90
// 50000
// Output 2
// Name : Vikram
// BirthYear : 1980
// Old Salary : 50000.0
// Subject : Maths
// New Salary : 54500.0

// Input 3
// 3
// Arun
// 1984
// DS LAB
// 3
// 15000
// Output 3
// Name : Arun
// BirthYear : 1984
// Old Salary : 15000.0
// Lab : DS LAB
// New Salary : 15450.0

// Whitelist
// class Person
// class NonTeachingStaff
// extends
// class TeachingStaff
// class Student
// class Staff
// toString() 

import java.util.*;

class Person {
    private String name;
    private int birthYear;

    public Person(String n, int byear) {
        name = n;
        birthYear = byear;
    }

    public String toString() {
        return "Name : " + name + "\nBirthYear : " + birthYear + "";
    }
}

class Staff extends Person {
    protected double salary;

    public Staff(String n, int byear, double s) {
        super(n, byear);
        salary = s;
    }

    public String toString() {
        return super.toString() + "\nOld Salary : " + salary;
    }
}

class Student extends Person {
    private String major;
    private double att;

    public Student(String n, int byear, String m, double at) {
        super(n, byear);
        major = m;
        att = at;
    }

    public String atten(double att) {
        return (att >= 75) ? "Yes" : "No";
    }

    public String toString() {
        return super.toString() + "\nDepartment : " + major + "\nEligible : " + atten(att);
    }
}

class TeachingStaff extends Staff {
    private String subject;
    private double result;

    public TeachingStaff(String n, int byear, double s, String sub, double res) {
        super(n, byear, s);
        subject = sub;
        result = res;
    }

    double salCalc() {
        return salary + (salary * (result / 1000));
    }

    public String toString() {
        return super.toString() + "\nSubject : " + subject + "\nNew Salary : " + salCalc();
    }
}

class NonTeachingStaff extends Staff {
    private String lab;
    private double exp;

    public NonTeachingStaff(String n, int byear, double s, String l, double expr) {
        super(n, byear, s);
        lab = l;
        exp = expr;
    }

    double ntsalCalc() {
        return salary + (salary * (exp / 100));
    }

    public String toString() {
        return super.toString() + "\nLab : " + lab + "\nNew Salary : " + ntsalCalc();
    }
}

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        int byear = Integer.parseInt(scan.nextLine());
        if (choice == 1) {
            String dept = scan.nextLine();
            double att = scan.nextDouble();
            Student b = new Student(name, byear, dept, att);
            System.out.println(b);
        } else if (choice == 2) {
            String sub = scan.nextLine();
            double result = scan.nextDouble();
            double sal = scan.nextDouble();
            TeachingStaff ts = new TeachingStaff(name, byear, sal, sub, result);
            System.out.println(ts);
        } else if (choice == 3) {
            String lab = scan.nextLine();
            double exp = scan.nextDouble();
            double sal = scan.nextDouble();
            NonTeachingStaff nts = new NonTeachingStaff(name, byear, sal, lab, exp);
            System.out.println(nts);
        }

        scan.close();

    }
}