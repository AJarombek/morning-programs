/*
 * https://leetcode.com/problems/sort-array-by-increasing-frequency/
 * @author Andrew Jarombek
 * @since 8/29/2022
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return Arrays.stream(nums)
                .boxed()
                .sorted(
                    Comparator
                        .comparing(a -> map.getOrDefault(a, 0))
                        .thenComparing(a -> -((Integer) a))
                )
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        int[] expected = new int[] {3, 1, 1, 2, 2, 2};
        int[] result = frequencySort(new int[] {1, 1, 2, 2, 2, 3});
        assert Arrays.equals(expected, result);

        expected = new int[] {1, 3, 3, 2, 2};
        result = frequencySort(new int[] {2, 3, 1, 3, 2});
        assert Arrays.equals(expected, result);

        expected = new int[] {5, -1, 4, 4, -6, -6, 1, 1, 1};
        result = frequencySort(new int[] {-1, 1, -6, 4, 5, -6, 1, 4, 1});
        assert Arrays.equals(expected, result);
    }
}
