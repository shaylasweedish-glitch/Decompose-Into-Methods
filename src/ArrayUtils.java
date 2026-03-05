// ArrayUtils.java
public class ArrayUtils {

    /**
     * Returns the sum of all even numbers in the array.
     * Edge cases:
     * - null or empty -> 0
     */
    public static int sumOfEvens(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;

        // Put a breakpoint on the next line to debug the loop
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            // Even check works for negatives too (e.g., -4 % 2 == 0)
            if (value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    /**
     * Returns how many times target appears in nums.
     * Edge cases:
     * - null or empty -> 0
     */
    public static int countOccurrences(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;

        // Put a breakpoint on the next line to debug the loop
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if (value == target) {
                count++;
            }
        }

        return count;
    }
}
