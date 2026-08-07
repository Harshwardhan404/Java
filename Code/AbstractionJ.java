 abstract class Human {

    int a;
    String name;

     public void callPerson(){
        System.out.println("call someone");
     };

     Human(int a, String s){
        this.a = a;
        this.name = s;
        System.out.println(a + " " + s);
     }
    
}

class Raj extends Human {

    Raj(){

 super(0," ");
 System.out.println("Parent construtor called.");
    }
   
}


public class AbstractionJ {
    public static void main(String[] args) {
     
    Raj r1 = new Raj();
    r1.callPerson();

    }
}




// interface InterfaceJ {

//     public void eat();
    
// }

// class Harsh implements InterfaceJ{
//     public void eat(){
//         System.out.println("eating");
//     }
// }
