# Day 6 Classroom Examples

## Example 1 — Print 1 to N
Input:
```text
5
```
Output:
```text
1 2 3 4 5
```
Ask:
- Why `i <= n`?
- What happens for `n = 0`?

---

## Example 2 — Print N to 1
Input:
```text
5
```
Output:
```text
5 4 3 2 1
```
Focus: initialization and update direction.

---

## Example 3 — Sum 1 to N
For `n = 5`:
```text
sum = 0
1 → 1
2 → 3
3 → 6
4 → 10
5 → 15
```
Ask students to explain the invariant.

---

## Example 4 — Count Even Numbers
Count even values from 1 to N.

```java
int count = 0;
for (int i = 1; i <= n; i++) {
    if (i % 2 == 0) {
        count++;
    }
}
```

---

## Example 5 — Multiplication Table
For `n = 7`, print `7 × 1` through `7 × 10`.

Ask:
- Which variable changes?
- Exactly how many iterations?

---

## Example 6 — Factorial
For `n = 5`, answer `120`.

Ask:
- Why does `fact` start at `1`?
- What happens for `n = 0`?

---

## Example 7 — Reverse a Number
Input:
```text
5724
```
Output:
```text
4275
```

Dry-run table:
```text
number  digit  reverse
5724      4       4
572       2       42
57        7       427
5         5       4275
0         -       4275
```

---

## Example 8 — Sum of Digits
Input:
```text
5724
```
Output:
```text
18
```

Core pattern:
```java
digit = n % 10;
sum += digit;
n /= 10;
```

---

## Example 9 — Count Digits
For positive `5724`, answer `4`.

Edge case:
```text
0
```
Decide from the problem statement whether it counts as one digit.

---

## Example 10 — Prime Check
Input:
```text
29
```
Output:
```text
Prime
```

Input:
```text
21
```
Output:
```text
Not Prime
```

Teach why checking up to `sqrt(n)` is enough.

---

## Example 11 — Nested Loop Rectangle
Rows = 3, columns = 4:
```text
* * * *
* * * *
* * * *
```

Ask:
- Outer loop controls what?
- Inner loop controls what?
- How many stars?

---

## Example 12 — Increasing Triangle
```text
*
* *
* * *
* * * *
```

Key observation:
For row `r`, print `r` stars.

---

## Example 13 — break
Find the first number divisible by 7 from 1 to 100.

Once found, stop.

```java
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println(i);
        break;
    }
}
```

---

## Example 14 — continue
Print 1 to 10 but skip multiples of 3.

Ask students to predict output before execution.

---

## Example 15 — Halving Loop
```java
int n = 64;
while (n > 1) {
    n /= 2;
}
```
Values:
```text
64 → 32 → 16 → 8 → 4 → 2 → 1
```
Complexity: `O(log n)`.
