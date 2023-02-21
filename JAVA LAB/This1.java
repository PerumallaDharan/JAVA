//this: to refer current class instance variable
class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

public class This1 {
    public static void main(String[] args) {
        Student s1 = new Student(201, "Dharan1", 5000f);
        Student s2 = new Student(201, "Dharan2", 6000f);
        s1.display();
        s2.display();
    }
}
