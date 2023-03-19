// A group of ‘n’ candidates has applied for faculty recruitment. 
// Their Name, qualification, experience, and gender are to be 
// stored in the class “Recruitment”. Write a program to sort the 
// objects based on their experience and display their details.
// Input format

// The first line specifies the number of employees n.

// In the following lines, the input consists of the Name, qualification, 
// gender, and experience of the faculty that will be given for n employees.

// Refer to the sample input.
// Output format

// The output prints the details of the faculty in the sorted order 
// of their experience.

// Refer to the sample output for the formatting specifications.
// Sample testcases
// Input 1
// 2
// ram
// Be cse
// male
// 2
// pravin
// Be ece
// male
// 3
// Output 1
// pravin
// Be ece
// 3
// ram
// Be cse
// 2

//import java.io.*;
import java.util.*;

class Recruitment implements Comparable<Recruitment> {
    public String name, qualification, gender;
    public int experiance;

    public int compareTo(Recruitment m) {
        return m.experiance - this.experiance;
    }

    public Recruitment(String nm, String qua, String gender, int exp) {
        this.name = nm;
        this.experiance = exp;
        this.qualification = qua;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}

class Code6 {
    public static void main(String[] args) {
        ArrayList<Recruitment> emp_list = new ArrayList<Recruitment>();
        Scanner in = new Scanner(System.in);
        int num_of_emp;
        num_of_emp = in.nextInt();
        for (int i = 0; i < num_of_emp; i++) {
            int exp;
            String name, qua, gender;

            name = in.nextLine();
            qua = in.nextLine();
            gender = in.nextLine();
            in.nextLine();
            exp = in.nextInt();

            emp_list.add(new Recruitment(name, qua, gender, exp));
        }
        Collections.sort(emp_list);
        for (Recruitment each : emp_list) {
            System.out.print(each.name);
            System.out.println(each.qualification);
            System.out.println(each.gender);
            System.out.println(each.experiance);
        }
        in.close();
    }
}