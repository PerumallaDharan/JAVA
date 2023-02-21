//this: to invoke current class method
class demo {
    void method1() {
        System.out.println("Hello 1");
    }

    void method2() {
        System.out.println("Hello 2");
        this.method1();
    }
}

public class This2 {
    public static void main(String args[]) {
        demo a = new demo();
        a.method2();
    }
}
