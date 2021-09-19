/**
 * https://leetcode.com/problems/set-mismatch/
 * @author Andrew Jarombek
 * @since 9/19/2021
 */

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                result[0] = nums[i];
            }

            numSet.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                result[1] = i;
                break;
            }
        }

        return result;
    }
}
