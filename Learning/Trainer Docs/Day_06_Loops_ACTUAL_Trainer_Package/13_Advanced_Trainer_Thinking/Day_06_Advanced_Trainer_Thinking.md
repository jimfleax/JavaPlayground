# Advanced Trainer Thinking — Day 6

## 1. Loop Correctness Has Three Parts

For every loop, train students to ask:

### Initialization
Is the starting state correct?

### Maintenance
After each iteration, is the state still meaningful?

### Termination
Does the state move toward the stopping condition?

Example:
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

A useful invariant:
> Before processing `i`, `sum` contains the sum of all integers from 1 through `i-1`.

After processing `i`, it contains the sum through `i`.

---

## 2. Off-by-One as a Boundary Problem

For:
```java
for (int i = 0; i < n; i++)
```
values are:
```text
0, 1, ..., n-1
```

For:
```java
for (int i = 1; i <= n; i++)
```
values are:
```text
1, 2, ..., n
```

Do not say "बस यही syntax है." Ask:
> "Which values are included?"

---

## 3. Loop Complexity Is About Iteration Count

### Consecutive loops
```java
for (...) { }
for (...) { }
```
If each is `O(n)`:
```text
O(n + n) = O(n)
```

### Nested loops
```java
for (...) {
    for (...) { }
}
```
If both execute N times:
```text
O(n²)
```

### Halving
```java
while (n > 1) {
    n /= 2;
}
```
Number of iterations is about `log2(n)`.

---

## 4. Early Exit Changes Practical Work

```java
for (int i = 0; i < n; i++) {
    if (condition) {
        break;
    }
}
```

Worst case may still be `O(n)`, but best case can be `O(1)`.

Teach students to distinguish:
- best case
- worst case
- average case when meaningful

---

## 5. Nested Loop Does Not Automatically Mean O(n²)

Example:
```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= 10; j++) {
        // constant 10 work
    }
}
```
This is `O(10n)` → `O(n)`.

Another:
```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        // work
    }
}
```
Total work:
```text
1 + 2 + ... + n = O(n²)
```

---

## 6. Digit Loop Complexity

For a decimal integer with `d` digits:
```java
while (n > 0) {
    n /= 10;
}
```
runs `d` times.

For a normal fixed-width integer, this is effectively bounded by a constant, but in algorithmic problems it is clearer to say `O(d)`.

---

## 7. Prime Check as Optimization

Naive:
```java
for (int i = 2; i < n; i++)
```
→ `O(n)`

Better:
```java
for (int i = 2; i <= n / i; i++)
```
→ `O(sqrt(n))`

Trainer question:
> "If n = 1,000,000, do we really need to test every number below n?"

---

## 8. Pattern Problems Are Nested-Loop Reasoning

Do not teach patterns as memorized templates.

For:
```text
*
* *
* * *
* * * *
```

Ask:
- How many rows?
- For row 1, how many stars?
- For row 2?
- General row r?
- What does the inner loop condition become?

This converts visual output into an algorithm.

---

## 9. break/continue and Control Flow

A useful mental model:
```text
continue → jump to next iteration
break    → jump outside the loop
```

In nested loops, `break` exits only the **nearest** loop.

---

## 10. Trainer Extension

Take:
```java
for (int i = 1; i <= n; i++) {
    if (i % 7 == 0) {
        break;
    }
}
```

Ask:
1. Worst-case number of iterations?
2. Best-case?
3. What if N < 7?
4. What if we remove break?
5. Can we directly jump to 7?

This builds algorithmic thinking rather than syntax memory.
