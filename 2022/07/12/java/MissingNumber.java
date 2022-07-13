/**
 * https://leetcode.com/problems/missing-number
 * @author Andrew Jarombek
 * @since 7/12/2022
 */

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i))
                return i;
        }

        return nums.length;
    }

    public static int missingNumberV2(int[] nums) {
        int sum = 0;
        int total = 0;

        for (int num : nums)
            total += num;

        for (int i = 1; i <= nums.length; i++)
            sum += i;

        return sum - total;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0, 1};
        assert missingNumber(nums) == 2;
        assert missingNumberV2(nums) == 2;
    }
}
