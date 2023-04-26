// Write a program to validate the given password. A password is said to be strong if it satisfies the following criteria

//   i) It should be minimum of 10 characters and a maximum of 20 characters

//   ii) It should contain at least one digit

//   iii)It should contain at least one special character (!,@,#,$,%,^,&,*)

// If the password fails any one of the criteria, it is considered as weak.

// Create a class called User with the following private attributes.

//     name as String
//     mobile as String
//     username as String
//     password as String

// Create a class called UserBO with following methods.

// static void validate(User u) This method throws Exception with a suitable message if the Password is weak.

// Create a Mainclass get inputs from the user. Validate the password and if there is an exception, handle the exception and prompt the user with a suitable message.

// Refer Sample input and output for exact statement
// Input format

// Name

// Phone number

// User Name

// Password
// Output format

// Print Valid Password or suitable exception
// Code constraints

// Special characters are !,@,#,$,%,^,&,*
// Sample testcases
// Input 1

// John
// 9874563210
// john
// john1#nhoj

// Output 1

// Valid Password

// Input 2

// John
// 9874563210
// john
// john#nhoj

// Output 2

// java.lang.Exception: Should contain at least one digit

// Input 3

// John
// 9874563210
// john
// john1nhoj

// Output 3

// java.lang.Exception: It should contain at least one special character

// Input 4

// John
// 9874563210
// john
// john9#

// Output 4

// java.lang.Exception: Should be minimum of 10 characters and maximum of 20 characters

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    String name;
    String mobile;
    String username;
    String password;

    public User(String name, String mobile, String username, String password) {
        super();
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
}

class UserBO {
    static void validate(User u) throws Exception {
        String pattern = "[!|@|#|$|%|^|&|*]";
        Pattern a = Pattern.compile(pattern);
        Matcher m1 = a.matcher(u.password);

        String pattern2 = "[1|2|3|4|5|6|7|8|9|0]";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(u.password);
        // System.out.println(u.password);

        if ((u.password.length() < 9) || (u.password.length() > 20)) {
            throw new Exception("Should be minimum of 10 characters and maximum of 20 characters");
        } else if (!m2.find()) {
            throw new Exception("Should contain at least one digit");
        }

        else if (!m1.find()) {
            throw new Exception("It should contain at least one special character");
        } else
            System.out.println("Valid Password");
    }
}

class Code3 {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String mobile = scan.nextLine();
        String username = scan.nextLine();
        String password = scan.nextLine();
        User userOne = new User(name, mobile, username, password);
        try {
            UserBO.validate(userOne);
        } catch (Exception e) {
            System.out.println(e);
        }

        scan.close();
    }
}