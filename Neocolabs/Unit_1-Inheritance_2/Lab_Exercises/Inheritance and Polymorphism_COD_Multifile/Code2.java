import java.util.Scanner;
//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Employee.java
class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
         super(name, age);
         this.employeeId = employeeId;
         this.salary = salary;
    }

    public void display() {
         super.display();
         System.out.println("Employee ID: " + employeeId);
         System.out.println("Salary: " + salary);
    }
}
//Suppose you are the manager of a retail store and you want to manage the details of your employees
// Person.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
         this.name = name;
         this.age = age;
    }

    public void display() {
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
    }
}
//Suppose you are the manager of a retail store and you want to manage the details of your employees
//Main.java

public class Code2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.print("Enter employee name: ");
         String name = scan.nextLine();
         // System.out.print("Enter employee age: ");
         int age = scan.nextInt();
         scan.nextLine();
         // System.out.print("Enter employee ID: ");
         String employeeId = scan.nextLine();
         // System.out.print("Enter employee salary: ");
         double salary = scan.nextDouble();
         Employee employee = new Employee(name, age, employeeId, salary);
         employee.display();

         scan.close();
    }
}