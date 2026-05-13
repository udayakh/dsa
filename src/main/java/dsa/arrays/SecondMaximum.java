package dsa.arrays;

/*
 * PROBLEM: Find Second Maximum
 * -----------------------------
 * Given an integer array, return the second largest element.
 * If no second maximum exists, return -1.
 *
 * EXAMPLES:
 *   secondMax([3, 1, 4, 1, 5, 9]) → 5
 *   secondMax([7, 2, 8, 4])       → 7
 *   secondMax([1, 1, 1])          → -1  (all elements same, no second max)
 *   secondMax([42])               → -1  (only one element)
 *
 * CONSTRAINTS:
 *   - Array has at least one element
 *   - Elements can be negative
 *   - Duplicates are allowed; second max must be strictly less than max
 */
public class SecondMaximum {

    // APPROACH 1 — Brute Force
    // Sort the array, then scan from the end for the first element
    // strictly less than the maximum.
    // Time: O(n log n)  |  Space: O(1)
    public static int secondMaxBrute(int[] arr) {
        // TODO
        return -1;
    }

    // APPROACH 2 — Optimized
    // Single pass: track both max and secondMax.
    // Time: O(n)  |  Space: O(1)
    public static int secondMaxOptimized(int[] arr) {
        // TODO
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        System.out.println(secondMaxBrute(new int[]{3, 1, 4, 1, 5, 9})); // 5
        System.out.println(secondMaxBrute(new int[]{7, 2, 8, 4}));       // 7
        System.out.println(secondMaxBrute(new int[]{1, 1, 1}));          // -1
        System.out.println(secondMaxBrute(new int[]{42}));               // -1

        System.out.println("--- Optimized ---");
        System.out.println(secondMaxOptimized(new int[]{3, 1, 4, 1, 5, 9})); // 5
        System.out.println(secondMaxOptimized(new int[]{7, 2, 8, 4}));       // 7
        System.out.println(secondMaxOptimized(new int[]{1, 1, 1}));          // -1
        System.out.println(secondMaxOptimized(new int[]{42}));               // -1
    }
}
