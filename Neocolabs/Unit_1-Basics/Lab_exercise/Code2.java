// Profit and Loss of scooter
import java.util.*;

public class Code2 {
     public static void main(String[] args)
     {
          float A, B, C;

          Scanner scan=new Scanner(System.in);

          A=scan.nextFloat();
          B=scan.nextFloat();
          C=scan.nextFloat();

          float profit=(C-(A+B))*100/C;

          System.out.print(String.format("%.2f", profit));

          scan.close();
     }
}