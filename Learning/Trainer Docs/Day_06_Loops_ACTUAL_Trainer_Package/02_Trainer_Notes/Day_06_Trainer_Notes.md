# Day 6 Trainer Notes

## Main Goal
Students should stop thinking of loops as syntax and start thinking in terms of:

**state → condition → work → update → termination**

## Board Flow
```text
Repeated work
   ↓
What changes every iteration?
   ↓
Initial state
   ↓
Continue condition
   ↓
Body
   ↓
Update
   ↓
Termination
```

## Opening Activity — No Code First
Ask:
> "अगर मुझे 1 से 100 तक print करना हो तो बिना loop के क्या होगा?"

Let students feel the repetition problem.

Then ask:
- What changes? `i`
- Where does it start? `1`
- When do we stop? `i > 100`
- How does it change? `i++`

Only then write the `for` loop.

## Must-Do Demonstrations

### Demo 1 — for anatomy
Write:
```java
for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
```
Ask students to identify:
- initialization
- condition
- body
- update
- number of iterations

### Demo 2 — while infinite-loop bug
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
}
```
Ask: "यह क्यों नहीं रुकता?"

### Demo 3 — do-while difference
Use `i = 10`, condition `i <= 5`.
Ask whether anything prints.

### Demo 4 — break vs continue
Run the same loop twice:
- `continue` at `i == 3`
- `break` at `i == 3`

### Demo 5 — nested loop
Print a 3×4 star rectangle. Ask how many times the inner body runs.

## Questions to Ask Constantly
1. What is the current value of the state variable?
2. Is the condition true or false?
3. What changes after this iteration?
4. Will this loop definitely terminate?
5. How many times will the body execute?
6. What happens at `n = 0`?
7. What happens at `n = 1`?
8. What is the complexity?

## Hint Ladder
**Hint 1:** Identify what repeats.  
**Hint 2:** Identify the state that changes.  
**Hint 3:** Write initialization + condition + update separately.  
**Hint 4:** Dry-run 3 iterations on paper.  
**Final:** Write pseudocode, then code.

## Don't Overteach
Do not spend today's main class on advanced Java streams, iterators, labeled breaks, or complex pattern printing. Keep the focus on loop logic and problem solving.
