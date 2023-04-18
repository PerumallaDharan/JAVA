// Reward calculation

// A new announcement has been made by the Mayor, the Fair will be 
// on for more than a month. For rewarding customers who actively 
// purchase in the fair, the developers are asked to compute reward 
// points for credit card purchasing. For a small demo implementation, 
// we now compute reward points for VISA card and HP VISA card. The reward 
// points for VISA card is 1% of the spending for all kinds of purchases. 
// For HP Visa card, 10 additional points are given for fuel purchases. 
// Also, include method Overriding for the method computeRewardPoints() 
// which computes the reward points for both types. write a program using 
// the above specification for computing the reward points.

// Create a class named VISACard with the following private attributes

// The VISACard class has the following methods

// Create a class named HPVISACard that extends VISACard with the following methods

// Create a driver class called Main. In the Main method, obtain inputs from 
// the user and compute the reward points by calling appropriate methods. If 
// choice other than specified is chosen, print "Invalid choice"

// Hint: Call Super() to access the computeRewardPoints in the derived class 
// and then add additional points if given criteria qualifies.

// Note: Display one digit after the decimal point for Double values.

// [Strictly adhere to the Object-Oriented Specifications given in the problem 
// statement.

// All class names, attribute names and method names should be the same as 
// specified in the problem statement.]

// Input format

// The first line of the input consists of the holder's name.

// The second line consists of the CCV number.

// The third line consists of the bill amount.

// The fourth line consists of the type.

// The fifth line of the input consists of the choice.

// Output format

// The output displays the reward points.

// Sample testcases

// Input 1
// mahesh
// 9871-9874-4569
// 1000
// fuel
// 1
// Output 1
// 10.0

// Input 2
// mahesh
// 9871-9874-4569
// 1000
// fuel
// 2
// Output 2
// 20.0

// Input 3
// mahesh
// 9871-9874-4569
// 1000
// fuel
// 3
// Output 3
// Invalid Choice

// Whitelist
// public Double computeRewardPoints(String purchaseType, Double amount)
// class VISACard
// class HPVISACard
// extends 

import java.util.*;
import java.text.DecimalFormat;

class VISACard {
    private String holderName;
    private String ccv;

    public Double computeRewardPoints(String purchaseType, Double amount) {
        double dis = 0.01 * amount;
        return dis;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
}

class HPVISACard extends VISACard {
    public Double computeRewardPoints(String purchaseType, Double amount) {
        double dis = super.computeRewardPoints(purchaseType, amount);
        if (purchaseType.compareTo("fuel") == 0) {
            return dis + 10;
        } else {
            return dis;
        }
    }
}

class Code4 {
    public static void main(String[] args) {
        VISACard v = new VISACard();
        HPVISACard h = new HPVISACard();
        DecimalFormat d = new DecimalFormat("0.0");
        Scanner scan = new Scanner(System.in);
        v.setHolderName(scan.nextLine());
        v.setCcv(scan.nextLine());
        Double amount = Double.parseDouble(scan.nextLine());
        String type = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        if (n == 1) {
            double res = v.computeRewardPoints(type, amount);
            System.out.println(d.format(res));
        }
        if (n == 2) {
            double res = h.computeRewardPoints(type, amount);
            System.out.println(d.format(res));
        }
        if (n > 2) {
            System.out.println("Invalid Choice");
        }

        scan.close();
    }
}
