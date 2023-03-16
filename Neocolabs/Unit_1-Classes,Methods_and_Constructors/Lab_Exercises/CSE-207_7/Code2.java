// Design a class named Account that contains:
// ■ A private int data field named id for the account (default 0).
// ■ A private double data field named balance for the account (default 0).
// ■ A private double data field named annualInterestRate that stores the current 
// interest rate (default 0). Assume all accounts have the same interest rate.
// ■ A no-arg constructor that creates a default account.
// ■ A constructor that creates an account with the specified id and initial balance.
// ■ The accessor and mutator methods for id, balance, and annualInterestRate.
// ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
// ■ A method named getMonthlyInterest() that returns the monthly interest.
// ■ A method named withdraw that withdraws a specified amount from the account.
// ■ A method named deposit that deposits a specified amount to the account.

// Input format
// enter id <int>
// enter balance <double>
// interest rate <double>
// withdraw amount <double>
// deposite amount <double>
// Output format
// <see the sample output>

// ACCOUNT STATEMENT
// Account ID: <int>
// Balance: $<double>
// Monthly interest: $<double>

// Sample testcases
// Input 1
// 123
// 2001
// 4
// 100
// 600
// Output 1
// ACCOUNT STATEMENT
// Account ID: 123
// Balance: $2501.00
// Monthly interest: $8.34
import java.util.*;

class Account {
    int id;
    double bal, ir, wd, da;
    int l;

    Account() {
        id = 0;
        bal = ir = wd = da = 0.0;
    }
}

class Code2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account();
        a1.id = sc.nextInt();
        a1.bal = sc.nextDouble();
        a1.ir = sc.nextDouble();
        a1.wd = sc.nextDouble();
        a1.da = sc.nextDouble();
        double pr = a1.bal + a1.da - a1.wd;
        double r = pr * (1 + (a1.ir * 0.01) * 1 / 12) - pr;
        System.out.println("ACCOUNT STATEMENT");
        System.out.println("Account ID: " + a1.id);
        System.out.printf("Balance: $%.2f", pr);
        System.out.println();
        System.out.printf("Monthly interest: $%.2f", r);
        sc.close();
    }
}