# Day 6 Solution Manual

## 1. Sum 1 to N
```java
long sum = 0;

for (int i = 1; i <= n; i++) {
    sum += i;
}
```
Time: `O(n)`  
Extra space: `O(1)`

---

## 2. Factorial
```java
long fact = 1;

for (int i = 1; i <= n; i++) {
    fact *= i;
}
```
Time: `O(n)`  
Extra space: `O(1)`

For production/large constraints, discuss overflow and `BigInteger`.

---

## 3. Reverse Number
For non-negative integer `n`:
```java
int reverse = 0;

while (n > 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n /= 10;
}
```

Important edge case: if `n == 0`, decide the expected representation from the problem.

---

## 4. Sum of Digits
```java
int sum = 0;

while (n > 0) {
    sum += n % 10;
    n /= 10;
}
```

---

## 5. Palindrome Number
```java
int original = n;
int reverse = 0;

while (n > 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n /= 10;
}

if (reverse == original) {
    System.out.println("Palindrome");
} else {
    System.out.println("Not Palindrome");
}
```

---

## 6. Prime Check
```java
boolean prime = n >= 2;

for (int i = 2; i <= n / i && prime; i++) {
    if (n % i == 0) {
        prime = false;
    }
}

System.out.println(prime ? "Prime" : "Not Prime");
```

Why stop at `sqrt(n)`?
If `n = a × b`, at least one factor is `<= sqrt(n)`.

Time: `O(sqrt(n))`.

---

## 7. Pattern
```java
for (int row = 1; row <= rows; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Total prints:
`1 + 2 + ... + rows` → `O(rows²)`.

---

## 8. break
```java
for (int i = 1; i <= 100; i++) {
    if (i % 17 == 0) {
        System.out.println(i);
        break;
    }
}
```
First matching value is `17`.

---

## 9. continue
```java
for (int i = 1; i <= 20; i++) {
    if (i % 3 == 0) {
        continue;
    }
    System.out.print(i + " ");
}
```
Multiples of 3 are skipped.

---

## 10. GCD — Euclidean Algorithm
```java
while (b != 0) {
    int temp = a % b;
    a = b;
    b = temp;
}

System.out.println("GCD = " + a);
```

Complexity: `O(log(min(a,b)))`.

---

## 11. LCM
After finding GCD:
```java
long lcm = ((long) originalA / gcd) * originalB;
```
Divide before multiply to reduce overflow risk.

---

## 12. Loop Complexity Rules
Single counter loop:
`O(n)`

Nested `n × n`:
`O(n²)`

Repeated halving:
`O(log n)`

Two consecutive `O(n)` loops:
`O(n)` after simplification.

---

## Trainer Explanation Checklist
Before revealing code, ask:
- What is the state?
- What is the invariant?
- What happens on the first iteration?
- What happens on the last iteration?
- Why does the loop terminate?
- Can the update be skipped?
- What are the boundary cases?
