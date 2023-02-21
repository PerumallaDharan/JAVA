import java.util.*;

class Biggest_in_three {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter  x");
        String s1 = i.nextLine();
        System.out.println("Enter y");
        String s2 = i.nextLine();
        System.out.println("Enter z");
        String s3 = i.nextLine();
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int z = Integer.parseInt(s3);
        if (x > y && x > z) {
            System.out.println(x + " is largest");
        } else if (y > x && y > z) {
            System.out.println(y + " is largest");
        } else {
            System.out.println(z + " is largest");
        }
        i.close();
    }
}