// Item details-Abstract class

// Let's try creating an abstract class ItemType and extend it 
// in the child classes. Create an abstract method calculateAmount() 
// and implement it in all the child classes.

// Create an abstract class ItemType with the following method,

// Create a class wooden which extends ItemType with the following 
// attributes and implements calculateAmount method,

// Create a class electronics which extends ItemType with the following 
// attributes and implements calculateAmount method,

// Add appropriate getters/setters & constructors. 

// Write a driver class Main to test them. Print the results in the main 
// method.
// Input format

// The first line of the input consists of the choice

// The next input is the wooden class attributes or electronics attributes 
// based on the choice of input.
// Output format

// Output prints a double value based on the choice of input.
// Sample testcases
// Input 1
// 1
// 10
// 1000
// Output 1
// 10000.0

// Input 2
// 2
// Academics
// 10000
// Output 2
// 9500.0

// Input 3
// 2
// Commercial
// 10000
// Output 3
// 10000.0

// Whitelist
// Set 1:
// abstract class ItemType
// public abstract double calculateAmount()
// class wooden extends ItemType 

import java.util.*;

abstract class ItemType {
    public abstract double calculateAmount();
}

class wooden extends ItemType {
    private int noOfItems;
    private double cost;

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public wooden() {
        this.noOfItems = 0;
        this.cost = (double) 0;
    }

    public wooden(int noOfItems, double cost) {
        this.noOfItems = noOfItems;
        this.cost = cost;
    }

    public double calculateAmount() {
        return noOfItems * cost;
    }
}

class electronics extends ItemType {
    private String type;
    private double amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public electronics() {
        this.type = null;
        this.amount = (double) 0;
    }

    public electronics(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public double calculateAmount() {
        double result = 0;
        if (type.contains("Academics")) {
            result = amount - (0.05 * amount);
        } else if (type.contains("Commercial")) {
            result = amount;
        }
        return result;
    }
}

class Code1 {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        choice = Integer.parseInt(scan.nextLine());
        wooden w = new wooden();
        electronics e = new electronics();
        if (choice == 1) {
            w.setNoOfItems(Integer.parseInt(scan.nextLine()));
            w.setCost(Double.parseDouble(scan.nextLine()));
            double res = w.calculateAmount();
            System.out.println(res);
        }
        if (choice == 2) {
            e.setType(scan.nextLine());
            e.setAmount(Double.parseDouble(scan.nextLine()));
            double orgAmount = e.calculateAmount();
            System.out.println(orgAmount);
        }

        scan.close();
    }
}
