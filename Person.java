
class Student extends Person {

    float grade;

    Student(String name, int age, char sex, float grade){
        super(name, age, sex);
        this.grade = grade;

    }

}

class Employee extends Student {

    String location;

    Employee(String name, int age, char sex, float grade,String location ){
        super(name, age, sex, grade);
        this.location = location;
    }
}



public class Person {

    String name;
    int age;
    char sex;


    Person(String Name, int Age, char Sex){
        this.name = Name;
        this.age = Age;
        this.sex = Sex;
    }

    public void printInfo(){
        System.out.println(this.name + "'s age is "+ this.age + "and he is a "+ this.sex);
    }


    public static void main(String[] args) {

        Employee emp = new Employee("Harsh", 23, 'M', 3.23f,"Manhatten");
        emp.printInfo();
    }
}
