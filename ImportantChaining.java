
class Child extends ImportantChaining{

    Child(){
        super("Taj", 32);
    }

}

abstract class FirstOne {

     public void printSome(){
        System.out.println("First one");
    }
}

public class ImportantChaining {

    String name;
    int age;
    
    public ImportantChaining(String Name, int Age){
        this.name = Name;
        this.age = Age;

    }

    public static void main(String[] args) {

        Child c1 = new Child();
        System.out.println(c1.name);
      
    }
}
