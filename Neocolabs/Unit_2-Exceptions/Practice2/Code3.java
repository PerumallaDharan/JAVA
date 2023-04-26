// User defined Exception

// Sometimes, the built-in exceptions in Java are not able to describe a 
// certain situation. In such cases, user can also create exceptions 
// which are called ‘user-defined Exceptions’.

// Create a class Bank with the following private attributes and 
// Create class BankBO with the following method.

// Include appropriate getters/setters and add constructors.

// Create a driver class called Main. In the Main method, obtain inputs 
// from the user. Validate the balance and if there is an exception, 
// handle the exception and prompt the user(Refer I/O)

// Pass the exception message as "Balance is less than 1000".
// Input format

// First line of the input consists of account number

// Second line of the input consist of name of the account holder

// Third line of the input consists of the account balance
// Output format

// Output prints the account details if the balance is greater than 1000 
// otherwise throws an invalid balance exception.
// Sample testcases
// Input 1

// 10001
// Ankit
// 5000

// Output 1

// 10001 Ankit 5000.0

// Input 2

// 10001
// Ankit
// 500

// Output 2

// Balance is less than 1000
// InvalidBalanceException

import java.util.*;

class Bank {
    private int accno;
    private String name;
    private double bal;

    public Bank() {
        this.accno = 0;
        this.name = null;
        this.bal = (double) 0;
    }

    public Bank(int accno, String name, double bal) {
        this.accno = accno;
        this.name = name;
        this.bal = bal;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String toString() {
        return accno + " " + name + " " + bal;
    }
}

class BankBO {
    public void validate(Bank b) throws InvalidBalanceException {
        if (b.getBal() < 1000) {
            throw new InvalidBalanceException("Balance is less than 1000");
        }
    }
}

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String s) {
        System.out.println(s);
    }
}

class Code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank b = new Bank();
        b.setAccno(Integer.parseInt(scan.nextLine()));
        b.setName(scan.nextLine());
        b.setBal(Double.parseDouble(scan.nextLine()));
        BankBO bbo = new BankBO();
        try {
            bbo.validate(b);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e);
        }

        scan.close();
    }
}