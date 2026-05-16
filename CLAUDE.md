# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

```bash
# Compile
mvn compile

# Run a specific problem's main method
mvn exec:java -Dexec.mainClass="dsa.arrays.LinearSearch"

# Run tests
mvn test
```

Java 17, Maven. No test files exist yet — JUnit Jupiter is on the classpath if needed.

## Structure

Each problem lives in a single file under `src/main/java/dsa/<topic>/`. Every file has:
- A `// APPROACH 1 — Brute Force` method (higher complexity, educational)
- A `// APPROACH 2 — Optimized` method (best practical solution)
- A `main()` with inline test cases and expected output comments

Problems are intentionally left as `// TODO` skeletons for the student to implement.

## Teaching Context

This is a guided DSA learning project. The student is an intermediate Java developer with no prior DSA background. See `PROGRESS.md` for session notes and `progress.md` (git-tracked) for the full tracker.

When creating new problem files, follow the existing skeleton pattern — two approaches with complexity comments, `main()` test cases, and `// TODO` stubs. Do not implement solutions for the student.

## Learning Path

Introduction → Mathematics → Bit Magic → Recursion → **Arrays** → Searching → Sorting → Matrix → Hashing → Strings → Linked List → Stack → Queue → Deque → Tree → Backtracking → Binary Search Tree → Heap → Graph → Greedy → Dynamic Programming → Trie → Disjoint Set
