# Advanced Trainer Thinking

## 1. Abstraction
A caller should care about **what** a method does, not every internal step.

## 2. Method Contract
Think in:
```text
Input constraints → Output guarantee → Side effects → Complexity
```
Example `isPrime(n)`:
- Input: integer
- Output: boolean
- Side effect: none
- Complexity: O(sqrt(n))

## 3. Decomposition
A difficult DSA problem can be split into helpers:
```text
main
 ├── readInput
 ├── validate
 ├── solve
 │    ├── helper1
 │    └── helper2
 └── printResult
```

## 4. Return vs Side Effect
A method that returns a value is easier to compose:
```java
if (isPrime(n) && isOdd(n)) { ... }
```

## 5. Recursion Preview
A recursive function is still a method call; it calls itself with a smaller/subproblem input. Today establish method-call thinking without teaching full recursion.

## 6. Complexity Belongs to the Method
`isPrime` with trial division to sqrt(n): O(sqrt(n)). `sumDigits`: O(number of digits).

## Trainer Question
“अगर इस logic को कल 5 अलग जगह use करना पड़े, क्या आपका code आसानी से reuse होगा?”
