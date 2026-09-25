# Loops

Loops can execute a block of code as long as a specified condition is reached.

## The While Loop
The `while` loop loops through a block of code as long as a specified condition is `true`:
```java
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
```

## The For Loop
When you know exactly how many times you want to loop through a block of code, use the `for` loop instead of a `while` loop:
```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

### Statement 1: `int i = 0`
Executed (one time) before the execution of the code block.
### Statement 2: `i < 5`
Defines the condition for executing the code block.
### Statement 3: `i++`
Executed (every time) after the code block has been executed.

## Nested Loops
It is also possible to place a loop inside another loop. This is called a nested loop. The "inner loop" will be executed one time for each iteration of the "outer loop".
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
