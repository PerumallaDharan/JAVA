// Bank Account

// A class that inherits another class and obtains all the latter's 
// attributes and methods is called inheritance. The former is called 
// Child class whilst the latter is called Parent class. This phenomenon 
// would be very promising in applications dealing with multiple classes 
// that are constituted by similar or more likely same attributes. You'll 
// get to know the importance of inheritance from the following problem. 
// All types of accounts in a bank have common attributes which can be 
// inherited from an Account class.

// Create a class Account with the following protected attributes

// Include appropriate getters and setters.

// Include the following protected methods.

// Create a class CurrentAccount with following private attributes which 
// extends Account class

// Create a default constructor and a parameterized constructor with arguments 
// in order CurrentAccount(String accName,String accNo,String bankName,String tinNumber).

// Include appropriate getters and setters.

// Include the following public methods.

// Create a class SavingsAccount with following private attributes which extends Account class

// Create default constructor and a parameterized constructor with arguments in 
// order SavingsAccount(String accName,String accNo,String bankName,String orgName).

// Include appropriate getters and setters.

// Include the following public methods.

// Create a driver class named Main to test the above class.

// Note:

// Strictly adhere to the Object-Oriented Specifications given in the problem 
// statement. All class names, attribute names, and method names should be the 
// same as specified in the problem statement.

// Input format

// The first input corresponds to choosing a current or savings account. 
// 1 for savings and 2 for the current account.

// The next line consists of the account name, account number, bank name, 
// org name, or tin number (according to chosen account type).
// Output format

// The output consists of account details and the TIN number 
// or Organisation name.

// Refer sample output for formatting specifications.
// Sample testcases
// Input 1

// 1
// morsh 02125425 baroda examly

// Output 1

// morsh
// 02125425
// baroda
// examly

// Input 2

// 2
// morsh 20125458520 baroda 798920

// Output 2

// morsh
// 20125458520
// baroda
// 798920

// Whitelist
// Set 1:
// Account
// Set 2:
// SavingsAccount
// Set 3:
// CurrentAccount
// Set 4:
// extends
// void display() 

import java.io.*;
import java.util.*;

class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    protected void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
    }
}

class CurrentAccount extends Account {
    private String tinNumber;

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public CurrentAccount() {
        this.tinNumber = null;
    }

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;
    }

    public void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
        System.out.println(tinNumber);
    }
}

class SavingsAccount extends Account {
    private String orgName;

    public SavingsAccount() {
        this.accName = null;
        this.accNo = null;
        this.bankName = null;
        this.orgName = null;
    }

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void display() {
        System.out.println(this.accName);
        System.out.println(this.accNo);
        System.out.println(this.bankName);
        System.out.println(orgName);
    }
}

class Code2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        if (n == 1) {
            s.setAccName(sc.next());
            s.setAccNo(sc.next());
            s.setBankName(sc.next());
            s.setOrgName(sc.next());
            SavingsAccount s1 = new SavingsAccount(s.getAccName(), s.getAccNo(), s.bankName, s.getOrgName());

            s1.display();
        }
        if (n == 2) {
            c.setAccName(sc.next());
            c.setAccNo(sc.next());
            c.setBankName(sc.next());
            c.setTinNumber(sc.next());
            CurrentAccount c1 = new CurrentAccount(c.accName, c.accNo, c.bankName, c.getTinNumber());
            c1.display();
        }
    }
}
