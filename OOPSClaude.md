# Classes

A class is a blueprint or template that defines the properties (variables) and behaviors (methods) an object will have.

```java
class Car {
    String color;   // initializing properties

    void drive() {   // creating a method
        System.out.println("Car is moving");
    }
}
```

- Class name should start with a capital letter.
- Class name and file name should be the same.
- Your main method serves as the entry point to run the class; you can initiate other class objects in the main method.

> [!WARNING]
> Simple analogy: a class is a house blueprint, while an object is the actual house built from that blueprint.

# Objects

An object is an actual instance of a class. It occupies memory and can use the variables and methods defined by its class.

```java
Car myCar = new Car();  // creating an instance of an object

myCar.color = "Red";
myCar.drive();       // calling methods declared in the class
```

## Static Methods in Java

A static method belongs to the class, not to an individual object.

> [!WARNING]
> Static method → belongs to the class → call it using the class name.

Example:

```java
class Pen {
    public static void makePen(){
        System.out.println("Creating pen");
    }
}

Pen.makePen(); // can only be called by class name.
```

## this keyword in java

The `this` keyword refers to the current object. It is commonly used to differentiate an object's variable from a parameter with the same name.

In short -> `this` refers to the current object instance's variable.

For example:

```java
class Car {
    String color;   // this is a class property

    Car(String Color) {
        this.color = Color;  // this.color means the current object's color, which we are assigning from the object parameter.
    }
}
```

# Constructor

- A constructor does not have a return type (not even void).
- A constructor is a method with the same name as the class.
- For one object, the constructor runs only one time, during object creation.
- A constructor is a method but starts with a capital letter, like the class.

## Types of constructors

### Non-parameterized constructor

Constructor with no parameters (default type).
Java creates its own constructor for the class and creates an object out of it,
but if you declare your own constructor, java will override its constructor and use your defined constructor.
Remember, while creating an object you write:

```java
Student s1 = new Student(); // here Student is the constructor called for the Student class.
```

Example, for a class called Student, the constructor will look like this:

```java
class Student {
 Student(){
     System.out.println("Creating object");
 }
}
```

### Parameterized constructors

A parameterized constructor takes values when an object is created and stores those values in the object.

Example:

```java
class Student {
    String name; // class specific properties
    int age;
    String school = "Global school"; // you can also declare a value in class specific variables.

    Student(int Age, String Name) {
        System.out.println("Created a new instance of a object...");
        this.age = Age;   // we are assigning the class specific variables to parameters from constructor.
        this.name = Name; // name is a class variable and Name is the parameter value given from the object.
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
```

### Copy constructors

A copy constructor creates a new independent object using the values of an existing object.

```java
class Student {
    String name;
    int age;

     Student(Student s) {   // copy constructor -> takes another object as a parameter.
        this.name = s.name;
        this.age = s.age;
    }

    Student() {   // you also have to create a normal constructor in order to create an object for Student s1
    }

    public void printInfo() {
        System.out.println("Hi my name is " + this.name + " and my age is " + this.age);
    }

}

public class Oops {

public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 23;
        s1.name = "Harsh";

        Student s3 = new Student(s1);
        s3.printInfo();  // Prints Hi my name is Harsh and my age is 23.
    }

}
```

So a copy constructor helps to duplicate the data of an object and store it in a new object.
It also gives you the ability to do a full copy or a partial copy where you change values according to your needs.

> [!WARNING]
> Java does not have destructors. Java has a concept called garbage collectors, which automatically detect unused objects and delete the ones that are no longer required.

# Polymorphism

| Type                      | Achieved using     | Decision happens       | In action during |
| ------------------------- | ------------------- | ----------------------- | ----------------- |
| Compile-time polymorphism | Method overloading | During compilation     | Single class      |
| Runtime polymorphism      | Method overriding   | While the program runs | Inheritance        |

## Compile-time polymorphism (Method overloading)

Same method name but different parameters:
One method name can be used to perform different tasks; the compiler picks the suitable method by checking and comparing parameters.

For example:

