public class MCB {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("Common ta");
        }
        // catch (ArithmeticException e) {
        //     System.out.println("");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println();
        //     System.out.println("Rest of the code ");
        // }
    }
}
