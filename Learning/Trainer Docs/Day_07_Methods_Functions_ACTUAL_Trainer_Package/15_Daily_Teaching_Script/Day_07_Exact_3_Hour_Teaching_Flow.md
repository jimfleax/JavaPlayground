# Day 7 — Exact 3-Hour Teaching Flow

## 00:00–00:10 — Energy + Revision
Quickly revise loops, conditions and operators. Ask 5 output-prediction questions.

## 00:10–00:20 — Hook: Repetition Problem
Ask students to imagine printing the same task 20 times. Write duplicated code, then ask for a better idea. Introduce “give a task a name”.

## 00:20–00:35 — First Method
Build `greet()`. Explain declaration, call and execution flow. Students call it 3 times.

## 00:35–00:55 — Parameters
Teach `greet(name)`, `add(a,b)`. Ask parameter vs argument repeatedly.

## 00:55–01:15 — Return Values
Contrast:
```java
System.out.println(a+b);
```
with:
```java
return a+b;
```
Do `square`, `isEven`, `max`. Make students predict outputs before running.

## 01:15–01:30 — Method Composition
Build `square()` then `sumOfSquares()`. Introduce “method calling method”.

## 01:30–01:40 — Break

## 01:40–01:55 — Scope + static
Explain local variables, parameters, and why beginner examples use static methods with static main.

## 01:55–02:10 — Overloading
Build `add(int,int)` and `add(int,int,int)`. Show that changing only return type does not overload.

## 02:10–02:25 — Pass-by-Value
Use `change(int x)` puzzle. Ask students what happens to original variable.

## 02:25–02:45 — Problem Solving
Students build `countDigits`, `reverseNumber`, `isPalindrome`. Force method-first planning before code.

## 02:45–02:55 — Prime Method + DSA Connection
Build `isPrime` with `i*i <= n`. Discuss O(sqrt(n)). Preview how methods will be used in searching/sorting/recursion.

## 02:55–02:59 — CP Challenge
Give Number Analyzer. Students write method names/signatures first.

## 02:59–03:00 — Exit
Ask:
1. Parameter vs argument?
2. Print vs return?
3. Why void?
4. Can return type alone overload?
5. Why methods matter in DSA?

## Success Criterion
Students can take a problem, identify reusable tasks, define methods with correct parameters/return types, call them correctly, and explain the complexity of the method.
