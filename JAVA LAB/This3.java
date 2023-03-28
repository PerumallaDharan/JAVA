//this() : to invoke current class constructor
class demo {
    demo() {
        System.out.println("Default constructor");
    }

    demo(int x) {
        this();
        System.out.println("Parameterised constructor");
        System.out.println(x);
    }
}

class This3 {
    public static void main(String args[]) {
        new demo(10);
    }
}