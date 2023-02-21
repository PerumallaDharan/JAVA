class Student{
    String firstname,lastname,major;
    int yop;
    double gpa; 
    Student(String firstname,
            String lastname, 
            String major, 
            int yop, 
            double gpa){
                this.firstname=firstname;
                this.lastname=lastname;
                this.major=major;
                this.yop=yop;
                this.gpa=gpa;
            }
    void print(){
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(major);
        System.out.println(yop);
        System.out.println(gpa);
    }
}
public class Student_profile{
    public static void main(String args[]){
        Student S1=new Student("P","D","CSE",2025,9.1);
        Student S2=new Student("D","J","CSE",2025,8.0);
        System.out.println("Student 1");
        S1.print();
        System.out.println();
        System.out.println("Student 2");
        S2.print();
    }
}
