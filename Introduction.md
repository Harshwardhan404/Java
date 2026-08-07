# Basics

1) The class name should match the file name in Java.
2) The class name should be in capital.

# How to run a java file

Save the code in Notepad as "Main.java". Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, and type "javac Main.java":

```
C:\Users\Your Name>javac Main.java  > To compile the Java code
C:\Users\Your Name>java Main        > to run your class
```

# The print method

- you can use println() -> prints in new line
- you can use print() -> prints in same line

- we use "String" to print String.
- we can use print(34) without double quotes to print numbers.

- we can use + to concatenate Strings ie - print(name + lastName);
- also we can concantenate Strings and variables ie - print(name + "Harsh");

`edge case for concatination`

```java
int x = 5;
int y = 6;

System.out.println("The sum is " + x + y);   // Prints: The sum is 56
System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
```

# Comments

- single line -> `// this is a single line comment`
- multi-line comment -> `/* this is a multi-line comment */`

# Variables

**Primitive**
- byte - stores integers (whole numbers), from -128 to 127, such as 25 or -50
- short - stores integers (whole numbers), from -32,768 to 32,767, such as 2026 or -5000
- int - stores integers (whole numbers), without decimals, such as 123 or -123
- long - stores large integers (whole numbers), such as 9876543210L or -123456789L
- float - stores floating point numbers, with decimals, such as 19.99f or -19.99f
- double - stores large floating point numbers, with high decimal precision, such as 3.14159 or -0.005
- char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- boolean - stores values with two states: true or false

**Non-primitive**
- String - stores text, such as "Hello". String values are surrounded by double quotes
- Arays - stores multiple values of the same type in a single variable, such as {1, 2, 3}
- Classes - stores user-defined blueprints that contain fields and methods to create objects
- Interfaces - stores abstract specifications that define behaviors for classes to implement
- Enums - stores a fixed group of constants, such as days of the week or compass directions

## declaring Variables

```java
// 1.
int a = 34;

// 2.
int a;
a = 32;

// 3.
int a = 234;
int a = 32;
print(a); // 32
```

**`final variable`**

```java
final int a = 32;
// we will not able to change the value in the code of a.
```

## Declare Many Variables

```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z); // 61
```

**One Value to Multiple Variables**

```java
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z); // 150
```

# Identifiers

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, and cannot contain whitespace
- Names can also begin with $ and _
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names

# The var keyword

- The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
- instead of writing `int a = 4;` you can write `var a = 4;`
- you cannot change the datatype once declared.
- you cannot just declare var ie -> `var a;` and later assign value to it line normal variables.

# Java Case Conventions Breakdown

| Element    | Case Convention  | Example                              |
|------------|-------------------|---------------------------------------|
| Classes    | PascalCase        | `public class StudentRecord`          |
| Interfaces | PascalCase        | `public interface Runnable`           |
| Methods    | camelCase         | `public void calculateTotal()`        |
| Variables  | camelCase         | `int userAge;`                        |
| Constants  | UPPER_SNAKE_CASE  | `public static final int MAX_VALUE`   |
| Packages   | lowercase         | `com.company.project.utility`         |

# Type Casting

Converting One datatype into another -

There are 2 type of casting in Java

> **Widening Casting (automatic)** - converting a smaller type to a larger type size
> byte -> short -> char -> int -> long -> float -> double

> **Narrowing Casting (manual)** - converting a larger type to a smaller type size
> double -> float -> long -> int -> char -> short -> byte

**Example**

```java
double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9
```

# Operators in Java

Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

### Arithmetic Operators

| Operator | Name           | Description                            | Example |
|----------|----------------|-----------------------------------------|---------|
| +        | Addition       | Adds together two values                | x + y   |
| -        | Subtraction    | Subtracts one value from another        | x - y   |
| *        | Multiplication | Multiplies two values                   | x * y   |
| /        | Division       | Divides one value by another            | x / y   |
| %        | Modulus        | Returns the division remainder          | x % y   |
| ++       | Increment      | Increases the value of a variable by 1  | ++x     |
| --       | Decrement      | Decreases the value of a variable by 1  | --x     |

### Assignment Operators

Assuming x = 10

| Operator | Example | Same As    | Result |
|:--------:|:-------:|:----------:|:------:|
| =        | x = 5   | x = 5      | 5      |
| +=       | x += 3  | x = x + 3  | 13     |
| -=       | x -= 3  | x = x - 3  | 7      |
| *=       | x *= 3  | x = x * 3  | 30     |
| /=       | x /= 3  | x = x / 3  | 3      |
| %=       | x %= 3  | x = x % 3  | 1      |
| &=       | x &= 3  | x = x & 3  | 2      |
| \|=      | x \|= 3 | x = x \| 3 | 11     |
| ^=       | x ^= 3  | x = x ^ 3  | 9      |
| >>=      | x >>= 3 | x = x >> 3 | 1      |
| <<=      | x <<= 3 | x = x << 3 | 80     |

