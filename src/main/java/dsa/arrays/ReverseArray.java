package dsa.arrays;

/*
 * PROBLEM: Reverse an Array
 * --------------------------
 * Given an integer array, return it in reversed order.
 *
 * EXAMPLES:
 *   reverse([1, 2, 3, 4, 5]) → [5, 4, 3, 2, 1]
 *   reverse([10, 20, 30])    → [30, 20, 10]
 *   reverse([7])             → [7]
 *   reverse([1, 2])          → [2, 1]
 *
 * CONSTRAINTS:
 *   - Array has at least one element
 *   - Modify the original array in-place (do not return a new array)
 */
public class ReverseArray {

    // Copy elements into a temporary array in reverse order, then copy back.
    // Time: O(n) | Space: O(n)
    public static void reverseBrute(int[] arr) {
        // TODO
        int n = arr.length;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    // APPROACH 2 — Optimized (Two Pointers)
    // Use a left and right pointer, swap elements, move pointers inward.
    // Time: O(n) | Space: O(1)
    public static void reverseOptimized(int[] arr) {
        // TODO
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        int[] a1 = { 1, 2, 3, 4, 5 };
        reverseBrute(a1);
        System.out.println(java.util.Arrays.toString(a1)); // Expected: [5, 4, 3, 2, 1]

        int[] a2 = { 10, 20, 30 };
        reverseBrute(a2);
        System.out.println(java.util.Arrays.toString(a2)); // Expected: [30, 20, 10]

        int[] a3 = { 7 };
        reverseBrute(a3);
        System.out.println(java.util.Arrays.toString(a3)); // Expected: [7]

        System.out.println("--- Optimized ---");
        int[] b1 = { 1, 2, 3, 4, 5 };
        reverseOptimized(b1);
        System.out.println(java.util.Arrays.toString(b1)); // Expected: [5, 4, 3, 2, 1]

        int[] b2 = { 10, 20, 30 };
        reverseOptimized(b2);
        System.out.println(java.util.Arrays.toString(b2)); // Expected: [30, 20, 10]

        int[] b3 = { 7 };
        reverseOptimized(b3);
        System.out.println(java.util.Arrays.toString(b3)); // Expected: [7]
    }
}
