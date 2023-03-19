// Sunrise Basket's founder has decided to organize a fun event at 
// your college. The event coordinator has announced a coding contest 
// for creating the application for the Contest. The Best application 
// would be used for the fair and the developer gets a cash prize. You 
// are a well-versed and aspiring Programmer in your college. Many 
// programmers have enrolled themselves for the contest and you are 
// one of them. Every contestant is provided with a Schema diagram of 
// the Fair. Get yourself acquainted with Schema and brace yourself for 
// the challenge!!!.

// As a part of this, the Application requires a user prompt to create a 
// new Item type. Hence create an ItemType class with the following 
// private attributes.

//     name (String)
//     deposit(double)
//     costPerDay(double)

// Include appropriate Getters and Setters for the class and also include 
// a method "void display()" to display the output shown in the sample output.

// The main class is implemented already to get input from the user and 
// display. Write the suitable code complete ItemType class.
// Input format

// The first line of input consists of the name of the item.

// The second line of input consists of the Deposit money.

// The third line of input consists of the Cost per day.
// Output format

// The output displays the details as shown in the sample output.
// Sample testcases
// Input 1
// Fan
// 5000
// 300
// Output 1
// Name : Fan
// Deposit Amount : 5000.0
// Cost per day : 300.0

import java.util.*;

class ItemType {
    String name;
    double deposit;
    double costPerDay;

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Deposit Amount : " + this.deposit);
        System.out.println("Cost per day : " + this.costPerDay);
    }

}

class Code7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ItemType obj1 = new ItemType();

        String name = sc.nextLine();
        double deposit = sc.nextDouble();
        double costPerDay = sc.nextDouble();

        obj1.setName(name);
        obj1.setDeposit(deposit);
        obj1.setCostPerDay(costPerDay);
        obj1.display();
        sc.close();
    }
}