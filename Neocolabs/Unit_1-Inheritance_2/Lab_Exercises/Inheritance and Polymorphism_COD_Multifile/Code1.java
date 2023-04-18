// You are tasked with creating a payroll system for a company 
// that has both salaried and hourly employees. The program should 
// allow the user to input the number of employees and their 
// information, such as their name, type (salaried/hourly), and 
// relevant payment information.


// For salaried employees, the program should ask for their monthly 
// salary. For hourly employees, it should ask for their hourly rate
//  and the number of hours they worked in the current pay period.


// The program should then calculate the payroll for each employee 
// and the total payroll for the company. Salaried employees should 
// be paid their monthly salary, while hourly employees should be paid 
// their hourly rate for up to 40 hours and time and a half for any 
// hours worked over 40.


// Your program should be split across multiple files and the main 
// method should be in a Main class. 


// Employee Class:

// The Employee class is the base class that defines the basic 
// attributes and behaviors that are common to all types of employees. 
// It is an abstract class that cannot be instantiated on its own but 
// is used as a base class for creating subclasses of specific types of employees.

// Attributes:

// name: a string representing the name of the employee.

// Methods:

// calculatePay(): an abstract method that calculates the pay for 
// an employee. This method is implemented differently by each subclass.


// SalariedEmployee Class:

// The SalariedEmployee class is a subclass of the Employee class and 
// represents an employee who is paid a fixed monthly salary.

// Attributes:

// monthlySalary: a float representing the monthly salary of the employee.

// Methods:

// calculatePay(): a method that calculates the pay for a salaried 
// employee. The pay is simply the monthly salary.


// HourlyEmployee Class:

// The HourlyEmployee class is a subclass of the Employee class and 
// represents an employee who is paid an hourly rate for the number of hours worked.

// Attributes:

// hourlyRate: a float representing the hourly rate of the employee.

// hoursWorked: an integer representing the number of hours worked by 
// the employee in the current pay period.

// Methods:

// calculatePay(): a method that calculates the pay for an hourly 
// employee. The pay is the hourly rate multiplied by the hours worked, 
// up to a maximum of 40 hours. For any hours worked over 40, the pay is 
// the hourly rate multiplied by 1.5.


// Payroll Class:

// The Payroll class manages the list of employees and calculates 
// the payroll for each employee and the total payroll for the company.

// Attributes:

// employees: a list of Employee objects representing the employees 
// in the company.

// Methods:

// addEmployee(): a method that adds an Employee object to the 
// list of employees.

// calculatePayroll(): a method that calculates the pay for each 
// employee in the list by calling the calculatePay() method of each 
// Employee object and adds it to a running total for the company's payroll.

// printPayroll(): a method that prints out the payroll information 
// for each employee in the list and the total payroll for the company.
// Input format

// The program takes the following inputs from the user:


// The number of employees (an integer).

//   For each employee:

//     Name (a string).

//     Type of employee (either "salaried" or "hourly").

//     Monthly salary (for salaried employees only, a float).

//     Hourly rate and hours worked (for hourly employees only, two floats).
// Output format

// The program outputs the following:


//   The payroll information for each employee, in the format 
//   "name: pay".

//   The total payroll for the company, in the format "Total 
//   payroll: total pay".
// Code constraints

// The number of employees should be a positive integer.

// The name of an employee should be a string of alphanumeric characters 
// (a-z, A-Z, 0-9) with no whitespace.

// The type of employee should be either "salaried" or "hourly".

// The monthly salary should be a positive float for salaried employees.

// The hourly rate should be a positive float for hourly employees.

// The hours worked should be a positive float for hourly employees.
// Sample testcases
// Input 1

// 3
// John
// salaried
// 5000
// Mary
// hourly
// 25
// 45
// Bob
// hourly
// 20
// 30

// Output 1

// Payroll:
// John: 5000.0
// Mary: 1187.5
// Bob: 600.0
// Total payroll: 6787.5


import java.util.ArrayList;
import java.util.Scanner;
//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Employee.java
abstract class Employee {
    protected String name;
    protected double pay;

    public Employee(String name) {
         this.name = name;
    }

    public abstract void calculatePay();

    public String getName() {
         return name;
    }

    public double getPay() {
         return pay;
    }
}
//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//HourlyEmployee.java
class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee(String name, double rate, double hours) {
         super(name);
         this.rate = rate;
         this.hours = hours;
    }

    @Override
    public void calculatePay() {
         if (hours <= 40) {
              pay = rate * hours;
         } else {
              pay = rate * 40 + rate * 1.5 * (hours - 40);
         }
    }
}
//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Payroll.java

class Payroll {
    private ArrayList<Employee> employees;
    private double totalPay;

    public Payroll(int numEmployees) {
         employees = new ArrayList<Employee>(numEmployees);
         totalPay = 0;
    }

    public void addEmployee(Employee employee) {
         employees.add(employee);
    }

    public void calculatePayroll() {
         for (Employee employee : employees) {
              employee.calculatePay();
              totalPay += employee.getPay();
         }
    }

    public void printPayroll() {
         System.out.println("Payroll:");
         for (Employee employee : employees) {
              System.out.println(employee.getName() + ": " + employee.getPay());
         }
         System.out.println("Total payroll: " + totalPay);
    }
}
//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//SalariedEmployee.java
class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
         super(name);
         this.salary = salary;
    }

    @Override
    public void calculatePay() {
         pay = salary;
    }
}
//You are tasked with creating a payroll system for a company that has both salaried and hourly employees
//Main.java

public class Code1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.println("Enter the number of employees: ");
         int numEmployees = scan.nextInt();
         Payroll payroll = new Payroll(numEmployees);
         for (int i = 0; i < numEmployees; i++) {
              // System.out.println("Enter the name of employee #" + (i + 1) + ":");
              String name = scan.next();
              // System.out.println("Enter the type of employee (salaried/hourly):");
              String type = scan.next();
              Employee employee;
              if (type.equals("salaried")) {
                   // System.out.println("Enter the monthly salary:");
                   double salary = scan.nextDouble();
                   employee = new SalariedEmployee(name, salary);
              } else {
                   // System.out.println("Enter the hourly rate:");
                   double rate = scan.nextDouble();
                   // System.out.println("Enter the number of hours worked:");
                   double hours = scan.nextDouble();
                   employee = new HourlyEmployee(name, rate, hours);
              }
              payroll.addEmployee(employee);
         }
         
         payroll.calculatePayroll();
         payroll.printPayroll();

         scan.close();
    }
}