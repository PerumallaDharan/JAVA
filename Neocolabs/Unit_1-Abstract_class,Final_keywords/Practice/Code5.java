// Create an abstract class "Accounts" with the following attributes:

// int balance;

// int accno;

// String name;

// String address;

// And the following methods

// abstract public void withdrawal(int amount);

// abstract public void deposit(int amount);

// Display() shows the account details

// Create a class SavingsAccount that extends Accounts

// Attributes:

// int rateOfInterest

// Methods:

// calcamt(int balance) that multiplies the rate of interest percentage 
// with the balance and prints the new balance.

// display() that displays the account details.

// deposit(int amount) that prints the new balance by adding the amount.

// withdrawal(int amount) that prints the new balance by subtracting the 
// amount.

// Create a class CurrentAccount that extends Accounts

// Attributes:

// int draftLimit

// Methods:

// display() that displays the account details and draft limit.

// deposit(int amount) that prints the new balance by adding the amount.

// withdrawal(int amount) that prints the new balance by subtracting the 
// amount.

// Note: consider the initial balance for deposit and withdrawal.
// Input format

// The input consists of the account number, balance, account holder 
// name, and address.

// The next input is choice 1 or 2 (1 for savings and 2 for current).

// If the choice is 1, then the next input is the rate of interest.

// The next input is the transaction type 1 or 2(1 for deposit 
// and 2 for withdrawal)

// The last input is the amount for deposit or withdrawal.
// Output format

// The first line of the output prints the account details.

// In the case of savings accounts,

// Next output prints the final amount(balance*rate of interest percentage).

// Next output prints the result of the deposit or withdrawal 
// (Consider the initial balance for this operation).

// Refer sample input and output for formatting specifications.
// Sample testcases
// Input 1
// 252
// 50000
// Alice
// Chennai
// 1
// 10
// 1
// 500
// Output 1
// 252 Alice 50000 Chennai
// 55000
// 50500

// Input 2
// 252
// 50000
// Alice
// Chennai
// 1
// 20
// 2
// 500
// Output 2
// 252 Alice 50000 Chennai
// 60000
// 49500

// Input 3
// 888
// 250000
// Bob
// Coimbatore
// 1
// 30
// 1
// 2500
// Output 3
// 888 Bob 250000 Coimbatore
// 325000
// 252500

// Whitelist
// Set 1:
// abstract class Accounts
// class SavingsAccount extends Accounts
// class CurrentAccount extends Accounts
// abstract public void withdrawl(int amount);
// abstract public void deposit(int amount);
// public void display() 

import java.util.*;

abstract class Accounts {
    public int balance;
    public int accno;
    public String name;
    public String address;

    abstract public void withdrawl(int amount);

    abstract public void deposit(int amount);

    public Accounts(int balance, int accno, String name, String address) {
        this.balance = balance;
        this.accno = accno;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.print(this.accno + " ");
        System.out.print(this.name + " ");
        System.out.print(this.balance + " ");
        System.out.print(this.address);
    }
}

class SavingsAccount extends Accounts {
    int roi;

    public SavingsAccount(int balance, int accno, String name, String address) {
        super(balance, accno, name, address);
    }

    public void setRoi(int r) {
        this.roi = r;
    }

    public int getRoi() {
        return roi;
    }

    public void calcamt(int balance) {
        int interestAmount = (int) balance * roi;
        // System.out.println(interestAmount);
        interestAmount /= 100;
        int finalAmount = balance + interestAmount;
        System.out.println(finalAmount);
    }

    public void display() {
        System.out.print(this.accno + " ");
        System.out.print(this.name + " ");
        System.out.print(this.balance + " ");
        System.out.println(this.address);
    }

    public void deposit(int amt) {
        int res1 = this.balance + amt;
        System.out.println(res1);
    }

    public void withdrawl(int amt) {
        int res2 = this.balance - amt;
        System.out.println(res2);
    }
}

class CurrentAccount extends Accounts {
    int draftLimit;

    public CurrentAccount(int balance, int accno, String name, String address) {
        super(balance, accno, name, address);
    }

    public void setDraftLimit(int dl) {
        this.draftLimit = dl;
    }

    public int getDraftLimit() {
        return draftLimit;
    }

    public void display() {
        System.out.print(this.accno + " ");
        System.out.print(this.name + " ");
        System.out.print(this.balance + " ");
        System.out.println(this.address);
        System.out.println(this.draftLimit);
    }

    public void deposit(int amt) {
        int res1 = this.balance + amt;
        System.out.println(res1);
    }

    public void withdrawl(int amt) {
        int res2 = this.balance - amt;
        System.out.println(res2);
    }
}

class Code5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accno = Integer.parseInt(scan.nextLine());
        int balance = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        String address = scan.nextLine();
        int type = Integer.parseInt(scan.nextLine());

        if (type == 1) {
            SavingsAccount s = new SavingsAccount(balance, accno, name, address);
            s.setRoi(Integer.parseInt(scan.nextLine()));
            s.display();
            s.calcamt(balance);

            int dw = Integer.parseInt(scan.nextLine());
            int amt = Integer.parseInt(scan.nextLine());

            if (dw == 1) {
                s.deposit(amt);
            }

            if (dw == 2) {
                s.withdrawl(amt);
            }
        }

        if (type == 2) {
            CurrentAccount c = new CurrentAccount(balance, accno, name, address);
            c.setDraftLimit(Integer.parseInt(scan.nextLine()));
            c.display();

            int dw1 = Integer.parseInt(scan.nextLine());
            int amt1 = Integer.parseInt(scan.nextLine());

            if (dw1 == 1) {
                c.deposit(amt1);
            }

            if (dw1 == 2) {
                c.withdrawl(amt1);
            }
        }

        scan.close();
    }
}
