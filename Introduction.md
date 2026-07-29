# Basics

1) The class name should match the file name in Java.
2) The class name should be in capital.

# How to run a java file

Save the code in Notepad as "Main.java". Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, and type "javac Main.java":

C:\Users\Your Name>javac Main.java  > To compile the Java code
C:\Users\Your Name>java Main        > to run your class


# The print method

    you can use println() -> prints in new line
    you can use print() -> prints in same line

    we use "String" to print String.
    we can use print(34) without double quotes to print numbers.


    we can use + to concatenate Strings ie - print(name + lastName);
    also we can concantenate Strings and variables ie - print(name + "Harsh");


 ```edge case for concatination ```
    int x = 5;
    int y = 6;

    System.out.println("The sum is " + x + y);   // Prints: The sum is 56
    System.out.println("The sum is " + (x + y)); // Prints: The sum is 11


# Comments

    single line -> // this is a single line comment
    multi - line comment -> /* this is a multi-line comment */


# Variables

 ```Primitive```
  >byte - stores integers (whole numbers), from -128 to 127, such as 25 or -50
  >short - stores integers (whole numbers), from -32,768 to 32,767, such as 2026 or -5000
  >int - stores integers (whole numbers), without decimals, such as 123 or -123
  >long - stores large integers (whole numbers), such as 9876543210L or -123456789L
  >float - stores floating point numbers, with decimals, such as 19.99f or -19.99f
  >double - stores large floating point numbers, with high decimal precision, such as 3.14159 or -0.005
  >char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
  >boolean - stores values with two states: true or false

```Non-primitive```
  >String - stores text, such as "Hello". String values are surrounded by double quotes
  >Arays - stores multiple values of the same type in a single variable, such as {1, 2, 3}
  >Classes - stores user-defined blueprints that contain fields and methods to create objects
  >Interfaces - stores abstract specifications that define behaviors for classes to implement
  >Enums - stores a fixed group of constants, such as days of the week or compass directions


## declaring Variables 

 1. int a = 34;
 2. int a;
    a = 32;
 3. int a = 234;
    int a = 32;
    print(a); // 32


`final variable` 

 > final int a = 32;
 > we will not able to change the value in the code of a.


## Declare Many Variables

 >int x = 5, y = 6, z = 50;
 >System.out.println(x + y + z); // 61    


 ```One Value to Multiple Variables```
  >int x, y, z;
  >x = y = z = 50;
  >System.out.println(x + y + z); // 150


# Identifiers

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, and cannot contain whitespace
- Names can also begin with $ and _
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names


# The var keyword

 - The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
 - instead of writing int a = 4; you can write var a = 4;
 - you cannot change the datatype once declared.
 - you cannot just declare var ie -> var a; and later assign value to it line normal variables.
 