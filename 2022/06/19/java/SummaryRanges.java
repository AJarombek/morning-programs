/**
 * https://leetcode.com/problems/summary-ranges/
 * @author Andrew Jarombek
 * @since 6/19/2022
 */

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0)
            return result;

        int start = nums[0];
        int current = start;

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];

            if (val - 1 == current) {
                current = val;
            } else {
                if (start == current) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + current);
                }

                start = val;
                current = val;
            }
        }

        if (start == current) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + current);
        }

        return result;
    }
}
