/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 * @author Andrew Jarombek
 * @since 11/2/2021
 */

import java.util.HashMap;
import java.util.Map;

public class FindSpecialInteger {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        double threshold = arr.length * 0.25;

        for (int val : arr) {
            int count = occurrences.getOrDefault(val, 0) + 1;

            if (count > threshold) {
                return val;
            } else {
                occurrences.put(val, count);
            }
        }

        return -1;
    }
}
