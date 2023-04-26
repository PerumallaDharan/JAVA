// Write a program to valid the email address and display suitable exception if there is any mistake.

// Create 3 custom exceptions class as below

//     DotException
//     AtTheRateException
//     DomainException

// A typical email address should have a " . " character, "@" character and also the domain name should be valid. Valid domain names for practice be 'in', 'com', 'net' or 'biz'. 

// Display Invalid Dot usage, Invalid @ usage or Invalid Domain message based on email id.

// Get the email address from the user, validate the email by checking the above-mentioned criteria and print the validity status of the input email address.
// Input format

// First line of input contains the email to be validated
// Output format

// Print Valid email address or Invalid email address along with suitable exception
// Sample testcases
// Input 1

// sample@gmail.com

// Output 1

// Valid email address

// Input 2

// sample@gmail.com.

// Output 2

// DotException: Invalid Dot usage
// Invalid email address

// Input 3

// sample@g@mail.com

// Output 3

// AtTheRateException: Invalid @ usage
// Invalid email address

// Input 4

// sample@gmail.con

// Output 4

// DomainException: Invalid Domain
// Invalid email address

import java.util.*;

class DomainException extends Exception {
    String expDescription;

    DomainException(String expDescription) {
        super(expDescription);
    }
}

class DotException extends Exception {
    String expDescription;

    DotException(String expDescription) {
        super(expDescription);
    }
}

class AtTheRateException extends Exception {
    String expDescription;

    AtTheRateException(String expDescription) {
        super(expDescription);
    }
}

class Code4 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        String email = myObj.next();

        boolean checkEndDot = false;
        checkEndDot = email.endsWith(".");

        int indexOfAt = email.indexOf('@');
        int lastIndexOfAt = email.lastIndexOf('.');
        int countOfAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                countOfAt++;
        }
        String buffering = email.substring(email.indexOf('@') + 1, email.length());
        int len = buffering.length();
        int countOfDotAfterAt = 0;
        for (int i = 0; i < len; i++) {
            if (buffering.charAt(i) == '.')
                countOfDotAfterAt++;
        }
        String userName = email.substring(0, email.indexOf('@'));
        String domainName = email.substring(email.indexOf('.') + 1, email.length());

        int domainCheck = 0;
        if ((domainName.equals("in")) || (domainName.equals("com")) ||
                (domainName.equals("net")) || (domainName.equals("biz")))
            domainCheck = 1;

        try {
            if ((checkEndDot) || (countOfDotAfterAt != 1)) {
                throw new DotException("Invalid Dot usage");
            }

            if (countOfAt != 1) {
                throw new AtTheRateException("Invalid @ usage");
            }

            if (domainCheck != 1) {
                throw new DomainException("Invalid Domain");
            }

        } catch (DotException e) {
            System.out.println(e);
        } catch (AtTheRateException e) {
            System.out.println(e);
        } catch (DomainException e) {
            System.out.println(e);
        }
        if ((countOfAt == 1) && (userName.endsWith(".") == false) && (domainCheck == 1) &&
                (countOfDotAfterAt == 1) && ((indexOfAt + 3) <= (lastIndexOfAt) && !checkEndDot)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
        myObj.close();
    }
}
