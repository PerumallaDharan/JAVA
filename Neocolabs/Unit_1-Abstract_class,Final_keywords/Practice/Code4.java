// Considering the Banking Scenario, You have different types of 
// accounts like Current Account, and Savings Account which inherit 
// the base class Account.

// Create a base class Account with the fields - String name, int 
// number, int balance, and Date startDate.

// Create two subclasses CurrentAccount & SavingsAccount which 
// extend Account.

// Declare a method in Account class - calculate interest which 
// would return the interest (double) and get duedate (Date) as a 
// parameter. Since the Account class itself does not know how to 
// compute and calculate interest, we mark the method and class abstract.

// In SavingsAccount & CurrentAccount - The interest is calculated 
// as simple interest. (Interest 12% for the savings account and 5% 
// for the Current account.)

// Get the input from the user and print the calculated interest. 
// Refer sample input and output.

// Note:

// Utility methods to calculate months between two date objects.

// import java. util.*;

//   public int monthsDifference(Date startDate, Date endDate)  

//     Calendar c1 = new GregorianCalendar();

//     c1.setTime(startDate);

//     Calendar c2 = new GregorianCalendar();

//     c2.setTime(endDate);

//     int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR))*12;

//     ans += c2.get(c2.MONTH)-c1.get(c1.MONTH);

//     return ans;

//   }
// Input format

// The first line of the input consists of Account Type (1 for savings account, 2 for current account).

// The second line of the input consists of Name.

// The third line of the input consists of Account Number.

// The fourth line of the input consists of Amount.

// The fifth and six-line consist of Start Date and End Date.
// Output format

// The output prints the calculated Interest value.
// Sample testcases
// Input 1
// 1
// Karthick
// 101521502
// 7000
// 22/04/2013
// 22/04/2016
// Output 1
// 2520.0

// Input 2
// 2
// Karthick
// 111521502
// 4000
// 22/04/2014
// 22/04/2015
// Output 2
// 200.0

import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;

abstract class Account {
    String name;
    int number;
    int balance;
    Date startDate;

    public Account(String name, int number, int balance, Date startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }

    abstract public double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account {
    public CurrentAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }

    public double calculateInterest(Date dueDate) {
        double interest;
        interest = (balance * 5 * (monthsDifference(startDate,
                dueDate) / 12)) / 100;
        return interest;
    }

    public int monthsDifference(Date startDate, Date endDate) {
        Calendar c1 = new GregorianCalendar();
        c1.setTime(startDate);
        Calendar c2 = new GregorianCalendar();
        c2.setTime(endDate);
        // int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR)) * 12;
        // ans += c2.get(c2.MONTH) - c1.get(c1.MONTH);
        int ans = (c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR)) * 12;
        ans += c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        return ans;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }

    public double calculateInterest(Date dueDate) {
        double interest;
        interest = (balance * 12 * (monthsDifference(startDate,
                dueDate) / 12)) / 100;
        return interest;
    }

    public int monthsDifference(Date startDate, Date endDate) {
        Calendar c1 = new GregorianCalendar();
        c1.setTime(startDate);
        Calendar c2 = new GregorianCalendar();
        c2.setTime(endDate);
        int ans = (c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR)) * 12;
        ans += c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        return ans;
    }
}

class Code4 {
    public static void main(String args[]) throws ParseException {
        Scanner scan = new Scanner(System.in);
        int type = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        int balance = Integer.parseInt(scan.nextLine());
        String dateString = scan.nextLine();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate = formatter.parse(dateString);

        dateString = scan.nextLine();
        Date dueDate = formatter.parse(dateString);

        if (type == 1) {
            SavingsAccount sObj = new SavingsAccount(name, number, balance,
                    startDate);
            System.out.println(sObj.calculateInterest(dueDate));
        }

        else {
            CurrentAccount cObj = new CurrentAccount(name, number, balance,
                    startDate);
            System.out.println(cObj.calculateInterest(dueDate));
        }

        scan.close();
    }
}
