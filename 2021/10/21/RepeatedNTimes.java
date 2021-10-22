/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * @author Andrew Jarombek
 * @since 10/21/2021
 */

import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                return num;
            } else {
                set.add(num);
            }
        }

        return -1;
    }
}
