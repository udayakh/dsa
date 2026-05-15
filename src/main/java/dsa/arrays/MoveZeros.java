package dsa.arrays;

/*
 * PROBLEM: Move Zeros
 * --------------------
 * Given an integer array, move all zeros to the end while
 * maintaining the relative order of non-zero elements.
 * Do it in-place.
 *
 * EXAMPLES:
 *   moveZeros([0, 1, 0, 3, 12]) → [1, 3, 12, 0, 0]
 *   moveZeros([0, 0, 1])        → [1, 0, 0]
 *   moveZeros([1, 2, 3])        → [1, 2, 3]  (no zeros)
 *   moveZeros([0, 0, 0])        → [0, 0, 0]  (all zeros)
 *
 * CONSTRAINTS:
 *   - Modify the array in-place
 *   - Maintain relative order of non-zero elements
 */
public class MoveZeros {

    // APPROACH 1 — Brute Force
    // Copy non-zeros into a temp array, then copy back (zeros fill remaining slots).
    // Time: O(n)  |  Space: O(n)
    public static void moveZerosBrute(int[] arr) {
        int temp[]= new int[arr.length];
        for (int i = 0,j=0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;    
            }
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i]=temp[i];
        }
    }

    // APPROACH 2 — Optimized (Two Pointers)
    // Use a pointer to track the next position for a non-zero element.
    // Swap non-zeros to the front, zeros naturally end up at the back.
    // Time: O(n)  |  Space: O(1)
    public static void moveZerosOptimized(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for (int k = j; k < arr.length; k++) {
            arr[k]=0;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Brute Force ---");
        int[] a1 = {0, 1, 0, 3, 12};
        moveZerosBrute(a1);
        System.out.println(java.util.Arrays.toString(a1)); // [1, 3, 12, 0, 0]

        int[] a2 = {0, 0, 1};
        moveZerosBrute(a2);
        System.out.println(java.util.Arrays.toString(a2)); // [1, 0, 0]

        int[] a3 = {1, 2, 3};
        moveZerosBrute(a3);
        System.out.println(java.util.Arrays.toString(a3)); // [1, 2, 3]

        System.out.println("--- Optimized ---");
        int[] b1 = {0, 1, 0, 3, 12};
        moveZerosOptimized(b1);
        System.out.println(java.util.Arrays.toString(b1)); // [1, 3, 12, 0, 0]

        int[] b2 = {0, 0, 1};
        moveZerosOptimized(b2);
        System.out.println(java.util.Arrays.toString(b2)); // [1, 0, 0]

        int[] b3 = {1, 2, 3};
        moveZerosOptimized(b3);
        System.out.println(java.util.Arrays.toString(b3)); // [1, 2, 3]
    }
}
