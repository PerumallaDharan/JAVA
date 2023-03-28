// MID IMPORTANT QUESTION
public class Exception_handling {
    public static void main(String[] args) {
        try {
            int i, sum = 10;
            for (i = -1; i < 3; ++i) {
                sum = (sum / i);
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("0");
    }
}
