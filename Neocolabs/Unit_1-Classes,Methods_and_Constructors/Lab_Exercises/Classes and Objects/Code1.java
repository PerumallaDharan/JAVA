// Question No: 1
// Multi File Programming Question

// Problem Statement

// Design a program that allows a user to manage a list of employees. 
// The program should use classes and objects to create and store Employee 
// objects, and allow the user to add or remove employees from the list. 
// The program should have the following functionality:

// Add employee: The user should be able to enter a name and ID for a 
// new employee, and the program should create an Employee object with 
// the given details and add it to the list.

// Remove employee: The user should be able to enter an employee ID and 
// the program should search the list for an Employee object with the given 
// ID. If an Employee object is found, it should be removed from the list. 
// If no Employee object is found, the program should display an appropriate message.

// Display all employees: The program should display a list of all 
// employees currently on the list.

// Exit: The user should be able to exit the program.

// The program should consist of three classes: Main, Employee, and 
// EmployeeList.

// The Main class should contain the main method and the user interface.

// The Employee class should represent an individual employee, with attributes 
// for name and ID, and a toString method to display employee details.

// The EmployeeList class should contain an array of Employee objects and 
// methods to add, remove, and display employees. The program should not use 
// any collection classes.
// Input format

// The first line of input should be an integer corresponding to the desired 
// option:

//   1. Add an employee by entering their name and ID.

//   2. Remove an employee by entering their ID.

//   3. Display employee details.

//   4. Exit.

// For each employee added or removed, the user should input:

//   - Option 1: The name and ID of the employee to be added.

//   - Option 2: The ID of the employee to be removed.

// To display employee details, the user should input:

//   - Option 3: To display details for all employees.

// Refer to the sample input for the formatting specifications.
// Output format

// When an employee is added or removed, the program should display a message 
// indicating the success or failure of the operation.

// When displaying all employees, the program should display the name and ID of 
// each employee in the list, in the format "Employee ID: [ID], Name: [name]".

// When the program is exited, it should simply exit without displaying any output.

// Refer to the Sample Output for the formatting specifications.
// Code constraints

// Employee names can contain alphabetic characters and spaces and are limited to 
// a maximum length of 20 characters.

// Employee IDs are positive integers less than 10,000.

// The program can store up to 10 employees on the list.

// The program should not use any collection classes.
// Sample testcases
// Input 1

// 1
// Raj
// 10
// 1
// Jenni
// 20
// 1
// Faxi
// 30
// 3
// 2
// 10
// 2
// 20
// 3
// 4

// Output 1

// Employee added.
// Employee added.
// Employee added.
// Employee ID: 10, Name: Raj
// Employee ID: 20, Name: Jenni
// Employee ID: 30, Name: Faxi
// Employee removed.
// Employee removed.
// Employee ID: 30, Name: Faxi

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            EmployeeList employeeList = new EmployeeList();

            while (true) {
                /*
                 * System.out.println("1. Add employee");
                 * System.out.println("2. Remove employee");
                 * System.out.println("3. Display all employees");
                 * System.out.println("4. Exit");
                 * System.out.print("Enter choice: ");
                 */
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // System.out.print("Enter employee name: ");
                        String name = scanner.next();
                        // System.out.print("Enter employee ID: ");
                        int id = scanner.nextInt();
                        Employee employee = new Employee(name, id);
                        employeeList.addEmployee(employee);
                        break;

                    case 2:
                        // System.out.print("Enter employee ID to remove: ");
                        id = scanner.nextInt();
                        employeeList.removeEmployee(id);
                        break;

                    case 3:
                        employeeList.displayEmployees();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class EmployeeList {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size] = employee;
            size++;
            System.out.println("Employee added.");
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                size--;
                System.out.println("Employee removed.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void displayEmployees() {
        if (size == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(employees[i]);
            }
        }
    }
}
