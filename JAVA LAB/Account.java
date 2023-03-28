
class Account_demo {
    private int id;
    private double bal, annual_rate;
    // private double monthly_rate, monthly;

    Account_demo() {
        id = 0;
        bal = 0;
        annual_rate = 3;
        // monthly_rate = 0;
        // monthly = 0;
    }

    Account_demo(int id, double bal) {
        this.id = id;
        this.bal = bal;
    }

    public int setid(int id) {
        return this.id = id;
    }

    public int getid() {
        return this.id;
    }

    public double setbal(double bal) {
        return this.bal = bal;
    }

    public double getbal() {
        return this.bal;
    }

    public double setannual_rate(double annual_rate) {
        return this.annual_rate = annual_rate;
    }

    public double getannual_rate() {
        return this.annual_rate;
    }

    // public double getmonthly_rate(double monthly_rate) {
    //     return this.monthly_rate = monthly_rate;
    // }

    // public double getmonthly(double monthly) {
    //     return this.monthly = monthly;
    // }

    void withdraw(double withdraw_amount) {
        if (bal - withdraw_amount < 0) {
            System.out.println("Insufficent Balance");
        } else {
            bal = bal - withdraw_amount;
            System.out.println("Amount withdraw = " + withdraw_amount);
            System.out.println("Remaining bal = " + bal);
        }
    }

    void deposit(double deposit_amount) {
        bal = bal + deposit_amount;
        System.out.println("Amount deposited");
        System.out.println("Balance = " + bal);
    }

    void display(){
        System.out.println("Id = "+id);
        System.out.println("Balance = "+bal);
        System.out.println("Annual Rate = "+(this.bal*this.annual_rate)/12);
    }
}

public class Account {
    public static void main(String[] args) {
        Account_demo obj = new Account_demo(5,100);
        obj.display();
    }
}