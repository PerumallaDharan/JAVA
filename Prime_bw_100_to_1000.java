public class Prime_bw_100_to_1000 {
    public static void main(String[] args) {
        int n;
        for (n = 100; n < 1000; n++) {
            int c = 0;
            for (int i = 1; i < n ; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            if (c==1) {
                System.out.println(n);
            }
        }
    }
}
