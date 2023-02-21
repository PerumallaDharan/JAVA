//this keyword can be used to return current class instance
class demo {
    demo getdemo() {
        return this;
    }

    void method() {
        System.out.println("Returns method");
    }
}

class This6 {
    public static void main(String args[]) {
        new demo().getdemo().method();
    }
}