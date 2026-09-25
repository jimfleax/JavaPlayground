# User Input (Scanner)

The `Scanner` class is used to get user input, and it is found in the `java.util` package.

To use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation.

## Example
```java
import java.util.Scanner;  // Import the Scanner class

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    
    myObj.close(); // Don't forget to close it!
  }
}
```

## Input Types
- `nextInt()`: Reads an `int` value.
- `nextFloat()`: Reads a `float` value.
- `nextDouble()`: Reads a `double` value.
- `nextBoolean()`: Reads a `boolean` value.
- `nextLine()`: Reads a `String` value.
- `next()`: Reads a single word (until a space is encountered).

**Note:** Always remember to close your scanner using `myObj.close();` to prevent memory leaks!
