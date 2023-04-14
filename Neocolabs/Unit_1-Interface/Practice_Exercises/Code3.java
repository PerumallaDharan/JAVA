// Create an interface Product with two abstract methods void ProductDetails() 
// and void show_Bill()
// void ProductDetails() This method will take input from the user about an order 
// placed(no_of items, name of the individual product, and cost of the individual 
// product and then calculate the total bill of the order using the following conditions:
// if total bill is <= 10000 than, GST 0%
// if the total bill is > 10000 and <=30000, then add 5 % GST to the total bill
// if the total bill is >30000 and <= 50000 then add 7% GST to the total bill
// if the total bill is > 50000 then add 9% GST to the total bill
// void show_Bill() This method will display the total bill.
// Also, create class Customer with two methods:
// void getdetails(); This function will input details of the customer
// void showdetails(); This function will print details of the customer.
// Create OrderOnline class which is a Driver class. It will inherit the properties of the Product 
// interface and Customer class.

// Refer to the input format and output format.

// Input format
// Number of customers(N)
// First customer ID
// First customer Name
// Number of items
// First Product name
// Cost of the first product
// Second Product name
// Cost of Second product
// .
// .
// .
// Second customer ID
// Second customer Name
// Number of items
// First Product name
// Cost of the first product
// .
// .
// .
// .
// Nth customer ID
// Nth customer Name
// Number of items
// First Product name
// Cost of the first product
// Second Product name
// Cost of Second product
// .
// .
// .

// Output format
// First customer ID
// First customer name
// First customer total bill
// Second customer ID
// Second customer name
// Second customer total bill
// .
// .
// .
// .
// Nth customer ID
// Nth customer name
// Nth customer total bill

// Sample testcases

// Input 1
// 2
// 618
// Rahul
// 2
// jeans
// 5000
// shirt
// 8000
// 121
// Karan
// 1
// shoes
// 2000
// Output 1
// ID:618
// NAME:Rahul
// Bill:13650
// ID:121
// NAME:Karan
// Bill:2000

// Input 2
// 2
// 120
// Radhika
// 3
// jeans
// 5000
// shirt
// 18000
// shoes
// 10000
// 151
// Raj
// 1
// shoes
// 11000

// Output 2
// ID:120
// NAME:Radhika
// Bill:35310
// ID:151
// NAME:Raj
// Bill:11550

// Whitelist
// interface Product
// class Customer
// class OrderOnline
// extends
// implements
// void ProductDetails()
// void show_Bill()
// void getdetails()
// void showdetails() 

import java.util.*;

interface Product {
    void ProductDetails();

    void show_Bill();
}

class Customer {
    static Scanner sc;
    String C_Name;
    int C_ID;
    String P_Name;
    int P_Cost;

    void getdetails() {
        C_ID = sc.nextInt();
        sc.nextLine();
        C_Name = sc.nextLine();
    }

    void showdetails() {
        System.out.println("ID:" + C_ID);
        System.out.println("NAME:" + C_Name);
    }
}

// class OrderOnline extends Customer implements Product {
class Code3 extends Customer implements Product {
    int no_of_items;
    int total_Bill = 0;

    public void ProductDetails() {
        no_of_items = sc.nextInt();

        for (int i = 0; i < no_of_items; i++) {
            sc.nextLine();
            P_Name = sc.nextLine();
            P_Cost = sc.nextInt();
            total_Bill += P_Cost;
        }
        if (total_Bill > 10000 && total_Bill <= 30000)
            total_Bill += (total_Bill * 5 / 100);
        else if (total_Bill > 30000 && total_Bill <= 50000)
            total_Bill += (total_Bill * 7 / 100);
        else if (total_Bill > 50000)
            total_Bill += (total_Bill * 9 / 100);
    }

    public void show_Bill() {
        System.out.println("Bill:" + total_Bill);
    }

    public static void main(String[] arg) {
        int no_of_orders;
        sc = new Scanner(System.in);
        no_of_orders = sc.nextInt();
        Code3[] orders = new Code3[no_of_orders];
        for (int i = 0; i < no_of_orders; i++) {
            orders[i] = new Code3();
            orders[i].getdetails();
            orders[i].ProductDetails();
        }
        for (int i = 0; i < no_of_orders; i++) {
            orders[i].showdetails();
            orders[i].show_Bill();
        }
    }
}