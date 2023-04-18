import java.util.Scanner;
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//Number.java
class Number {
    private int value;

    public Number(int value) {
         this.value = value;
    }

    public Number add(Number num) {
         return new Number(this.value + num.value);
    }

    public int getValue() {
         return value;
    }
}
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//StringWrapper.java
class StringWrapper {
    private String value;

    public StringWrapper(String value) {
         this.value = value;
    }

    public StringWrapper add(StringWrapper str) {
         return new StringWrapper(this.value + str.value);
    }

    public String getValue() {
         return value;
    }
}
//Write a Java program that demonstrates operator overloading for adding numbers and concatenating strings
//Main.java

public class Code4 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         // System.out.print("Enter two numbers: ");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         Number n1 = new Number(num1);
         Number n2 = new Number(num2);
         System.out.println(n1.add(n2).getValue());
         // System.out.print("Enter two strings: ");
         String str1 = scan.next();
         String str2 = scan.next();
         StringWrapper s1 = new StringWrapper(str1);
         StringWrapper s2 = new StringWrapper(str2);
         System.out.println(s1.add(s2).getValue());

         scan.close();
    }
}