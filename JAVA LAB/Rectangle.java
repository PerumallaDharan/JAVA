
class Rect {
    int l, b;

    Rect() {
        l = 1;
        b = 1;
        // this.l = 1;
        // this.b = 1;
        // area();
        // perimeter();
    }

    Rect(int l, int b) {
        this.l = l;
        this.b = b;
        // area();
        // perimeter();
    }

    int area() {
        return this.l * this.b;
    }

    int perimeter() {
        return 2 * (this.l + this.b);
    }

    void display() {
        System.out.println("Length = " + this.l);
        System.out.println("Breadth = " + this.b);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }
}

public class Rectangle {
    public static void main(String[] args) {

        Rect obj1 = new Rect();
        Rect obj2 = new Rect(4, 40);
        Rect obj3 = new Rect(3, 35);

        obj1.display();
        obj2.display();
        obj3.display();

    }
}