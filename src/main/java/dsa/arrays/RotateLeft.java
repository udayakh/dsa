package dsa.arrays;

/*
 * PROBLEM: Left Rotate an Array by One
 * --------------------------------------
 * Given an integer array, rotate it left by one position.
 * The first element moves to the last position.
 *
 * EXAMPLES:
 *   rotateLeft([1, 2, 3, 4, 5]) → [2, 3, 4, 5, 1]
 *   rotateLeft([10, 20, 30])    → [20, 30, 10]
 *   rotateLeft([7])             → [7]
 *
 * CONSTRAINTS:
 *   - Modify the array in-place
 *   - Array has at least one element
 */
public class RotateLeft {

    // APPROACH 1 — Brute Force
    // Save first element, shift all elements left by one, place saved element at end.
    // Time: O(n)  |  Space: O(1)
    public static void rotateLeftBrute(int[] arr) {
        int firstElement= arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }

    // APPROACH 2 — Optimized
    // Same approach but cleaner — single pass with minimal operations.
    // Time: O(n)  |  Space: O(1)
    public static void rotateLeftOptimized(int[] arr) {
        int firstElement= arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        int[] a1 = {1, 2, 3, 4, 5};
        rotateLeftBrute(a1);
        System.out.println(java.util.Arrays.toString(a1)); // [2, 3, 4, 5, 1]

        int[] a2 = {10, 20, 30};
        rotateLeftBrute(a2);
        System.out.println(java.util.Arrays.toString(a2)); // [20, 30, 10]

        int[] a3 = {7};
        rotateLeftBrute(a3);
        System.out.println(java.util.Arrays.toString(a3)); // [7]

        System.out.println("--- Optimized ---");
        int[] b1 = {1, 2, 3, 4, 5};
        rotateLeftOptimized(b1);
        System.out.println(java.util.Arrays.toString(b1)); // [2, 3, 4, 5, 1]

        int[] b2 = {10, 20, 30};
        rotateLeftOptimized(b2);
        System.out.println(java.util.Arrays.toString(b2)); // [20, 30, 10]

        int[] b3 = {7};
        rotateLeftOptimized(b3);
        System.out.println(java.util.Arrays.toString(b3)); // [7]
    }
}