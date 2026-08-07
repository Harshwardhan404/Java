// compile time polymorphism

class Student{

String name;
int age;
String subject;


public void printInfo(){
System.out.println(this.name);
}

public void printInfo(String Name, String Subject){
    this.name = Name;
    this.subject = Subject;
    System.out.println(this.name + this.subject);

}


public void printInfo(String Subject){
System.out.println(this.subject);
}

}


class Shape{

String color;
int count;
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

  public void returnCount(){
    System.out.println(this.count);
  }

}


public class PolymorphismJ {
public static void main(String[] args) {

// Student s1 = new Student();
// s1.age = 12;
// s1.name = "ajay";
// s1.subject = "Maths";
// s1.printInfo();
// s1.printInfo("Harsh", "english");
// s1.printInfo("english");


EquilateralTriangle eq = new EquilateralTriangle();

eq.count =1;
eq.returnCount();


}

}
