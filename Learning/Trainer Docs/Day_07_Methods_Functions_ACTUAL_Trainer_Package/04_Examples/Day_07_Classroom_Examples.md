# Day 7 Classroom Examples

1. `greet(name)` — void method
2. `add(a,b)` — return value
3. `isEven(n)` — boolean method
4. `maxOfThree(a,b,c)`
5. `square(n)`
6. `sumOfSquares(a,b)` — method calling method
7. `countDigits(n)`
8. `reverseNumber(n)`
9. `isPalindrome(n)`
10. `isPrime(n)`
11. `factorial(n)`
12. `power(base, exp)`
13. `printTable(n)` — void + loop
14. `grade(marks)` — String return
15. overloaded `add()` methods

## Return vs Print
```java
static int square(int n) {
    return n * n;
}

int x = square(5);
System.out.println(x);
```
The method returns a value; the caller decides what to do with it.

## Challenge: Method Chain
```java
static int f(int x) { return x + 2; }
static int g(int x) { return x * 3; }
System.out.println(g(f(4))); // 18
```
