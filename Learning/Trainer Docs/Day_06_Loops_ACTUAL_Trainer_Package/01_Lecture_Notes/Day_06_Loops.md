# Day 6 — Loops | Lecture Notes

## Learning Objectives
Students should be able to:
- Explain why loops are needed.
- Use `for`, `while`, and `do-while`.
- Identify initialization, condition and update.
- Dry-run loop state iteration by iteration.
- Use `break` and `continue` correctly.
- Write nested loops.
- Solve number/digit and basic pattern problems.
- Identify infinite loops and off-by-one errors.
- Derive basic loop complexity.

---

## 1. Why Loops?

Without a loop:
```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

With a loop:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Mental model:** same work + changing state + stopping condition.

---

## 2. Anatomy of a Loop

```java
for (initialization; condition; update) {
    // body
}
```

Example:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Think:
```text
i = 1
 ↓
i <= 5 ? ── no → stop
   │ yes
   ↓
body
   ↓
i++
   ↓
condition again
```

The three important questions:
1. Where does the state start?
2. When does the loop continue?
3. How does the state change?

---

## 3. for Loop

Best when the iteration structure is clear.

```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");
}
```

Output:
```text
0 1 2 3 4
```

### Common ranges
`1` to `n`:
```java
for (int i = 1; i <= n; i++) { }
```

`0` to `n-1`:
```java
for (int i = 0; i < n; i++) { }
```

`n` down to `1`:
```java
for (int i = n; i >= 1; i--) { }
```

---

## 4. while Loop

Use when repetition is primarily controlled by a condition.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Important:** update the state so that the loop can eventually terminate.

Danger:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
}
```
`i` never changes → infinite loop.

---

## 5. do-while Loop

The body executes **at least once**.

```java
int i = 10;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Output:
```text
10
```

Compare:
```java
while (condition) {
    // may execute zero times
}
```

```java
do {
    // executes at least once
} while (condition);
```

Typical use: menu/input validation where the first attempt must happen.

---

## 6. for vs while vs do-while

| Situation | Preferred |
|---|---|
| Clear counter/range | `for` |
| Continue until condition changes | `while` |
| Must execute body once | `do-while` |

The choice is about **clarity**, not that one loop is universally faster.

---

## 7. break

Immediately exits the nearest loop.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break;
    }
    System.out.print(i + " ");
}
```

Output:
```text
1 2 3 4 5
```

Use when the required answer is already found or further work is unnecessary.

---

## 8. continue

Skips the rest of the current iteration and moves to the next iteration.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.print(i + " ");
}
```

Output:
```text
1 2 4 5
```

**Important:** in a `for` loop, the update expression still happens after `continue`.

---

## 9. break vs continue

```text
break     → leave the loop completely
continue  → skip current iteration
```

Ask students:
> "अगर 3 को छोड़ना है तो क्या चाहिए? अगर 3 पर पूरा loop बंद करना है तो क्या चाहिए?"

---

## 10. Nested Loops

A loop inside another loop.

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:
```text
* * * *
* * * *
* * * *
```

For `n` rows and `m` columns, roughly `n × m` body executions → `O(nm)`.

If both are `n`:
```text
O(n²)
```

---

## 11. Accumulator Pattern

Keep a running answer.

### Sum 1 to n
```java
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```

Invariant:
> After processing `i`, `sum` contains the sum of all processed values.

### Count
```java
int count = 0;

for (int i = 1; i <= n; i++) {
    if (i % 2 == 0) {
        count++;
    }
}
```

---

## 12. Product / Factorial

```java
int fact = 1;

for (int i = 1; i <= n; i++) {
    fact *= i;
}
```

For `n = 5`:
```text
1 → 1
2 → 2
3 → 6
4 → 24
5 → 120
```

**Note:** `int` overflows quickly for factorial. Use an appropriate type and constraints.

---

## 13. Digit Processing with while

For a positive integer:
```java
int n = 5724;

while (n > 0) {
    int digit = n % 10;
    System.out.println(digit);
    n /= 10;
}
```

Digits are processed from right to left:
```text
4 → 2 → 7 → 5
```

### Reverse a number
```java
int n = 5724;
int rev = 0;

while (n > 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}
```

---

## 14. Important Edge Case: n = 0

This:
```java
while (n > 0) { }
```
executes zero times for `n = 0`.

If the problem says "number of digits" and considers `0` as one digit, handle it explicitly.

---

## 15. Prime Number Check

For `n > 1`, test divisors from `2` through `sqrt(n)`.

```java
boolean prime = n >= 2;

for (int i = 2; i <= n / i && prime; i++) {
    if (n % i == 0) {
        prime = false;
    }
}
```

Why `n / i` instead of `i * i <= n`?
It avoids multiplication overflow for large integer values.

Complexity:
```text
O(sqrt(n)) time
O(1) extra space
```

---

## 16. Common Loop Patterns

### Even numbers
```java
for (int i = 2; i <= n; i += 2) { }
```

### Reverse counting
```java
for (int i = n; i >= 1; i--) { }
```

### Multiples
```java
for (int i = k; i <= n; i += k) { }
```

### Search and stop
```java
for (...) {
    if (found) {
        break;
    }
}
```

### Skip invalid values
```java
for (...) {
    if (invalid) continue;
    // process valid value
}
```

---

## 17. Loop Complexity

Single loop:
```java
for (int i = 0; i < n; i++) { }
```
→ `O(n)`

Two independent loops:
```java
for (...) { }
for (...) { }
```
→ `O(n + n)` → `O(n)`

Nested loops:
```java
for (...) {
    for (...) { }
}
```
→ `O(n²)`

Halving/doubling:
```java
while (n > 1) {
    n /= 2;
}
```
→ `O(log n)`

The key is to count how many times the body executes.

---

## 18. Common Mistakes

### Off-by-one
```java
i < n
```
vs
```java
i <= n
```

### Wrong update
```java
i--;
```
when the condition requires `i` to increase.

### Infinite loop
State never changes toward termination.

### Wrong initialization
```java
int sum = 1;
```
when summing should start from zero.

### Accidental semicolon
```java
for (int i = 1; i <= 5; i++);
{
    System.out.println("Hello");
}
```

### continue causing skipped work
Understand exactly what code is skipped.

### Overflow
Factorial, powers and large sums may exceed `int`.

---

## 19. Problem-Solving Rule

```text
Understand
→ Identify repeated work
→ Decide loop condition
→ Initialize state
→ Define update
→ Dry run
→ Code
→ Test boundaries
→ Complexity
```
