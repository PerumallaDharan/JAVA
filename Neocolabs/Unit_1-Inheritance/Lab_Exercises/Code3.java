// Account Details

// Multi-level inheritance means inheriting a class that has already 
// inherited another. So before going to our application taking this 
// fresh concept, let's try it out in a simple example first. We can 
// create 3 classes where one is the parent, the next is the child 
// and the third is the child of the child class. Take an example of 
// an account handling application, where you get details from the user 
// in comma-separated format and save them as objects and then display them.

// Create a class Account with the following protected attributes,
// Create a class SavingAccount which extends Account with the following 
// protected attributes,
// Create a class FixedAccount which extends SavingAccount with the 
// following private attributes,
// Create a class AccountBO with the following methods,
// Get the FixedAccount detail from the user as a comma separated value, 
// the account detail should be given in the below format,
// accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod
// Split the details and Display the details in the below format,
// System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number",
// "Balance","Account holder name","Minimum balance","Locking period")

// Create a driver class Main to test the above classes.

// [Note: Strictly adhere to the object-oriented specifications given 
// as a part of the problem statement. Use the same class names, attribute names, and method names]

// Input format
// The account detail should be given in the below format,
// accountNumber,balance,accountHolderName,minimunBalance,lockingPeriod.

// Output format
// The output consists of the fixed account detail.

// Sample testcases

// Input 1
// ACC001,5456.45,Tony Blake,500,10
// Output 1
// Account Number       Balance    Account holder name  Minimum balance      Locking period
// ACC001               5456.45    Tony Blake           500                  10

// Whitelist
// extends
// this
// class Account
// class SavingAccount
// class FixedAccount
// class AccountBO 

import java.io.*;
import java.util.*;

class Account {
    protected String accountNumber;
    protected double balance;
    protected String accountHoldername;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }

}

class SavingAccount extends Account {
    protected double minimumBalance;

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}

class FixedAccount extends SavingAccount {
    private int lockingPeriod;

    public int getLockingPeriod() {
        return lockingPeriod;
    }

    public void setLockingPeriod(int lockingPeriod) {
        this.lockingPeriod = lockingPeriod;
    }
}

class AccountBO {
    public void getAccountDetail(String detail) {
        String[] bank = detail.split(",");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name",
                "Minimum balance", "Locking period");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", bank[0], bank[1], bank[2], bank[3], bank[4]);
    }
}

class Code3 {
    public static void main(String[] args) {
        String detail;
        Scanner sc = new Scanner(System.in);
        detail = sc.nextLine();
        AccountBO ab = new AccountBO();
        ab.getAccountDetail(detail);
    }
}
