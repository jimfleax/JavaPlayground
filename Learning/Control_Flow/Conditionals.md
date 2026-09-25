# Conditionals (If/Else)

Java supports the usual logical conditions from mathematics:
- Less than: `a < b`
- Less than or equal to: `a <= b`
- Greater than: `a > b`
- Greater than or equal to: `a >= b`
- Equal to `a == b`
- Not Equal to: `a != b`

## The if Statement
Use `if` to specify a block of code to be executed, if a specified condition is true.
```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```

## The else Statement
Use `else` to specify a block of code to be executed, if the same condition is false.
```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

## The else if Statement
Use `else if` to specify a new condition to test, if the first condition is false.
```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```
