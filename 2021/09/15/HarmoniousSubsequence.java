/**
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 * @author Andrew Jarombek
 * @since 9/15/2021
 */

import java.util.Arrays;

public class HarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int longest = 0;

        int previous = 0;
        int current = 0;
        int currentValue = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            if (num == currentValue) {
                current++;
            } else {
                if (current + previous > longest && previous != 0) {
                    longest = current + previous;
                }

                if (num == currentValue + 1) {
                    previous = current;
                } else {
                    previous = 0;
                }

                current = 1;
                currentValue = num;
            }
        }

        if (current + previous > longest && previous != 0) {
            longest = current + previous;
        }

        return longest;
    }
}
