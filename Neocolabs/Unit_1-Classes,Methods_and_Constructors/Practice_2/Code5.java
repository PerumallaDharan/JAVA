// BO Classes

// We can use a BO class for computational purposes.

// The Stall owners wanted to calculate the total cost of a 
// particular item type for the given timeline. So add a feature 
// in the application to calculate the total cost for the given timeline.

// Create a class ItemType with the following attributes,

// Add appropriate getter/setter, default, and parameterized 
// constructor.

// public ItemType(String name, Double deposit, Double costPerDay).

// Get the start date and end date (manipulate as Date object) 
// from the stall owners to calculate rent for the particular 
// ItemType. Write a method calculateCost in ItemTypeBO class. 

// Create a driver class Main to test the above classes.

// Note: Strictly adhere to the Object-Oriented Specifications 
// given in the problem statement.

// All class names, attribute names, and method names should be the 
// same as specified in the problem statement.

// Display only 1 digit after decimal while displaying cost.

// The input date format is dd/MM/yyyy.
// Input format

// The first line of the input consists of a string

// The second and third line of the input consists of double values.

// The fourth and fifth line consists of starting date and the ending date.
// Output format

// The output displays the details.

// Refer to the sample outputs for the formatting specifications.
// Sample testcases

// Input 1
// Morsh
// 1000.00
// 50.00
// 12/10/2018
// 10/10/2018
// Output 1
// Morsh
// 1000.0
// 50.0
// 100.0

//import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class ItemType {
    public String name;
    public double deposit;
    public double costPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public ItemType() {
        this.name = null;
        this.deposit = 0;
        this.costPerDay = 0;
    }

    public ItemType(String name, Double deposit, Double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
        System.out.println(this.name);
        System.out.println(this.deposit);
        System.out.println(this.costPerDay);
    }
}

class ItemTypeBO {
    public Double calculateCost(Date start, Date end, ItemType typeIns) {
        long diff = (start.getTime() - end.getTime()) / 86400000;
        double result = diff * typeIns.costPerDay;
        return result;
    }
}

class Code5 {
    public static void main(String[] args) throws ParseException {
        ItemType i = new ItemType();
        Scanner sc = new Scanner(System.in);
        DecimalFormat dd = new DecimalFormat("0.0");
        i.name = sc.nextLine();
        i.deposit = Double.parseDouble(sc.nextLine());
        i.costPerDay = Double.parseDouble(sc.nextLine());
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        ItemType i1 = new ItemType(i.name, i.deposit, i.costPerDay);
        Date start = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        Date end = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
        ItemTypeBO iBO = new ItemTypeBO();
        double result = iBO.calculateCost(start, end, i1);
        System.out.println(dd.format(Math.abs(result)));
        sc.close();
    }
}
