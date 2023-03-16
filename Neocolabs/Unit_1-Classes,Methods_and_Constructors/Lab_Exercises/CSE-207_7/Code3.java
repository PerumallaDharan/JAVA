// Design a class named Fan to represent a fan. The class contains:
// ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 
// 2, and 3 to denote the fan speed.
// ■ A private int data field named speed that specifies the speed 
// of the fan (the default is SLOW).
// ■ A private boolean data field named on that specifies whether the 
// fan is on (the default is false).
// ■ A private double data field named radius that specifies the radius 
// of the fan (the default is 5).
// ■ A string data field named color that specifies the color of 
// the fan (the default is blue).
// ■ The accessor and mutator methods for all four data fields.
// ■ A no-arg constructor that creates a default fan.
// ■ A method named toString() that returns a string description for 
// the fan.
// -> If the fan is on, the method returns the fan speed, color, and 
// radius in one combined string.
// -> If the fan is not on, the method returns the fan color and 
// radius along with the string “fan is off” in one combined string.

// Input format
// <speed 1/2/3> <radius> <on/off> <color>
// please see the sample input
// Output format
// Fan speed: <SLOW / MEDIUM / FAST>, color: <color> , radius: <radius>
// please see the sample output

// Sample testcases
// Input 1
// 3 10 true yellow
// Output 1
// Fan speed: FAST, color:  yellow, radius: 10.0

// Input 2
// 2 20 true red
// Output 2
// Fan speed: MEDIUM, color:  red, radius: 20.0

// Input 3
// 3 10 false yellow
// Output 3
// Fan color:  yellow, radius: 10.0
// fan is off

import java.util.*;

class Code3 {
    int speed;
    double radius;
    String op, colour;

    public static void main(String args[]) {
        Code3 m = new Code3();
        String s;
        // int b;
        Scanner sc = new Scanner(System.in);
        m.speed = sc.nextInt();
        m.radius = sc.nextDouble();
        m.op = sc.next();
        m.colour = sc.next();

        if (m.speed == 1) {
            s = "SLOW";
        } else if (m.speed == 2) {
            s = "MEDIUM";
        } else {
            s = "FAST";
        }
        if (m.op.equals("true")) {
            System.out.printf("Fan speed: %s, color: %s, radius: %.1f", s, m.colour, m.radius);
        } else {

            System.out.printf("Fan color: %s, radius: %.1f\nfan is off", m.colour, m.radius);
        }
        sc.close();
    }
}