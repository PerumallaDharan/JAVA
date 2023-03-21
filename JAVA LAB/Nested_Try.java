public class Nested_Try {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Going to divide by 0");
                int b = 30 / 0;
                System.out.println(b);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                System.out.println(a[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other statement");
        } catch (Exception e) {
            System.out.println("Handled by outermost catch block");
        }
        System.out.println("Normal Flow");
    }
}
