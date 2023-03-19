// Problem Statement

// Design a program that allows a user to manage a list of courses. 
// The program should use classes and objects to create and store 
// Course objects, and allow the user to add or remove courses from 
// the list. The program should have the following functionality:

// Add course: The user should be able to enter a name and code for 
// a new course, and the program should create a Course object with 
// the given details and add it to the list.

// Remove course: The user should be able to enter a course code and 
// the program should search the list for a Course object with the 
// given code. If a Course object is found, it should be removed from 
// the list. If no Course object is found, the program should display 
// an appropriate message.

// Display all courses: The program should display a list of all courses 
// currently in the list.

// Exit: The user should be able to exit the program.

// The program should consist of three classes: Main, Course, and 
// CourseList.

// The Main class should contain the main method and the user 
// interface.

// The Course class should represent an individual course, with 
// attributes for name and code, and a toString method to display 
// course details.

// The CourseList class should contain an array of Course objects 
// and methods to add, remove, and display courses.
// Input format

// The input should be an integer corresponding to the desired option:

//   1. Add a course by entering the course name and course code.

//   2. Remove a course by entering the course code.

//   3. Display course details.

//   4. Exit.

// For each course added or removed, the user should input:

//   - Option 1: The course name and code of the course to be added.

//   - Option 2: The code of the course to be removed.

// To display employee details, the user should input:

//   - Option 3: To display details of all courses

// Refer to the sample input for the formatting specifications.
// Output format

// The program outputs messages to the console indicating the status 
// of the operations performed.

// When adding or removing a course, the program outputs a message indicating 
// whether the operation was successful or not.

// When displaying all employees, the program should display the course name 
// and code of each course in the list, in the format "Code code: [code], 
// Name: [name]".

// When the program is exited, it should simply exit without displaying any 
// output.

// Refer to the sample output for the formatting specifications.
// Code constraints

// Course name must be at most 20 characters long.

// Course code must be a positive integer value.

// The maximum number of courses that can be added is 10.

// Sample testcases
// Input 1
// 1
// CSE
// 101
// 1
// ECE
// 102
// 1
// EEE
// 103
// 1
// asdfghjkllkjhgfdsaqwe
// 104
// 1
// DS
// 101
// 1
// ML
// -8
// 3
// 2
// -8
// 2
// 103
// 3
// 6
// 4
// Output 1
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Invalid name. Please enter a name with at most 20 characters.
// Course with the given code already exists. Cannot add course.
// Invalid code. Please enter a positive integer value for the course code.
// All courses:
// Course code: 101, Name: CSE
// Course code: 102, Name: ECE
// Course code: 103, Name: EEE
// Course not found.
// Course removed successfully.
// All courses:
// Course code: 101, Name: CSE
// Course code: 102, Name: ECE
// Invalid choice. Please enter a valid choice.

// Input 2
// 3
// 4
// Output 2
// No courses to display.

// Input 3
// 1
// Computer Science
// 101
// 1
// Chemistry
// 102
// 1
// Physics
// 103
// 1
// Mathematics
// 104
// 1
// Electronics
// 105
// 1
// Mechanics
// 106
// 1
// Thermodynamics
// 107
// 1
// Solid Mechanics
// 108
// 1
// Fluid Mechanics
// 109
// 1
// Data Structures and Algorithms
// 110
// 1
// Operating Systems
// 111
// 1
// 12
// 3
// 4
// Output 3
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Course added successfully.
// Invalid name. Please enter a name with at most 20 characters.
// Course added successfully.
// Course list is full. Cannot add course.

// Input 4
// 5
// 4
// Output 4
// Invalid choice. Please enter a valid choice.

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CourseList courseList = new CourseList();

            while (true) {
                /*
                 * System.out.println("\nCourse Management System\n");
                 * System.out.println("1. Add course");
                 * System.out.println("2. Remove course");
                 * System.out.println("3. Display all courses");
                 * System.out.println("4. Exit\n");
                 * 
                 * System.out.print("Enter your choice: ");
                 */
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine(); // Consume newline left-over
                        // System.out.print("\nEnter course name: ");
                        String name = scanner.nextLine();
                        // System.out.print("Enter course code: ");
                        int code = scanner.nextInt();
                        String result = courseList.addCourse(name, code);
                        System.out.println(result);
                        break;
                    case 2:
                        // System.out.print("\nEnter course code: ");
                        code = scanner.nextInt();
                        result = courseList.removeCourse(code);
                        System.out.println(result);
                        break;
                    case 3:
                        courseList.displayAllCourses();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid choice.");
                }
            }
        }
    }
}

class Course {
    private String name;
    private int code;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String toString() {
        return "Course code: " + code + ", Name: " + name;
    }
}

class CourseList {
    private Course[] courses = new Course[10];
    private int count = 0;

    public String addCourse(String name, int code) {
        if (count == courses.length) {
            return "Course list is full. Cannot add course.";
        }

        if (name.length() > 20) {
            return "Invalid name. Please enter a name with at most 20 characters.";
        }

        if (code <= 0) {
            return "Invalid code. Please enter a positive integer value for the course code.";
        }

        for (int i = 0; i < count; i++) {
            if (courses[i].getCode() == code) {
                return "Course with the given code already exists. Cannot add course.";
            }
        }

        courses[count++] = new Course(name, code);
        return "Course added successfully.";
    }

    public String removeCourse(int code) {
        for (int i = 0; i < count; i++) {
            if (courses[i].getCode() == code) {
                for (int j = i; j < count - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--count] = null;
                return "Course removed successfully.";
            }
        }
        return "Course not found.";
    }

    public void displayAllCourses() {
        if (count == 0) {
            System.out.println("No courses to display.");
        } else {
            System.out.println("All courses:");
            for (int i = 0; i < count; i++) {
                System.out.println(courses[i].toString());
            }
        }
    }
}
