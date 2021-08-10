/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 * @author Andrew Jarombek
 * @since 8/10/2021
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> found = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer j = found.get(nums[i]);
            if (j != null && Math.abs(i - j) <= k) {
                return true;
            } else {
                found.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        assert containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3);
    }
}
