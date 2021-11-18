/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * @author Andrew Jarombek
 * @since 11/18/2021
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> smallerCount = new HashMap<>();
        int start = 0;
        int prev = sortedNums[0];

        for (int i = 1; i < sortedNums.length; i++) {
            if (sortedNums[i] != prev) {
                smallerCount.put(prev, start);
                start = i;
                prev = sortedNums[i];
            }
        }

        smallerCount.put(prev, start);

        for (int i = 0; i < sortedNums.length; i++) {
            nums[i] = smallerCount.get(nums[i]);
        }

        return nums;
    }
}
