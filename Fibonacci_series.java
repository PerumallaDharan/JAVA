import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int x = in.nextInt();
        System.out.println("Fibonacci Series");
        System.out.println(a);
        System.out.println(b);
        do {
            int sum = a + b;
            System.out.println(sum);
            x--;
            a = b;
            b = sum;
        } while (x > 2);
        in.close();
    }
}
