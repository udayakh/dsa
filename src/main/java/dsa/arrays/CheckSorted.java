package dsa.arrays;

/*
 * PROBLEM: Check if Array is Sorted
 * -----------------------------------
 * Given an integer array, return true if it is sorted in
 * non-decreasing order, false otherwise.
 *
 * EXAMPLES:
 *   isSorted([1, 2, 3, 4, 5]) → true
 *   isSorted([1, 1, 2, 3])    → true   (equal elements are allowed)
 *   isSorted([5, 3, 4])       → false
 *   isSorted([7])             → true   (single element is always sorted)
 *
 * CONSTRAINTS:
 *   - Array has at least one element
 *   - Elements can be negative
 */
public class CheckSorted {

    // APPROACH 1 — Brute Force
    // For every pair (i, j) where i < j, check if arr[i] > arr[j].
    // If any such pair exists, the array is not sorted.
    // Time: O(n²)  |  Space: O(1)
    public static boolean isSortedBrute(int[] arr) {
        // TODO
        return false;
    }

    // APPROACH 2 — Optimized
    // Single pass: check each adjacent pair. If any element is greater
    // than the next one, it's not sorted.
    // Time: O(n)  |  Space: O(1)
    public static boolean isSortedOptimized(int[] arr) {
        // TODO
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        System.out.println(isSortedBrute(new int[]{1, 2, 3, 4, 5})); // true
        System.out.println(isSortedBrute(new int[]{1, 1, 2, 3}));    // true
        System.out.println(isSortedBrute(new int[]{5, 3, 4}));       // false
        System.out.println(isSortedBrute(new int[]{7}));              // true

        System.out.println("--- Optimized ---");
        System.out.println(isSortedOptimized(new int[]{1, 2, 3, 4, 5})); // true
        System.out.println(isSortedOptimized(new int[]{1, 1, 2, 3}));    // true
        System.out.println(isSortedOptimized(new int[]{5, 3, 4}));       // false
        System.out.println(isSortedOptimized(new int[]{7}));              // true
    }
}
