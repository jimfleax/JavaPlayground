# Day 6 CP Challenge — First Divisible / Digit + Constraint

## Challenge 1 — First Valid Number

Given `N`, find the smallest number from `1` to `N` that is:
- divisible by 7
- not divisible by 5

If no such number exists, print `-1`.

### Example
Input:
```text
20
```

Output:
```text
7
```

### Rules
- Use a loop.
- Stop as soon as the answer is found.
- Use `break`.
- Explain best-case and worst-case complexity.

---

## Challenge 2 — Digit Score

Given a positive integer `N`, calculate:

```text
score = sum of even digits - sum of odd digits
```

Example:
```text
N = 5724
even sum = 2 + 4 = 6
odd sum  = 5 + 7 = 12
score = -6
```

### Bonus
Do it in one digit-processing loop.

---

## Challenge 3 — Prime Count

Given `N`, count how many prime numbers exist from `2` to `N`.

### Constraint discussion
If `N` is small, a straightforward approach is acceptable.

If `N` becomes very large, ask:
> "क्या हर number के लिए sqrt तक loop करना अभी भी practical है?"

Do not reveal sieve immediately unless students have reached the limit of today's concepts.

---

## Trainer Goal
The challenge is not just getting the output. Students must:
- identify the repeated work,
- choose a loop,
- define state,
- handle boundaries,
- explain complexity.
