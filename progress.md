# DSA Progress Tracker

> Updated after each session by the teacher.

---

## Problems Solved

### Arrays

| # | Problem | Brute Force | Optimized | Date |
|---|---------|-------------|-----------|------|
| 1 | LinearSearch | ✅ Done | ✅ Done | 2026-05-14 |
| 2 | FindMaximum | ✅ Done | ✅ Done | 2026-05-14 |
| 3 | ReverseArray | ✅ Done | ✅ Done | 2026-05-14 |
| 4 | CheckSorted | ✅ Done | ✅ Done | 2026-05-14 |
| 5 | SecondMaximum | ✅ Done | ✅ Done | 2026-05-15 |

### Strings
_Not started yet_

### Linked List
_Not started yet_

### Stacks & Queues
_Not started yet_

### Trees & BST
_Not started yet_

### Graphs
_Not started yet_

### Dynamic Programming
_Not started yet_

---

## Concepts Learned

- [x] Linear search — brute force vs early exit
- [x] Boolean flag pattern
- [x] Find maximum — O(n²) vs O(n) single pass
- [x] Array reversal — extra array vs two-pointer in-place swap
- [x] Check sorted — nested pairs vs adjacent pairs, `continue` keyword
- [x] Second maximum — single pass tracking two variables, ternary operator for edge case
- [ ] Two Sum
- [ ] Move zeros

---

## Teacher Observations

### 2026-05-14 — Session 1

**Strengths noticed:**
- Fixes code independently after understanding the mistake — doesn't just copy answers
- Boolean flag pattern clicked quickly (LinearSearch) and applied it again in FindMaximum unprompted
- Asks good directional questions before coding ("can I use return?", "how many loops?")
- On own initiative simplified `arr.length - 1` loop condition in CheckSorted — good refactoring instinct

**Areas to improve:**
- Tends to mix two separate steps into one loop — slow down and separate concerns
- Sometimes guesses return values without tracing through logic first — trace before you type
- Swap pattern (`temp = arr[left]`) not yet instinctive — needs more practice

**Overall:**
Healthy learning loop — rough idea → small logical error → corrects after one guiding question.
The gap between making a mistake and correcting it is already shrinking within the session.

---

### 2026-05-15 — Session 2

**Problems completed:** SecondMaximum

#### SecondMaximum
- Initially copied bubble sort from Google — caught and asked to rewrite from scratch
- Rewrote bubble sort independently after tracing through an example — solid improvement
- Optimized approach: correctly identified `secondMax = max` before `max = arr[i]` after reasoning through order of operations
- Struggled with where to place the edge case check (kept putting it inside the loop) — needed guidance to move it after the loop
- Learned/used ternary operator independently for the final return

**Strengths noticed:**
- Willing to admit when they copied — shows honesty and desire to actually learn
- After tracing `[3, 1, 4]` by hand, wrote bubble sort correctly without help
- Ternary operator used confidently without prompting

**Areas to improve:**
- Tendency to add logic inside loops when it belongs outside — pause and ask "does this check need to happen every iteration or just once?"
- Still second-guessing self ("why am I not thinking like you?") — confidence will come with repetition

**Overall:**
Clear improvement from Session 1. Wrote bubble sort from scratch after previously copying it.
Self-awareness is growing — noticing own mistakes faster.
