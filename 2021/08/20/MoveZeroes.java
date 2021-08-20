/**
 * https://leetcode.com/problems/move-zeroes/
 * @author Andrew Jarombek
 * @since 8/20/2021
 */


import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] sortedNums = nums.clone();

        for (int i = 0; i < sortedNums.length; i++) {
            sortedNums[i] = Math.abs(sortedNums[i]);
        }

        Arrays.sort(sortedNums);

        int start = 0;

        while (start < nums.length && sortedNums[start] == 0) {
            start++;
        }

        if (start == 0) {
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
