//this: to pass as argument in the constructor call
class demo {
    This5 obj;

    demo(This5 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);// using data member of This5 class
    }
}

class This5 {
    int data = 10;

    This5() {
        demo b = new demo(this);
        b.display();
    }

    public static void main(String args[]) {
        new This5();
    }
}