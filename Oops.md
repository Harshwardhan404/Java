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

- class name should start with a capital letter
- class name and file name should be same
- you main method serves as entry point to run the class, you can iniate other class objects in main method. 


> [!WARNING]
  Simple analogy: a class is a house blueprint, while an object is the actual house built from that blueprint.


# Objects

An object is an actual instance of a class. It occupies memory and can use the variables and methods defined by its class.

```java
Car myCar = new Car();  // creating a instance of a object.

myCar.color = "Red";
myCar.drive();       // calling methods declared in the class.
```


### Static Methods in Java

A static method belongs to the class, not to an individual object.
> [!WARNING]
    Static method → belongs to the class → call it using the class name.

example ->

```java
class Pen {
    public static void makePen(){
        System.out.println("Creating pen");
    }
}

> Pen.makePen(); // can be only called by class name.
```

 # Constructor

 - information about constructors.
 - constructor does not have a return type (not even void).
 - constructor is method with same name as class.
 - for one object constructor runs only one time, during object creation.
 - constructor is a method but starts with captial letter as class.

 ## types of constructors

 ### non parameterized constructor

 Constructor with no parameters (Default type).
 Java creates it's own constructor for the class and creates a object out of it.
 but if you declare your own Constructor java will override it's constructor and use your defined constructor.
 remember while creating a object you write -
 ```java
 Student s1 = new Student(); // here Student is constructor called for the Student class.
```

- example

for class called Student -> 
constructor will look like this 

```java
class Student {
 Student(){
     System.out.println("Creating object");
 }
}
```


 ### parameterized constructors
 

A parameterized constructor takes values when an object is created and stores those values in the object.


- example 

 ```java
 class Student {
    String name; // class specific properties
    int age;

    Student(int Age, String Name) {
        System.out.println("Created a new instance of a object...");
        this.age = Age;   // we are assigning the class specific variables to parameters from constructor.
        this.name = Name; // name is class variable and Name is parameter value given from object.
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


 ### copy constructors

 It's main use is to put data of one object to another object.