```java
class Student {

    String name;
    int age;
    String subject;

    // No parameter
    public void printInfo() {
        System.out.println("Name: " + this.name);
    }

    // One parameter
    public void printInfo(String subject) {
        System.out.println("Subject: " + subject);
    }

    // Two parameters
    public void printInfo(String name, String subject) {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }

    // Three parameters with different data types
    public void printInfo(String name, int age, String subject) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class PolymorphismJ {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Ajay";
        student.age = 12;
        student.subject = "Maths";

        student.printInfo();  // Ajay
        student.printInfo("English"); // English
        student.printInfo("Harsh", "English"); // Name: Harsh   // Subject: English
        student.printInfo("Ajay", 12, "Maths"); // Name : Ajay   // Age: 12  // Subject: Maths
    }
}
```

Rules for compile-time polymorphism:

1. Parameter size should be different.
2. No two methods can have `(String name, String school)` and `(String school, String name)` — this is not valid.
3. Java checks datatypes and their location, not variable names,
   but you can do `(int, String)` & `(String, int)`.
4. You cannot overload methods by changing only:
   - Return type
   - Parameter names
   - Access modifier such as public or private

## Runtime Polymorphism (Method overriding)

A child class provides its own implementation of a method that already exists in its parent class.
It allows the child class to change the inherited behaviour.

Conditions for method overriding:

1. Overriding requires inheritance or interface implementation.
2. The method name and parameters must match.
3. The return type must be the same or covariant.
4. The child cannot reduce method accessibility.
5. Use `@Override` every time.
6. `final` methods cannot be overridden.
7. Private methods are not overridden.
8. Static methods are hidden, not overridden.
9. Constructors and fields are not overridden.
10. A child cannot add a broader checked exception.
11. Overridden methods are selected using the actual object type at runtime.
12. Use `super.method()` to call the parent implementation.

Easy definition: Method overriding means a child class replaces an inherited method with its own implementation.

```java
class Animal {

    protected String name;

    Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " barks");
    }

    @Override
    public void introduce() {
        // Calling the parent implementation
        super.introduce();
        System.out.println("I am a dog");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " meows");
    }
}

public class MethodOverridingExample {

    public static void main(String[] args) {

        // Parent reference containing child objects
        Animal animal1 = new Dog("Bruno");
        Animal animal2 = new Cat("Luna");

        // Java executes methods based on actual object type
        animal1.sound();
        animal2.sound();

        animal1.introduce();

        // sleep() is inherited without overriding
        animal1.sleep();
        animal2.sleep();

        // Dog-specific method
        Dog dog = new Dog("Rocky");
        dog.fetch();

        // Not allowed because Animal does not have fetch():
        // animal1.fetch();
    }
}
```

```
Bruno barks
Luna meows
My name is Bruno
I am a dog
Bruno is sleeping
Luna is sleeping
Rocky fetches the ball
```

# Inheritance

When one class (child) inherits the properties and methods of another class (parent), it is called inheritance.
It increases the reusability of the code.

Types of Inheritance:

- Single level
- Multi Level Inheritance
- Hierarchical Inheritance
- Hybrid Inheritance
- Multiple Inheritance (Achieved by Interfaces)

> [!WARNING]
> When you create a child class object inherited from the parent class, the constructor of the parent class will be called first, and then the child class constructor will be called.

## Single level inheritance

```
Base class
   .
   .
   .
Child class
```

```java
class Shape{

String color;

public void area(){
    System.out.println("Prints area of shape.");
}

}

class Triangle extends Shape {
}

public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();
    }
}
```

## Multi level inheritance

The type of inheritance where class B inherits the properties of class A, and class C inherits the properties of class B.
Also, class C can use the properties and methods of class A.

```
Base class (A)
    .
    .
Derived class (B)
    .
    .
Derived class of derived class (C)
```

```java
class Shape{

String color;

public void area(){
    System.out.println("Prints area of shape.");
}

}

class Triangle extends Shape {
    public void area(int l, int b){
    System.out.println(1/2* l * b);
}
}

class EquilateralTriangle extends Triangle{
  public void area(int l){
    System.out.println(3 * l);
  }
}

public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();
    }
}
```

## Hierarchical inheritance

The type of inheritance where two different classes inherit the properties of the same parent class.

```
Base class (A)
  .      .
  .      .
  .      .
Class B  class C
```

