//Armstrong Number
class Armstrong {
    static int digitcount(int x) {
        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    static void armstrong(int n) {
        int temp = 0;
        int a = digitcount(n);
        int num = n;
        while (n > 0) {
            temp += Math.pow((n % 10), a);
            n /= 10;
        }
        // System.out.println(temp);
        if (temp == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String args[]) {
        int n = 1634;
        armstrong(n);
    }
}