### Comparasion Operators

| Operator | Name                     | Example |
|----------|--------------------------|---------|
| ==       | Equal to                 | x == y  |
| !=       | Not equal                | x != y  |
| >        | Greater than             | x > y   |
| <        | Less than                | x < y   |
| >=       | Greater than or equal to | x >= y  |
| <=       | Less than or equal to    | x <= y  |

### Logical Operators

Assuming x = 10

| Operator | Name        | Description                                     | Example             | Result |
|:--------:|:-----------:|:------------------------------------------------:|:--------------------:|:------:|
| &&       | Logical AND | Returns true if both statements are true         | x < 5 && x < 10      | false  |
| \|\|     | Logical OR  | Returns true if at least one statement is true   | x < 5 \|\| x < 4     | false  |
| !        | Logical NOT | Reverses the result                              | !(x < 5 && x < 10)   | true   |

### Order of Precedence

Order of Operations

Here are some common operators, from highest to lowest priority:

1. `()` - Parentheses
2. `*`, `/`, `%` - Multiplication, Division, Modulus
3. `+`, `-` - Addition, Subtraction
4. `>`, `<`, `>=`, `<=` - Comparison
5. `==`, `!=` - Equality
6. `&&` - Logical AND
7. `||` - Logical OR
8. `=` - Assignment

> Subtraction and addition are done from left to right, unless you add parentheses:

The Engine will follow the Precedence first in above given order and then if it's in same level then the engine will follow from left to right.

ie for -> Subtraction and addition are done from left to right, unless you add parentheses.

# Strings in Java

A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.

```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
```

Some methods of String object -->

- `String.length();`
- `String.toUpperCase();`
- `String.toLowerCase();`
- `String.indexOf();` -> returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

```java
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
```

- `String.charAt(4)` -> pass the in, you will get the charachter at that index.
- `String.equals(str2)` -> Compares String one and string 2 if matched gives true else false.
- `String.trim()` -> trims the String and removes white spaces around both edges. (does not modify original string)
- `String.concat()` -> firstName.concat(lastName) -> concats 2 strings.

# Escape Sequence Character

| Code | Result          |
|------|-----------------|
| \n   | New Line        |
| \t   | Tab             |
| \b   | Backspace       |
| \r   | Carriage Return |
| \f   | Form Feed       |

# Java Math

> The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

Here are some of the Math class functions you can use.

- `Math.max(5,10);` // 10 -> returns the max value from given numbers
- `Math.min(5, 10);` // 5 -> returns min value from given number
- `Math.sqrt(64);` // 8 -> gives the square root of given number
- `Math.abs(-4.7);` // 4.7 -> gives absoulte number ie postive number back
- `Math.pow(2, 8);` // 256.0 -> gives the 2 power to 8 ie 256. it always returns a double.
- `Math.round(4.6);` // 5 -> rounds up to nearest whole number.
- `Math.ceil(4.1);` // 5.0 -> return ceiling value.
- `Math.floor(4.9);` // 4.0 -> returns to floor value

- `Math.random();` -> returns a random number between 0.0 (inclusive), and 1.0 (exclusive):

```java
int randomNum = (int)(Math.random() * 101);  // 0 to 100
// Note: Math.random() returns a double. To get an integer, you need to cast it with (int).
```

# Java Boolean

A boolean type is declared with the boolean keyword and can only take the values true or false:

- YES / NO
- ON / OFF
- TRUE / FALSE

# Conditionals

- if
- if - else
- if - else if - else
- Short Hand if...else
- nested if else
- Logical Operators
- switch

### 1) if

```java
if (condition) {
  // block of code to be executed if the condition is true
}
```

> The condition inside the if statement must result in a boolean value only.
> `if (20 > 18) System.out.println("20 is greater than 18");`
> if a if statement has only one line of code, you can write it without curly braces `{ }`:
> more than one line can casue problems. therefore use curly braces to create code blocks.

### 2) if else

The else statement lets you run a block of code when the condition in the if statement is false.

```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```

### 3) if - else if - else

Use the else if statement to specify a new condition to test if the first condition is false.

```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if condition1 is false and condition2 is true
} else {
  // block of code to be executed if both conditions are false
}
```

### 4) Short Hand if...else

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

```java
variable = (condition) ? expressionTrue : expressionFalse;
```

### 5) Nested if

You can also place an if statement inside another if. This is called a nested if statement.
A nested if lets you check for a condition only if another condition is already true.