```java
class Shape{

String color;

public void area(){
    System.out.println("Prints area of shape.");
}

}

class Triangle extends Shape {             // class Triangle gets properties and methods of Shape
    public void area(int l, int b){
    System.out.println(1/2* l * b);
}
}

class Square extends Shape{              // class Square gets properties and methods of Shape
  public void area(int l, int b){
    System.out.println(l * b);
  }
}

public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();

        Square s1 = new Square();
        s1.area(4,6);
    }
}
```

## Hybrid Inheritance

Hybrid inheritance is a type of inheritance where single, multiple, and multi-level inheritance are combined or used together.

```
           Class A
            .    .
            .    .
            .    .
     Class B    Class C
                 .
                 .
                Class D
```

```java
class Shape{

String color;

public void area(){
    System.out.println("Prints area of shape.");
}

}

class Triangle extends Shape {             // class Triangle gets properties and methods of Shape
    public void area(int l, int b){
    System.out.println(1/2* l * b);
}
}

class Square extends Shape{              // class Square gets properties and methods of Shape
  public void area(int l, int b){
    System.out.println(l * b);
  }
}

class SmallSquare extends Square {       // class SmallSquare gets properties and methods of Square class
    public void area(int l, int b){      // and it will also have properties of the Shape class.
        System.out.println(l * b);
    }
}

public class Main{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.area();

        Square s1 = new Square();
        s1.area(4,6);

        SmallSquare ss1 = new SmallSquare();
        ss1.area(5,6);
    }
}
```

## Super keyword

`super` refers to the immediate parent class, while `super()` calls the immediate parent class constructor.

```
super()        → Parent constructor
super.field    → Parent field
super.method() → Parent method
```

If the parent requires a parameterized constructor, you have to declare the child constructor as parameterized
and pass it the arguments required by the parent constructor.

If you have 2, 3, or 4 levels of hierarchy in classes, the last child will have to call all the other classes'
constructors before calling its own constructor.

A consolidated example of using the `super()` keyword, which is used to refer to the immediate parent:

```java
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

    @Override
    void introduce() {
        // Calling the parent method
        super.introduce();

        System.out.println(
            "My employee ID is " + employeeId
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

        employee.introduce();
        employee.displayTypes();
    }
}
```

```
output
Person constructor executed
Employee constructor executed
My name is Harsh
My employee ID is 101
Child type: Employee
Parent type: Person
```

# Packages

There are 2 types of packages:

1. Built-in Java packages
2. User-defined packages

A package is a named group used to organize related Java classes, interfaces, enums, and other types.

Think of a package like a folder:

```
bank package
├── Account
├── Customer
└── Loan
```

It also gives every class a complete, unique name:

```
bank.Account
bank.Customer
bank.Loan
```

Why do we use packages? Packages help us:

- Organize related classes.
- Avoid class-name conflicts.
- Control access between classes.
- Reuse classes in other files.
- Keep large projects clean and manageable.

## Built-in Java packages

These are some packages that are built into java.

| Package         | Purpose                                              |
| ---------------- | ----------------------------------------------------- |
| `java.lang`     | Basic classes such as `String`, `System` and `Math`  |
| `java.util`     | Collections, Scanner, ArrayList and utilities        |
| `java.time`     | Date and time classes                                |
| `java.io`       | Reading and writing files                            |
| `java.nio.file` | Modern file handling                                 |
| `java.net`      | Networking                                           |

## User-defined packages

These are the packages that are created by users.

```java
// 1st example
package bank;

// 2nd example
package com.mycompany.project;
```

It is expected to use all lowercase for declaring a package (a naming convention).
Package names are case-sensitive.

### Creating a package

```
JAVA/
├── bank/
│   └── Account.java
└── Oops.java
```

`bank/Account.java`:

```java
package bank;

public class Account {

    public String name;

    public void displayName() {
        System.out.println("Account holder: " + name);
    }
}
```

### Importing a class

`Oops.java`:

