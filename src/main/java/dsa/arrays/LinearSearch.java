package dsa.arrays;

import java.util.Arrays;
import java.util.Optional;

/*
 * PROBLEM: Linear Search
 * -----------------------
 * Given an integer array and a target value, return the index
 * of the target if found, or -1 if it does not exist.
 *
 * EXAMPLES:
 *   search([10, 20, 30, 40], 30) → 2
 *   search([5, 3, 8, 1], 8)      → 2
 *   search([1, 2, 3], 99)        → -1
 *   search([7], 7)               → 0
 *
 * CONSTRAINTS:
 *   - Array can have any order (unsorted)
 *   - Return the first index if duplicates exist
 */
public class LinearSearch {

    // APPROACH 1 — Brute Force
    // Check every single element, store result in a variable, return at the end.
    // Does NOT stop early when the target is found.
    // Time: O(n) | Space: O(1)
    public static int searchBrute(int[] arr, int target) {
        // TODO
        int result=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                result=i;
            }
        }
        return result;
    }

    // APPROACH 2 — Optimized
    // Return immediately as soon as the target is found (early exit).
    // Best case becomes O(1) when target is at index 0.
    // Time: O(n) worst case, O(1) best case | Space: O(1)
    public static int searchOptimized(int[] arr, int target) {
        // TODO
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // store it, but keep going
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        System.out.println(searchBrute(new int[] { 10, 20, 30, 40 }, 30)); // Expected: 2
        System.out.println(searchBrute(new int[] { 5, 3, 8, 1 }, 8)); // Expected: 2
        System.out.println(searchBrute(new int[] { 1, 2, 3 }, 99)); // Expected: -1
        System.out.println(searchBrute(new int[] { 7 }, 7)); // Expected: 0

        System.out.println("--- Optimized ---");
        System.out.println(searchOptimized(new int[] { 10, 20, 30, 40 }, 30)); // Expected: 2
        System.out.println(searchOptimized(new int[] { 5, 3, 8, 1 }, 8)); // Expected: 2
        System.out.println(searchOptimized(new int[] { 1, 2, 3 }, 99)); // Expected: -1
        System.out.println(searchOptimized(new int[] { 7 }, 7)); // Expected: 0
    }
}