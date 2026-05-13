# DSA Practice — Java

A structured Data Structures & Algorithms practice project in Java, following a topic-by-topic learning path.

## Project Structure

```
src/main/java/dsa/
└── arrays/
    ├── LinearSearch.java
    ├── FindMaximum.java
    ├── ReverseArray.java
    └── CheckSorted.java
```

## Learning Path

- [x] Arrays
- [ ] Strings
- [ ] Linked Lists
- [ ] Stacks & Queues
- [ ] Trees
- [ ] Graphs
- [ ] Dynamic Programming

## Problems Solved

### Arrays
| Problem | Brute Force | Optimized |
|---|---|---|
| Linear Search | O(n) time, O(1) space | O(n) worst / O(1) best, early exit |
| Find Maximum | O(n²) nested loop | O(n) single pass |
| Reverse Array | O(n) time, O(n) space | O(n) time, O(1) space — two pointers |
| Check Sorted | O(n²) all pairs | O(n) adjacent pairs |

## How to Run

Requires Java 11+ and Maven.

```bash
mvn compile
mvn exec:java -Dexec.mainClass="dsa.arrays.LinearSearch"
```

Replace `LinearSearch` with any class name to run that problem.
