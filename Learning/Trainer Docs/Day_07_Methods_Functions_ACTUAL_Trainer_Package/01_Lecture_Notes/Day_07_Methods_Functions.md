# Day 7 — Methods / Functions

## Learning Objectives
- Understand why methods exist.
- Declare and call methods.
- Use parameters and arguments.
- Understand return values and `void`.
- Distinguish local variables and parameters.
- Use `static` methods from `main`.
- Understand method signature and overloading basics.
- Break a problem into small reusable functions.

## 1. Why Methods?
Without methods, the same logic gets repeated. A method gives a task a name.

```java
static void greet() {
    System.out.println("Hello!");
}
```

Call it with `greet();`.

## 2. Method Anatomy
```java
static int add(int a, int b) {
    return a + b;
}
```

- `static` — callable from static `main` without creating an object.
- `int` — return type.
- `add` — method name.
- `(int a, int b)` — parameters.
- `return` — sends a value back to caller.

## 3. Parameters vs Arguments
```java
static int square(int n) {
    return n * n;
}
int ans = square(7);
```
`n` is a parameter; `7` is an argument.

## 4. void vs Return
```java
static void printLine() {
    System.out.println("---");
}

static int cube(int n) {
    return n * n * n;
}
```
Use `void` when the method does not return a value.

## 5. Return Must Match Type
```java
static int doubleValue(int x) {
    return x * 2;
}
```
A non-void method must return a compatible value on every reachable path.

## 6. Local Scope
```java
static int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```
`sum` exists only inside the method.

## 7. Methods Calling Methods
```java
static int square(int n) { return n * n; }
static int sumOfSquares(int a, int b) {
    return square(a) + square(b);
}
```
This is the beginning of decomposition and call-stack thinking.

## 8. Overloading
Same method name, different parameter list.
```java
static int add(int a, int b) { return a + b; }
static int add(int a, int b, int c) { return a + b + c; }
```
Changing only the return type is **not** overloading.

## 9. Java Pass-by-Value
Java is pass-by-value. For primitive variables, the method receives a copy of the value.
```java
static void change(int x) { x = 100; }
int a = 10;
change(a);
System.out.println(a); // 10
```

## 10. Common Patterns
```java
static boolean isEven(int n) { return n % 2 == 0; }
static int max(int a, int b) { return a > b ? a : b; }
static boolean isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

## 11. Method-First Problem Solving
For a word problem, ask: What independent task deserves a name? Example: `isPrime`, `maxOfThree`, `countDigits`, `reverseNumber`.

## DSA Connection
A binary search solution can be written as `binarySearch(arr, target)`. A sorting algorithm can be a separate method. Later, recursion will depend heavily on method calls and base cases.
