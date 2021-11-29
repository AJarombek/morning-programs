/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * @author Andrew Jarombek
 * @since 11/29/2021
 */

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> potentialPairs = new HashMap<>();

        int result = 0;
        for (int num : nums) {
            if (potentialPairs.containsKey(num)) {
                int count = potentialPairs.get(num);
                result += count;
                potentialPairs.put(num, count + 1);
            } else {
                potentialPairs.put(num, 1);
            }
        }

        return result;
    }
}
