# Day 7 Trainer Notes

## Main Goal
Students should stop writing one giant `main()` and start thinking in **named reusable tasks**.

## Opening Hook
Ask: “If I ask you to print `Hello` 20 times, will you write the same code 20 times?” Then ask: “Can we give this task a name?”

## Board Flow
```text
Repeated Task
 ↓
Give it a Name
 ↓
What Input?
 ↓
What Output?
 ↓
Method
 ↓
Call
```

## Live Prediction
Write without running:
```java
static int f(int x) {
    x = x + 5;
    return x * 2;
}
System.out.println(f(3));
```
Ask students to predict `16`.

## Must-Demo Sequence
1. `void greet()`
2. `int add(int,int)`
3. `boolean isEven(int)`
4. Method calling another method
5. Return vs print
6. Overloading
7. Pass-by-value
8. Prime method

## Critical Misconceptions
- “Method prints” and “method returns” are the same — they are not.
- Parameter is not the same thing as argument.
- A return value can be stored, printed, compared, or passed to another method.
- `static` is not the definition of a method; it is a modifier.
- Return type alone cannot distinguish overloaded methods.

## Hint Ladder
Level 1: What is the task name?
Level 2: What inputs does it need?
Level 3: What should it give back?
Level 4: Write signature only.
Level 5: Write logic.

## Trainer Line
“Method ka goal code ko chhota dikhana nahi; thinking ko reusable banana hai.”
