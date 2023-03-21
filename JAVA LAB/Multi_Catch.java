// import java.util.*;

public class Multi_Catch {
    public static void main(String[] args) {
        int a[] = { 5, 10 };
        int b = 5;

        try {
            int x = a[1] / (b - a[0]);
            System.out.println(x);
            // int x = a[2] / b - a[1];
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type");
        }

        int y = a[1] / a[0];
        System.out.println("y = " + y);
    }
}
