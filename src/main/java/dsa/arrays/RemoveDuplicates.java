package dsa.arrays;

/*
 * PROBLEM: Remove Duplicates from Sorted Array
 * ---------------------------------------------
 * Given a sorted integer array, remove duplicates in-place so each
 * element appears only once. Return the new length.
 *
 * EXAMPLES:
 *   removeDuplicates([1, 1, 2])          → 2  (array becomes [1, 2, ...])
 *   removeDuplicates([0, 0, 1, 1, 1, 2]) → 3  (array becomes [0, 1, 2, ...])
 *   removeDuplicates([1, 2, 3])          → 3  (no duplicates)
 *   removeDuplicates([1, 1, 1])          → 1  (array becomes [1, ...])
 *
 * CONSTRAINTS:
 *   - Array is sorted in non-decreasing order
 *   - Modify the array in-place
 *   - Return the count of unique elements
 */
public class RemoveDuplicates {

    // APPROACH 1 — Brute Force
    // Use a temp array to collect unique elements, copy back.
    // Time: O(n)  |  Space: O(n)
    public static int removeDuplicatesBrute(int[] arr) {
        int j=0;
        int temp[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[i+1]){
                temp[i]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        return j;
    }

    // APPROACH 2 — Optimized (Two Pointers)
    // Use a slow pointer j for the last unique position.
    // Time: O(n)  |  Space: O(1)
    public static int removeDuplicatesOptimized(int[] arr) {
            int j=0;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]!=arr[j]){
                    arr[j+1]=arr[i];
                    j++;
                }
            }
        return j+1;
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        int[] a1 = {1, 1, 2};
        System.out.println(removeDuplicatesBrute(a1)); // 2

        int[] a2 = {0, 0, 1, 1, 1, 2};
        System.out.println(removeDuplicatesBrute(a2)); // 3

        int[] a3 = {1, 2, 3};
        System.out.println(removeDuplicatesBrute(a3)); // 3

        System.out.println("--- Optimized ---");
        int[] b1 = {1, 1, 2};
        System.out.println(removeDuplicatesOptimized(b1)); // 2

        int[] b2 = {0, 0, 1, 1, 1, 2};
        System.out.println(removeDuplicatesOptimized(b2)); // 3

        int[] b3 = {1, 2, 3};
        System.out.println(removeDuplicatesOptimized(b3)); // 3
    }
}