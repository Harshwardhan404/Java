class Person {

    String type = "Person";
    private String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor executed");
    }

    void introduce() { 
        System.out.println("My name is " + name);
    }
}

class Employee extends Person {

    String type = "Employee";
    private int employeeId;

    Employee(String name, int employeeId) {

        super(name);
        this.employeeId = employeeId;
        System.out.println("Employee constructor executed");
    }

    void intro(String name) {
        super.introduce();
        System.out.println(
            "My employee ID is " + employeeId + name
        );
    }

    void displayTypes() {
        System.out.println("Child type: " + this.type);
        System.out.println("Parent type: " + super.type);
    }
}


public class SuperDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Harsh", 101);
        employee.intro("Raj");
        employee.displayTypes();
    }
}