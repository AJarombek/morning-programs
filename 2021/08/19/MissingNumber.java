/**
 * https://leetcode.com/problems/missing-number/
 * @author Andrew Jarombek
 * @since 8/19/2021
 */

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;

        for (int value : nums) {
            if (value != prev + 1) {
                return prev + 1;
            } else {
                prev += 1;
            }
        }

        return prev + 1;
    }

    public static void main(String[] args) {
        assert missingNumber(new int[] {0, 3, 1}) == 2;
    }
}
