package dsa.arrays;

import java.util.Arrays;

/*
 * PROBLEM: Left Rotate an Array by K Positions
 * ----------------------------------------------
 * Given an integer array and a number k, rotate the array
 * left by k positions.
 *
 * EXAMPLES:
 *   rotateByK([1, 2, 3, 4, 5], 2) → [3, 4, 5, 1, 2]
 *   rotateByK([1, 2, 3, 4, 5], 1) → [2, 3, 4, 5, 1]
 *   rotateByK([1, 2, 3, 4, 5], 5) → [1, 2, 3, 4, 5]  (full rotation)
 *
 * CONSTRAINTS:
 *   - Modify the array in-place
 *   - 0 <= k <= arr.length
 */
public class RotateLeftByK {

    // APPROACH 1 — Brute Force
    // Save first k elements, shift remaining left by k, place saved at end.
    // Time: O(n) | Space: O(k)
    public static void rotateByKBrute(int[] arr, int k) {
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        int j = k;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[j];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[arr.length - (k-i)] = temp[i];
        }
    }

    // APPROACH 2 — Optimized (Reversal Algorithm)
    // Reverse first k elements, reverse remaining, then reverse whole array.
    // Time: O(n) | Space: O(1)
    public static void rotateByKOptimized(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            arr[i]=arr[i+1];
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        int[] a1 = { 1, 2, 3, 4, 5 };
        rotateByKBrute(a1, 2);
        System.out.println(java.util.Arrays.toString(a1)); // [3, 4, 5, 1, 2]

        int[] a2 = { 1, 2, 3, 4, 5 };
        rotateByKBrute(a2, 1);
        System.out.println(java.util.Arrays.toString(a2)); // [2, 3, 4, 5, 1]

        int[] a3 = { 1, 2, 3, 4, 5 };
        rotateByKBrute(a3, 5);
        System.out.println(java.util.Arrays.toString(a3)); // [1, 2, 3, 4, 5]

        System.out.println("--- Optimized ---");
        int[] b1 = { 1, 2, 3, 4, 5 };
        rotateByKOptimized(b1, 2);
        System.out.println(java.util.Arrays.toString(b1)); // [3, 4, 5, 1, 2]

        int[] b2 = { 1, 2, 3, 4, 5 };
        rotateByKOptimized(b2, 1);
        System.out.println(java.util.Arrays.toString(b2)); // [2, 3, 4, 5, 1]

        int[] b3 = { 1, 2, 3, 4, 5 };
        rotateByKOptimized(b3, 5);
        System.out.println(java.util.Arrays.toString(b3)); // [1, 2, 3, 4, 5]
    }
}