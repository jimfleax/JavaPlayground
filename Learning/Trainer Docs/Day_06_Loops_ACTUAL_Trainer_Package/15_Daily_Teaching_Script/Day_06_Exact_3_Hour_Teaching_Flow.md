# Day 6 — Exact 3-Hour Teaching Flow

## 10:00–10:10 — Day 5 Revision
Ask 5 quick questions:
1. What is `&&`?
2. What is `||`?
3. What is the difference between `=` and `==`?
4. When would you use switch?
5. Give boundary values for `x >= 10`.

Do not spend more than 10 minutes here.

---

## 10:10–10:25 — Why Loops?

Start without code.

Ask:
> "अगर 1 से 1000 तक print करना हो, तो क्या हम 1000 print statements लिखेंगे?"

Students propose repetition.

Build:
```text
Repeated task
 ↓
Changing value
 ↓
Stopping condition
```

Then introduce the loop mental model.

---

## 10:25–10:45 — for Loop

Teach:
- initialization
- condition
- body
- update

Code:
```java
for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
```

Before running, ask:
- first value?
- last value?
- number of iterations?
- what happens after i = 5?

Then show `i < 5` and compare.

---

## 10:45–11:05 — while Loop

Start with:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Then deliberately remove `i++`.

Ask:
> "Why is this an infinite loop?"

Make students explain termination.

---

## 11:05–11:20 — do-while

Use:
```java
int i = 10;

do {
    System.out.println("Executed");
    i++;
} while (i <= 5);
```

Ask for prediction.

Board:
```text
while     → condition first
do-while  → body first
```

---

## 11:20–11:30 — break vs continue

First:
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.print(i + " ");
}
```

Then replace `continue` with `break`.

Ask students to predict both outputs.

---

## 11:30–11:40 — Break

---

## 11:40–12:00 — Guided Problem 1: Sum 1 to N

Problem:
> Input N, calculate 1 + 2 + ... + N.

Process:
```text
Understand
→ state = sum
→ initialize sum = 0
→ loop 1..N
→ update sum += i
→ dry run
→ complexity
```

For N = 5:
```text
0 → 1 → 3 → 6 → 10 → 15
```

Ask for edge case N = 0.

---

## 12:00–12:20 — Guided Problem 2: Reverse Number

Input:
```text
5724
```

Expected:
```text
4275
```

Build from observations:
```text
last digit = n % 10
remove last digit = n / 10
```

Dry run:
```text
5724 → digit 4
572  → digit 2
57   → digit 7
5    → digit 5
```

Then construct:
```java
reverse = reverse * 10 + digit;
```

---

## 12:20–12:35 — Guided Problem 3: Prime Check

First show naive:
```java
for (int i = 2; i < n; i++)
```

Ask:
> "क्या हमें n-1 तक check करना जरूरी है?"

Introduce factor-pair observation and `sqrt(n)`.

Use:
```java
for (int i = 2; i <= n / i; i++)
```

Discuss `n < 2`.

---

## 12:35–12:50 — Nested Loops + Patterns

Build:
```text
*
* *
* * *
* * * *
```

Do not paste a pattern template.

Ask:
- number of rows?
- stars in row r?
- outer loop?
- inner loop?

Then show 3×4 rectangle and discuss `O(nm)`.

---

## 12:50–12:56 — Bug Hunt

Use `Day06BuggyCode.java`.

Target bugs:
1. `< n` vs `<= n`
2. missing update
3. accidental semicolon
4. control-flow understanding

Students must identify before fixing.

---

## 12:56–12:59 — CP Challenge

Give:
> Find the first number from 1 to N divisible by 7 but not by 5.

Requirement:
- use `break`
- explain best/worst case

---

## 12:59–1:00 — Exit Questions

Every student answers:
1. `for` vs `while`?
2. Why does do-while execute once?
3. `break` vs `continue`?
4. How do you prevent an infinite loop?
5. Complexity of nested N×N loops?

## Success Criterion
A student should be able to take a simple repetition problem, identify the changing state, write initialization/condition/update, dry-run it, debug it, and justify its complexity.
