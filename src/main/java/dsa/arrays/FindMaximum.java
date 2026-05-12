package dsa.arrays;

/*
 * PROBLEM: Find Maximum Element
 * ------------------------------
 * Given an integer array, return the largest element.
 *
 * EXAMPLES:
 *   findMax([3, 1, 4, 1, 5, 9]) → 9
 *   findMax([7, 2, 8, 4])       → 8
 *   findMax([-3, -1, -4])       → -1
 *   findMax([42])               → 42
 *
 * CONSTRAINTS:
 *   - Array has at least one element
 *   - Elements can be negative
 */
public class FindMaximum {

    // APPROACH 1 — Brute Force
    // Compare every element against every other element.
    // If no element is greater than arr[i], then arr[i] is the max.
    // Time: O(n²)  |  Space: O(1)
    public static int findMaxBrute(int[] arr) {
        // TODO
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                max=arr[j];
                }
            }
        }

        return max;
    }

    // APPROACH 2 — Optimized
    // Single pass: assume first element is max, update whenever you find something larger.
    // Time: O(n)  |  Space: O(1)
    public static int findMaxOptimized(int[] arr) {
        // TODO
        int max=arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (max<arr[index]) {
                max=arr[index];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] test1 = {3, 1, 4, 1, 5, 9};
        int[] test2 = {7, 2, 8, 4};
        int[] test3 = {-3, -1, -4};
        int[] test4 = {42};

        System.out.println("--- Brute Force ---");
        System.out.println(findMaxBrute(test1));  // Expected: 9
        System.out.println(findMaxBrute(test2));  // Expected: 8
        System.out.println(findMaxBrute(test3));  // Expected: -1
        System.out.println(findMaxBrute(test4));  // Expected: 42

        System.out.println("--- Optimized ---");
        System.out.println(findMaxOptimized(test1));  // Expected: 9
        System.out.println(findMaxOptimized(test2));  // Expected: 8
        System.out.println(findMaxOptimized(test3));  // Expected: -1
        System.out.println(findMaxOptimized(test4));  // Expected: 42
    }
}
