# Day 6 — One-Page Student Recap

## Loop Mental Model
```text
Initialize
   ↓
Check condition
   ↓
Run body
   ↓
Update
   ↺
```

## for
```java
for (initialization; condition; update) {
    // body
}
```

Use when the iteration/range is clear.

## while
```java
while (condition) {
    // body
}
```

Use when repetition depends mainly on a condition.

## do-while
```java
do {
    // body
} while (condition);
```

Runs at least once.

## break vs continue
- `break` → exit loop
- `continue` → skip current iteration

## Common Patterns

### Sum
```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

### Digit
```java
int digit = n % 10;
n /= 10;
```

### Reverse
```java
reverse = reverse * 10 + digit;
```

## Complexity
- One loop to N → `O(n)`
- Nested N×N → `O(n²)`
- Repeated halving → `O(log n)`

## Common Bugs
- `i < n` vs `i <= n`
- forgetting update
- wrong update direction
- accidental `;`
- overflow
- mishandling `n = 0`

## Exit Criteria
You can:
1. choose the right loop,
2. dry-run it,
3. explain termination,
4. use break/continue,
5. handle boundaries,
6. state time/space complexity.
