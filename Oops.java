class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Pen wrote something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;
    int color;
   

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age + 23;  // you can also alter the copy in copy constructor.

    }

    Student() {

    }

    public void printInfo() {
        System.out.println("Hi my name is " + this.name + " and my age is " + this.age +"and "+ this.color );
    }
}

public class Oops {
    public static void main(String[] args) {

        // Student s1 = new Student();
        // s1.age = 23;
        // s1.name = "Harsh";
        // s1.color = 32;
        // // s1.printInfo();

        // Student s3 = new Student(s1);
        // s3.printInfo();


bank.Bank acc1 = new bank.Bank();

acc1.trial();


    }
}
