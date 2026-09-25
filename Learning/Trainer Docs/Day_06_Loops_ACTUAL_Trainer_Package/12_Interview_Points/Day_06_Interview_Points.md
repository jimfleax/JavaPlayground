# Day 6 Interview Points

## Core Questions

1. Difference between `for` and `while`.
2. Difference between `while` and `do-while`.
3. When would you choose `do-while`?
4. What does `break` do?
5. What does `continue` do?
6. What causes an infinite loop?
7. What is an off-by-one error?
8. How do you calculate loop complexity?
9. Complexity of nested loops?
10. Complexity of a halving loop?
11. Why is digit extraction commonly done with `% 10`?
12. Why does `n /= 10` remove the last digit?
13. Why is prime checking possible up to `sqrt(n)`?
14. What happens to `continue` in a `for` loop?
15. Can `break` exit multiple nested loops? What alternatives exist?

## Strong Answers

### for vs while
Use `for` when initialization, condition and update form a clear counter/range. Use `while` when the stopping condition is the main idea and the number of iterations may not be known beforehand.

### do-while
A `do-while` executes its body before checking the condition, so the body executes at least once.

### Complexity
Count how many times the body executes. A loop from 1 to N is usually `O(n)`. Two nested N-sized loops are `O(n²)`. Repeatedly halving a value is `O(log n)`.

### break vs continue
`break` terminates the nearest loop. `continue` skips the remaining statements of the current iteration and proceeds to the next iteration.

### Infinite loop
A loop can become infinite if its state never changes toward making the condition false, or if the condition can never become false.

## Interview Follow-ups
- What if N = 0?
- What if N is very large?
- What if integer overflow occurs?
- Can you reduce the number of iterations?
- Can you stop early?
