/**
 * https://leetcode.com/problems/count-special-quadruplets/
 * @author Andrew Jarombek
 * @since 12/31/2021
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountQuadruplets {
    public int countQuadruplets(int[] nums) {
        Map<Integer, Set<Integer>> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Set<Integer> set = values.getOrDefault(num, new HashSet<>());
            set.add(i);

            values.put(num, set);
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int y = nums[j];

                for (int k = j + 1; k < nums.length; k++) {
                    int z = nums[k];
                    int val = x + y + z;

                    if (values.containsKey(val)) {
                        Set<Integer> set = values.get(val);

                        for (int index : set) {
                            count += index > k ? 1 : 0;
                        }
                    }
                }
            }
        }

        return count;
    }
}
