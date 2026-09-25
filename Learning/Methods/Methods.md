# Methods in Java

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as **functions**.

## Why use methods?
To reuse code: define the code once, and use it many times.

## Create a Method
A method must be declared within a class.
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }
}
```
- `myMethod()` is the name of the method.
- `static` means that the method belongs to the Main class and not an object of the Main class.
- `void` means that this method does not have a return value.

## Call a Method
To call a method in Java, write the method's name followed by two parentheses `()` and a semicolon `;`.
```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod(); // Calls the method
  }
}
```

## Parameters and Arguments
Information can be passed to methods as parameters.
```java
static void myMethod(String fname) {
  System.out.println(fname + " Doe");
}
```

## Return Values
If you want the method to return a value, you can use a primitive data type (such as `int`, `char`, etc.) instead of `void`, and use the `return` keyword inside the method.
```java
static int myMethod(int x) {
  return 5 + x;
}
```
