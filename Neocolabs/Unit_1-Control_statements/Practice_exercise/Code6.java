// Ticket types

// The Magic Castle, the home of the Academy of Magical Arts in California 
// has organized the great 'WonderWorks Magic Show'. Renowned magicians were 
// invited to mystify and thrill the crowd with their world’s spectacular magic 
// tricks. The Ticket booking for the show started 2 days prior and there were 
// different types of tickets offered with the different fares. The show organizers 
// wanted to place a scanning machine at the entrance of the venue for scrutiny. The 
// machine will take the input of a character denoting the various ticket types and 
// displays the equivalent ticket type of the given character.

// There are 5 types of tickets, each of which is denoted by a character (both upper 
// case and lower case). Please find the equivalent strings for the characters.

// E or e - Early Bird Ticket

// D or d - Discount Ticket

// V or v - VIP Ticket

// S or s - Standard Ticket

// C or c - Children Ticket

// Write a piece of code for the scanning machine that will take the input of a character 
// and print the equivalent string as given. 

// Input format
// The input consists of the character that denotes one of the ticket types.

// Output format
// The output should display the equivalent ticket type of the character.

// Code constraints
// Use the switch statement.

// Sample testcases
// Input 1
// E
// Output 1
// Early Bird Ticket

// import java.io.*;
import java.util.*;

class Code6 {
    public static void main(String[] args) {
        char type;
        Scanner sc = new Scanner(System.in);
        type = sc.next().charAt(0);
        switch (type) {
            case 'e':
                System.out.println("Early Bird Ticket");
                break;
            case 'E':
                System.out.println("Early Bird Ticket");
                break;
            case 'd':
                System.out.println("Discount Ticket");
                break;
            case 'D':
                System.out.println("Discount Ticket");
                break;
            case 'v':
                System.out.println("VIP Ticket");
                break;
            case 'V':
                System.out.println("VIP Ticket");
                break;
            case 's':
                System.out.println("Standard Ticket");
                break;
            case 'S':
                System.out.println("Standard Ticket");
                break;
            case 'c':
                System.out.println("Children Ticket");
                break;
            case 'C':
                System.out.println("Children Ticket");
                break;
        }
        sc.close();
    }
}