```java
if (condition1) {
  // code to run if condition1 is true
  if (condition2) {
    // code to run if both condition1 and condition2 are true
  }
}
```

### 6) Logical Operators

You can also use logical operators in if else to check multiple variables and conditions.

- `&&` (AND) - all conditions must be true
- `||` (OR) - at least one condition must be true
- `!` (NOT) - reverses a condition (true = false, false = true)

### 7) switch case

Instead of writing many if..else statements, you can use the switch statement.

Think of it like ordering food in a restaurant: If you choose number 1, you get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta. Otherwise, you get nothing.

```java
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

example ->

```java
int age = 12;

switch(age) {
    case 23 :
        System.out.println("good");
    break;
    case 34 :
        System.out.println("not good");
    break;
    default:
        System.out.println("niceee");
    break;
}
```

> switch case just matched the value in the expression ie age here with all the cases and if it does not find any it runs the defualt case.

# loops

Loops can execute a block of code as long as a specified condition is true.

There are 3 types of loops in java

- for loop
- for each loop
- while loop
- do while loop

## while loop

The while loop repeats a block of code as long as the specified condition is true:

```java
while (condition) {
  // code block to be executed
}
```

A while loop may never run if the condition is false from the start. the do while loop, which always runs the code at least once before checking the condition.

## do while loop

The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.

```java
do {
  // code block to be executed
}
while (condition);
```

## for loop

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

```java
for(int i = 0; i<=10; i++){
    System.out.println(i);
}
```

result -> 0,1,2,3,4,5,6,7,8,9,10

> check at the result, it even printed i= 0 first and then started the incrementation.

### Nested loops

The "inner loop" will be executed one time for each iteration of the "outer loop":

```java
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times

  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
}
```

> outer loop runs 2 times, whereas inner loop runs 6 times (3 iteration for 1 outer loop iteration.)

## for each loop

There is also a "for-each" loop, which is used exclusively to loop through elements in an array.

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

example ->

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars) {
  System.out.println(car);
}
```


# Break and Continue

The break statement can also be used to jump out of a loop or switch statements.

example 1 ->

This example skips the value of 4:

```java 
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```

example 2 ->

This example skips the value of 4:

```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```

> break statement stops the loop and breaks when the given condition is true.
> continue statement is used to skip the current iteration and move on to next.



# Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets [ ] :

example ->
 ```java 
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

you can access the elements of an array by -

cars[0]; // prints Volvo

you can also change value through index in array -

cars[0] = "Alto";   // first element of array becomes Alto

to find the lenghth of an array use 

cars.length;  -> not a method of class array (.length) is property of a array.

> [!WARNING]
  The array which are provided by java are low level high performance and thus does not provides methods.
  if you want to use methods and manipulate arrays, you can import java.util.Array class and use methods of it
  or you can use ArrayList provided by java to perform operations.


## differnt ways to initilize an array.

- using new keyword

    ```java
    String[] cars = new String[4]; // size is 4
    ```

- declaring array 

    ```java
    String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
    ```
    same as
    ```java
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    ```

## Looping through arrays


- you can use for loop or for- each loop to loop through arrays

example ->

```java
// for loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
} 

 // for each loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

for (String car : cars) {
  System.out.println(car);
}
```

> when you want indexes with arrays use for loop, when you just want value use for - each loop.


## Multidimensional Arrays

 A multidimensional array is an array that contains other arrays.
 You can use it to store data in a table with rows and columns.

example - 

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
```

- Access Elements
To access an element of a two-dimensional array, you need two indexes: the first for the row, and the second for the column.
    
```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
System.out.println(myNumbers[1][2]); // Outputs 8
```

- Looping through an Multi- dimensional array

> for loop
```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for(int i =0; i< myNumbers.length; i++){

    System.out.println("Values at index " +i);
    for(int j =0; j< myNumbers[i].length; j++){
        System.out.println(myNumbers[i][j]);
    }
 }
```

> for each loop

```java
int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

for (int[] row : myNumbers) {
  for (int num : row) {
    System.out.println(num);
  }
}
```

# Java methods

A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.


```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}
```


## Parameters and Arguments

When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

```java
public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
  }
}
// Liam Refsnes
// Jenny Refsnes
// Anja Refsnes
```

>[!WARNING]
 Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.


# Java input

The Scanner class is used to get user input, and it is found in the java.util package.


```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
```
Table of input methods supported by Scanner class.

