# Day 6 Loop Problem-Solving Template

## Step 1 — Understand the Task
What exactly has to repeat?

## Step 2 — Identify the State
What variable(s) change after every iteration?

Examples:
- counter `i`
- remaining number `n`
- running sum
- current maximum
- answer found/not found

## Step 3 — Choose the Loop
- Known range/count → `for`
- Condition-driven → `while`
- Must execute once → `do-while`

## Step 4 — Define Initialization
Where does the state start?

## Step 5 — Define Condition
When should the loop continue?

## Step 6 — Define Update
How does the state move toward termination?

## Step 7 — Define the Body
What work happens in one iteration?

## Step 8 — Dry Run
Create a small table:
```text
iteration | state | condition | action | new state
```

## Step 9 — Boundary Testing
Test:
- `0`
- `1`
- smallest valid input
- smallest invalid input
- typical input
- largest practical input

For range loops, explicitly check whether the endpoint is included.

## Step 10 — Control Flow
Ask whether `break` or `continue` is needed.

## Step 11 — Complexity
Count body executions.

## Step 12 — Final Check
```text
Correct?
Terminates?
No off-by-one?
No overflow?
All edge cases?
Complexity justified?
```