```java
import bank.Account;    // you can specify which class you want to use from the bank package to get all public things from
                         // the package you can use import bank.*; but this only gives access to any public class.
public class Oops {     // with a bank/xyz.java folder structure, anything ie a subpackage after bank/subfolder/*
                         // will still be inaccessible.
    public static void main(String[] args) {

        Account account = new Account();
        account.name = "Harsh";
        account.displayName();
    }
}
```

> [!WARNING]
> Classes inside the same package do not need to import one another.

### Packages and access modifiers

| Modifier    | Same class | Same package | Child class in another package | Other package |
| ----------- | ---------: | -----------: | ------------------------------: | -------------: |
| `public`    |        Yes |          Yes |                              Yes |            Yes |
| `protected` |        Yes |          Yes |        Yes, through inheritance |             No |
| No modifier |        Yes |          Yes |                               No |             No |
| `private`   |        Yes |           No |                               No |             No |

# Access Modifiers

Access modifiers control where a class, variable, method, or constructor can be accessed.

From most accessible to least accessible:

1. public
2. protected
3. default
4. private

| Modifier                  | Example                     | Same class | Same package | Child class in another package | Unrelated class in another package | Simple meaning                                          |
| -------------------------- | ---------------------------- | :--------: | :-----------: | :-------------------------------: | :-----------------------------------: | --------------------------------------------------------- |
| `public`                  | `public String name;`       |      ✅     |       ✅      |                ✅                |                  ✅                   | Accessible from everywhere                               |
| `protected`               | `protected double balance;` |      ✅     |       ✅      |               ✅*                |                  ❌                   | Accessible in the same package and through inheritance   |
| Default / package-private | `int accountNumber;`        |      ✅     |       ✅      |                ❌                |                  ❌                   | Accessible only inside the same package                  |
| `private`                 | `private String pin;`       |      ✅     |       ❌      |                ❌                |                  ❌                   | Accessible only inside the same class                    |

\* In a different package, a child class can access a `protected` member only through inheritance, not through an unrelated parent-class object.

## public

Use public when something should be available to all classes.

A public member can be accessed from:

- The same class
- The same package
- A child class in another package
- Any unrelated class in another package

## protected

A protected member can be accessed:

- Inside the same class
- By every class in the same package
- By child classes in another package through inheritance

## Default or package-private

Default access is used when you write no access modifier.
A default member can be accessed:

- Inside the same class
- By other classes in the same package
- It cannot be accessed from another package.

## private

- A private member can only be accessed inside the class where it was declared.
- It cannot be accessed directly from another class.
- Even a child class cannot directly access it.
- Usually accessed by public methods called getters and setters.

### Getters and setters

These are basically used to access private properties and methods through public methods.
Getters are used to get the values and setters can be used to set the values.
Getters and setters are just naming conventions.

```java
class Information {

    private String password = "Harsh@123";

    public void setPassword(String pass) {
        this.password = pass;

    }
    public String getPassword() {
        return this.password;
    }
}

public class GettersAndSetters {

    public static void main(String[] args) {

        Information in = new Information();
        in.setPassword("New password");
        System.out.println(in.getPassword());

    }
}
```

# Encapsulation

Encapsulation means keeping an object's data protected and allowing that data to be accessed or changed only through controlled operations.
Encapsulation is not simply creating getters and setters. It is deciding what outside code is allowed to see and do.
Encapsulation provides validation, access, and modification permissions.
It makes your classes secure and validated against errors.
Encapsulation means keeping a class's data private and allowing controlled access through methods such as getters and setters.

The difference between Encapsulation and Abstraction is:

> [!WARNING]
> Encapsulation protects an object's data and controls how it is accessed or modified, while abstraction hides unnecessary implementation details and exposes only essential functionality.

The simplest definition to remember is:
> Encapsulation is protecting an object's internal data and allowing access only through safe, controlled operations.

Check this example where we demonstrate encapsulation in action, where we are validating and protecting data using getters and setters, and making the variables final so that they do not change:

```java
final class BankAccount {

    private final String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Account number cannot be empty");
        }

        if (openingBalance < 0) {
            throw new IllegalArgumentException(
                    "Opening balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        setHolderName(holderName);
        this.balance = openingBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getHolderName() {
        return this.holderName;
    }

     public double getBalance() {
        return balance;
    }


    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException(
                    "Holder name cannot be empty");
        }

        this.holderName = holderName;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be positive");
        }

        balance += amount;
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalStateException(
                    "Insufficient balance");
        }

        balance -= amount;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-101", "Harsh", 1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println(account.getHolderName());
        System.out.println(account.getBalance());

        // Not allowed because balance is private:
        // account.balance = -5000;
    }
}
```

