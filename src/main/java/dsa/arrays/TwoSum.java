package dsa.arrays;

import java.util.*;

/*
 * PROBLEM: Two Sum
 * -----------------
 * Given an integer array and a target value, return the indices
 * of the two numbers that add up to the target.
 * Assume exactly one solution exists. Do not use the same element twice.
 *
 * EXAMPLES:
 *   twoSum([2, 7, 11, 15], 9)  → [0, 1]  (2 + 7 = 9)
 *   twoSum([3, 2, 4], 6)       → [1, 2]  (2 + 4 = 6)
 *   twoSum([3, 3], 6)          → [0, 1]  (3 + 3 = 6)
 *
 * CONSTRAINTS:
 *   - Exactly one valid answer exists
 *   - You may not use the same element twice (i != j)
 */
public class TwoSum {

    // APPROACH 1 — Brute Force
    // Check every pair (i, j) where i < j. Return indices when sum equals target.
    // Time: O(n²)  |  Space: O(1)
    public static int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    // APPROACH 2 — Optimized (HashMap)
    // Store each element and its index. For each element, check if
    // (target - element) already exists in the map.
    // Time: O(n)  |  Space: O(n)
    public static int[] twoSumOptimized(int[] arr, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        System.out.println(java.util.Arrays.toString(twoSumBrute(new int[]{2, 7, 11, 15}, 9)));  // [0, 1]
        System.out.println(java.util.Arrays.toString(twoSumBrute(new int[]{3, 2, 4}, 6)));       // [1, 2]
        System.out.println(java.util.Arrays.toString(twoSumBrute(new int[]{3, 3}, 6)));          // [0, 1]

        System.out.println("--- Optimized ---");
        System.out.println(java.util.Arrays.toString(twoSumOptimized(new int[]{2, 7, 11, 15}, 9)));  // [0, 1]
        System.out.println(java.util.Arrays.toString(twoSumOptimized(new int[]{3, 2, 4}, 6)));       // [1, 2]
        System.out.println(java.util.Arrays.toString(twoSumOptimized(new int[]{3, 3}, 6)));          // [0, 1]
    }
}
