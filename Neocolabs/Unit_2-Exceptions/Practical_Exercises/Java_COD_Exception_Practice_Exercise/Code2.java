// NumberFormatException

// Another common type of exception which you would have come across already. When you use BufferedReader to read input you need to parse String it into various datatype like Integer, Double. For example, If you try to parse a String ("abc") into Integer, it throws NumberFormatException. So let's try to handle this NumberFormat exception.

// In our application, while acquiring attributes for classes like ItemType, this exception may occur. So try to handle it in this program.

// Create a class ItemType with the following attribute,

// Add appropriate getter/setter, default and parameterized constructor. public ItemType(String name, Double deposit, Double costPerDay). Override toString() and print the details.

// Handle the NumberFormatException in the Main Class.

// Refer sample input/output for other further details and format of the output.
// Input format

// The first line of the input consists of the name.

// The second line of the input consists of the deposit.

// The third line of the input consists of the costPerDay.
// Output format

// The output prints the item details or the exception details.
// Sample testcases
// Input 1

// Electronics
// 1000
// 100

// Output 1

// Electronics 1000.0 100.0

// Input 2

// Electronics
// one thousand

// Output 2

// java.lang.NumberFormatException: For input string: "one thousand"

// Whitelist
// Set 1:
// try
// Set 2:
// catch
// Set 3:
// NumberFormatException 

import java.util.*;

class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;

    public ItemType() {
        this.name = null;
        this.deposit = 0;
        this.costPerDay = 0;
    }

    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

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

    public String toString() {
        return name + " " + deposit + " " + costPerDay;
    }
}

class Code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ItemType i = new ItemType();
        try {
            i.setName(scan.nextLine());
            i.setDeposit(Double.parseDouble(scan.nextLine()));
            i.setCostPerDay(Double.parseDouble(scan.nextLine()));
            System.out.println(i);
        } catch (NumberFormatException n) {
            System.out.println(n);
        }

        scan.close();
    }
}
