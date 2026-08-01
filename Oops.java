
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

    Student(int age, String name) {
        System.out.println("Created a new instance of a object...");
        this.age = age;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Hi my name is " + this.name + "and my age is " + this.age);
    }
}

public class Oops {
    public static void main(String[] args) {

        Student s1 = new Student(12, "Harshwarhdan");
        s1.printInfo();
    }
}
