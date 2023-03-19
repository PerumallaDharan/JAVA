// Big Bash Event

// The fair has an event called Big Bash event. It is conducted to 
// increase the business of the stalls. It gives a discount on 
// particular bills and the constraint is not told to the audience 
// attending the fair. Create a program to check whether a bill is 
// eligible for the BigBash event or not. The eligibility is calculated 
// on the basis of the purchase date. If the month in the purchased 
// date is even, then the bill is eligible for the event. If the 
// purchased month is odd, then it is not eligible for the event. If 
// the bill is eligible for the event, then the discount is given. The 
// discount percentage should be the purchased month number.

// Example:

// If the purchased date is --> 12-10-2017 [dd/MM/yyyy format]

// The purchased month is 10, so Peter is eligible for the event, and 
// a discount of 10% should be given to the user.

// If the purchased amount is 100, then the discount amount is 10. So, 
// the total amount is 100-10= 90.

// If the purchased date is --> 12-01-2018 [dd/MM/yyyy format]

// The purchased month is 01, so Peter is not eligible for the event.

// Create a class Event with the following methods,

// Create a driver class Main to test the above class.

// ﻿[Note: Strictly adhere to the object-oriented specifications given 
// as a part of the problem statement. Use the same class names, attribute 
// names, and method names]
// Input format

// The first line of the input is the purchased date.

// The second line of input is an Integer which corresponds to the 
// purchase amount.
// Output format

// The output consists of discounted amount if he is eligible for the event, 
// else display "Not Eligible for BIGBASH event".

// Refer sample output for formatting specifications.
// Sample testcases
// Input 1
// 12/12/2017
// 100
// Output 1
// 88.0

// Input 2
// 10/11/2008
// 50.00
// Output 2
// Not Eligible for BIGBASH event

//import java.io.*;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;

class Event {
    public int checkEventAvailable(Date start) {
        Calendar c = Calendar.getInstance();
        c.setTime(start);
        if ((c.get(Calendar.MONTH) + 1) % 2 == 0) {
            return c.get(Calendar.DATE);
        } else {
            return 0;
        }
    }

    public double getAmountWithDiscount(double amount, int dis) {
        double result = amount - dis;
        return result;
    }
}

class Code5 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dd = new DecimalFormat("0.0");
        double amount;
        Calendar c = Calendar.getInstance();
        String date1 = sc.nextLine();
        amount = Double.parseDouble(sc.nextLine());
        Event e = new Event();
        Date start = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        c.setTime(start);
        int dis = e.checkEventAvailable(start);
        if (dis == c.get(Calendar.DATE)) {
            double finalAmount = e.getAmountWithDiscount(amount, dis);
            System.out.println(dd.format(finalAmount));
        } else if (dis == 0) {
            System.out.println("Not Eligible for BIGBASH event");
        }
        sc.close();
    }
}