| Method        | Description                         |
|---------------|-------------------------------------|
| nextBoolean() | Reads a boolean value from the user |
| nextByte()    | Reads a byte value from the user    |
| nextDouble()  | Reads a double value from the user  |
| nextFloat()   | Reads a float value from the user   |
| nextInt()     | Reads a int value from the user     |
| nextLine()    | Reads a String value from the user  |
| nextLong()    | Reads a long value from the user    |
| nextShort()   | Reads a short value from the user   |

>[!WARNING]
 Note: If you enter wrong input (e.g. text in a numerical input), you will get an exception/error message (like "InputMismatchException").


# Error handling

Types of Errors in Java

| Error Type         | Description                                                |
|--------------------|------------------------------------------------------------|
| Compile-Time Error | Detected by the compiler. Prevents code from running.      |
| Runtime Error      | Occurs while the program is running. Often causes crashes. |
| Logical Error      | Code runs but gives incorrect results. Hardest to find.    |


1. Compile-Time Errors
 Compile-time errors occur when the program cannot compile due to syntax or type issues.
 it prevents code from running, it's basically a syntax erorr, or something wrong with code.

2. Runtime Error
 Runtime errors occur when the program compiles but crashes or behaves unexpectedly.
 These type of errors are caught at runtime.
 eg -
 ```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[8]);
 ```
output - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3

3. Logical errors happen when the code runs, but the result is not what you thought
  Like - System.out.println("Name"+ 32);  // prints Name32 which is a logical error.


## What is Debugging?
Debugging is the process of identifying and fixing errors or bugs in your code.

It often involves:
- Reading error messages
- Tracing variable values step by step
- Testing small pieces of code independently


## Try catch block

Exception handling lets you catch and handle errors during runtime - so your program doesn't crash.

It uses different keywords:
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The finally statement lets you execute code, after try...catch, regardless of the result:
The try and catch keywords come in pairs:

```java
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
finally {
  System.out.println("This code will be executed no matter what");
}
```


## The throw keyword

The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:


you can throw custom Exceptions like -> throw new FileNotFoundException("File not found");

example
```java
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```

Output ->
Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at Main.checkAge(Main.java:4)
        at Main.main(Main.java:12)


format to throw new error -> throw new Errortype("Message");


| Error/Exception                 | Description                                                                    |
|---------------------------------|--------------------------------------------------------------------------------|
| ArithmeticException             | Occurs when a numeric calculation goes wrong                                   |
| ArrayIndexOutOfBoundsException  | Occurs when trying to access an index number that does not exist in an array   |
| ClassNotFoundException          | Occurs when trying to access a class that does not exist                       |
| FileNotFoundException           | Occurs when a file cannot be accessed                                          |
| InputMismatchException          | Occurs when entering wrong input (e.g. text in a numerical input)              |
| IOException                     | Occurs when an input or output operation fails                                 |
| NullPointerException            | Occurs when trying to access an object referece that is null                   |
| NumberFormatException           | Occurs when it is not possible to convert a specified string to a numeric type |
| StringIndexOutOfBoundsException | Occurs when trying to access a character in a String that does not exist       |



### Java Multiple Exceptions
Sometimes, different errors (exceptions) can happen in the same try block. You can handle them with multiple catch blocks.

```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
      int result = 10 / 0;              // ArithmeticException
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index does not exist.");
    } 
    catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero.");
    } 
    catch (Exception e) {
      System.out.println("Something else went wrong.");
    }
  }
}
```

>[!IMPORTANT]
 Order Matters
 You should always put more specific exceptions first, and general ones later. Otherwise, the general catch will grab the error and the specific ones will never run.

 ### Multi-Catch

 since Java 7, you can catch multiple exceptions in one catch block using the | symbol. This is useful when different exceptions should be handled in the same way, so you don't have to repeat code:

 ```java
catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
  System.out.println("Math error or array error occurred.");
}

 ```

you can catch multiple exceptions with one catch block.


### Java Try-with-Resources

Try-with-resources is used with files, streams, database connections, and other resources that must be closed after use.
Its syntax is:
`try (resource declaration) { } catch (Exception e) { }`
Resources should always be closed after use because leaving them open can waste system resources and cause resource leaks.
Java automatically closes resources declared inside the `try(...)` parentheses when the block finishes, even if an exception occurs. This makes exception handling cleaner and safer because we do not need to close the resource manually.


```java
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // resource is opened inside try()
    try (FileOutputStream output = new FileOutputStream("filename.txt")) {
      output.write("Hello".getBytes());
      // no need to call close() here
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Error writing file.");
    }
  }
}
```
Why use try-with-resources?
Safer - resources are always closed, even if an exception occurs.
Cleaner - no need to write close() calls.
Shorter code - less boilerplate, easier to read.


>[!IMPORTANT]
 Rule of thumb: Whenever you work with files, streams, or database connections, use try-with-resources to make sure they are closed properly.