# Abstraction

Abstraction means showing only what something does while hiding the details of how it does it.
Example: You call `car.start()` to start a car without needing to know how the engine works internally.

Abstraction can be achieved by:

1. Abstract keyword (for class/methods/properties)
2. Interfaces

> [!WARNING]
> When you create a child class object inherited from the parent class, the constructor of the parent class will be called first, and then the child class constructor will be called.

> [!WARNING]
> Encapsulation protects an object's data and controls how it is accessed or modified, while abstraction hides unnecessary implementation details and exposes only essential functionality.

## Abstract keyword

1. Abstract class = incomplete parent class.
2. Abstract method = method without implementation.
3. You cannot create an abstract class object directly.
4. A child class must implement its parent's abstract methods.
5. An abstract class can also contain normal methods, fields, and constructors — abstract helps achieve abstraction.

In short: abstract means the child class must complete the missing implementation.

```java
abstract class Animal {
    public void walk() {

    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String args[]) {

    }
}
```

So an abstract class is like any other class but starts with the `abstract` keyword; if the class is made abstract,
then we cannot create objects of that class.

Also, if a method is abstract in the class, then we cannot define a body for that abstract method.
If the method in the class is not abstract, then we can perform logic in the method and use it in child classes.

Example:

```java
 abstract class Human {
     public void callPerson(){
        System.out.println("call someone");
     };

}

class Raj extends Human {
}

public class AbstractionJ {
    public static void main(String[] args) {

    Raj r1 = new Raj();
    r1.callPerson();

    }
}
```

## Interfaces

- An interface is a more strict version of Abstraction; if the class is declared as an `interface`, then all the methods defined in the interface should be used by child classes.
- We cannot create objects of Interfaces.
- Create an interface using `interface`.
- A class uses an interface with `implements`.
- You cannot create an interface object directly.
- Implementing classes must provide the required methods.
- Implemented interface methods must be public.
- An interface does not have constructors or normal instance fields.
- A class can implement multiple interfaces.
- Interface fields are automatically public static final constants.
- Interfaces can also contain default, static, and private methods.

```java
// One interface can extend another interface
interface Chargeable {

    // Abstract method
    void charge();
}

interface SmartDevice extends Chargeable {

    // Automatically: public static final
    String CATEGORY = "Electronic Device";

    // Automatically: public abstract
    void turnOn();
    void turnOff();

    // Default method: contains implementation
    default void restart() {
        log("Restarting device");

        turnOff();
        turnOn();
    }

    // Static method: belongs to the interface
    static void showInformation() {
        System.out.println("SmartDevice represents a smart electronic device");
    }

    // Private method: used only inside the interface
    private void log(String message) {
        System.out.println("[SmartDevice] " + message);
    }
}

interface InternetEnabled {
    void connectToInternet();
}

// A class can implement multiple interfaces
class SmartPhone implements SmartDevice, InternetEnabled {

    @Override
    public void turnOn() {
        System.out.println("Phone turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Phone turned OFF");
    }

    @Override
    public void charge() {
        System.out.println("Phone is charging");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Phone connected to Wi-Fi");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        // Interface reference
        SmartDevice device = phone;
        InternetEnabled internetDevice = phone;

        System.out.println(SmartDevice.CATEGORY);
        SmartDevice.showInformation();
        device.turnOn();
        device.restart();
        device.charge();

        internetDevice.connectToInternet();

        // Not allowed:
        // SmartDevice object = new SmartDevice();
    }
}
```

One class can implement multiple interfaces, i.e.:

```java
class C implements A, B {
    // execution
}
```

> [!WARNING]
> Multiple Inheritance is implemented by Interfaces in java.

> [!IMPORTANT]
> `@Override` tells java that this method is replacing a method inherited from a parent class or interface.
> Overriding may work without `@Override`, but you should always use it because it catches mistakes.

