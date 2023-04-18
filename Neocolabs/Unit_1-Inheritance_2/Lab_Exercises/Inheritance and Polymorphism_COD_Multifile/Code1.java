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