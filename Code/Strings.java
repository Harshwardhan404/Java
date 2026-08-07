public class Strings {

 public static void main(String[] args) {
    
    
// String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

// System.out.println(txt.length());


// String tx = " "+ "Abc wad" + " " ;

// System.out.println(tx.trim());

// double random =  Math.random()* 50;
// System.out.println(random);


// int age = 12;

// String result = (age >10)? "true" : "false";
// System.out.println(result);



// int age = 23;
// int sait = 24;

// if(age>13){
//     System.out.print("Good");

//     if(sait ==21){
// System.out.println("2nd stat");
//     }
// }




// for (int i = 1; i <= 2; i++) {
//   System.out.println("Outer: " + i); 
  
//   // Inner loop
//   for (int j = 1; j <= 3; j++) {
//     System.out.println(" Inner: " + j); 
//   }
// } 


// Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:


int[] numbers = {3, -1, 7, 0, 9};



for(int num : numbers){
    if(num<0){
        continue;
    }

    if(num ==0){
        break;
    }

    System.out.println(num);
}



}


}