# Static Keyword

The `static` keyword means: a member belongs to the class itself, rather than to each individual object.

Without static, every object gets its own copy. With static, all objects share the same class-level member.

Where static can be used:

| Static feature      | Purpose                                             |
| --------------------- | ----------------------------------------------------- |
| Static variable     | Stores one value shared by all objects              |
| Static method       | Can be called without creating an object             |
| Static block        | Runs when the class is initialized                   |
| Static nested class | Nested class that does not require an outer object   |
| Static import       | Uses static members without writing the class name   |

Important rules to remember:

- `static` means the member belongs to the class.
- Static fields are shared by all objects.
- Static methods can be called without creating an object.
- Call static members using the class name.
- Static methods cannot directly access instance members.
- Static methods cannot use `this` or `super`.
- Static blocks run when the class is initialized.
- Static nested classes do not require an outer object.
- Static methods are hidden, not overridden.
- Static fields are hidden, not overridden.
- `static final` is commonly used for constants.
- Static does not automatically mean immutable.
- Static does not automatically mean thread-safe.
- Constructors and local variables cannot be static.
- Top-level classes cannot be static.

# Java Anonymous Class

An anonymous class is a class without a name. It is created and used at the same time.
You often use anonymous classes to override methods of an existing class or interface, without writing a separate class file.

Here, we create an anonymous class that extends another class and overrides its method:

```java
// Normal class
class Animal {
  public void makeSound() {
    System.out.println("Animal sound");
  }
}

public class Main {
  public static void main(String[] args) {
    // Anonymous class that overrides makeSound()
    Animal myAnimal = new Animal() {
      public void makeSound() {
        System.out.println("Woof woof");
      }
    }; // semicolon is required to end the line of code that creates the object

    myAnimal.makeSound();
  }
}
```

Output:

```
Woof woof
```

Anonymous Class from an Interface:

You can also use an anonymous class to implement an interface on the fly:

```java
// Interface
interface Greeting {
  void sayHello();
}

public class Main {
  public static void main(String[] args) {
    // Anonymous class that implements Greeting
    Greeting greet = new Greeting() {
      public void sayHello() {
        System.out.println("Hello, World!");
      }
    };

    greet.sayHello();
  }
}
```

Output:

```
Hello, World!
```

> [!WARNING]
> When to use anonymous classes? Use anonymous classes when you need to create a short class for one-time use. For example:
> - Overriding a method without creating a new subclass
> - Implementing an interface quickly
> - Passing small pieces of behavior as objects

# Java Enum

An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
To create an enum, use the `enum` keyword (instead of `class` or `interface`), and separate the constants with a comma. Note that they should be in uppercase letters:

```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;
    System.out.println(myVar);
  }
}
```

> [!WARNING]
> Difference between Enums and Classes: an enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static, and final (unchangeable — cannot be overridden).
> An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
>
> Why and when to use enums? Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.


# Wrapper Classes

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
The table below shows the primitive type and the equivalent wrapper class:

| Primitive Data Type | Wrapper Class |
|---------------------|---------------|
| byte                | Byte          |
| short               | Short         |
| int                 | Integer       |
| long                | Long          |
| float               | Float         |
| double              | Double        |
| boolean             | Boolean       |
| char                | Character     |


```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
```
So basically Wrapper classes are used in java to convert primitve data types into objects, 
the int becomes Integer, we use full form of the datatype and it starts with capital letter.

It is used so we can use class methods on primitve datatypes.
for Integer we have a pacakge called java.lang.Integer (the java.lang.* is avaialble in all the programs) which is
automatically imported.
so does other primitve datatype classes. these clases provides extra add on methods to the objects.(ie Integer, Long) etc.

Creating wrapper classes also help to assign null values to the datatypes.
ie Integer num = null; // correct
int num = null; // incorrect.


# Summary Table

| OOP           | Contents                                                         |
|-------------- | ---------------------------------------------------------------- |
| Inheritance   | single, multi level, hierarchical, hybrid, multiple (interfaces) |
| Polymorphism  | method overloading / method overriding                           |
| Abstraction   | abstract / interfaces                                            |
| Encapsulation | getters setters / validation / security                          |