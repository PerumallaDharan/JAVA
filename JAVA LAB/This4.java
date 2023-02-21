// this: to pass as an argument in the method
class This4 {
    void method2(This4 obj) {
        System.out.println("Method is invoked");
    }

    void method1() {
        method2(this);
    }

    public static void main(String args[]) {
        This4 s1 = new This4();
        s1.method1();
    }
}