// Develop a class TelephoneIndex with two String objects as 
// members. One should hold people’s names and the other should 
// hold their phone numbers. The class should have appropriate 
// constructor, input, and display methods. Create an array of objects 
// for TelephoneIndex and do the following: 

// a. Your program should ask the user to enter a name or the first 
// few characters of a name to search for it in the array.

// b. The program should display all of the names that match the 
// user’s input and their corresponding phone numbers.
// Input format

// The first line has the number of records N in the Telephone Index.

// The following N*2 lines have the name and phone number one below 
// the other as shown in the sample test case.

// The last line has the name(substring) to be found.
// Output format

// The output displays the details of the matching records shown in 
// the sample test case.
// Sample testcases
// Input 1
// 6
// james
// 45464
// jim
// 66987
// jade
// 54654
// jake
// 455454
// jill
// 454
// joker
// 46545
// ji
// Output 1
// jim 66987
// jill 454

// You are using Java
import java.util.Scanner;

class TelephoneIndex {
    String name, phone;

    TelephoneIndex() {
    }

    void getData(String Cname, String pno) {
        // System.out.println("set data");
        this.name = Cname;
        this.phone = pno;
    }

    void display(String Cname, String pno) {
        System.out.println(name + " " + phone);

    }

    void findData(String cname) {
        if (name.startsWith(cname)) {
            display(name, phone);
        }

    }

}

class Code8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        TelephoneIndex[] ti = new TelephoneIndex[N];

        String contactName, phoneNum;
        for (int i = 0; i < N; i++) {

            contactName = in.nextLine();

            phoneNum = in.nextLine();
            ti[i] = new TelephoneIndex();
            ti[i].getData(contactName, phoneNum);

        }
        String findName = in.nextLine();
        for (int i = 0; i < N; i++) {

            ti[i].findData(findName);
        }
        in.close();
    }
}