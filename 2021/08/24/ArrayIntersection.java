/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * @author Andrew Jarombek
 * @since 8/24/2021
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int num: nums1) {
            int count = map1.containsKey(num) ? map1.get(num) + 1 : 1;
            map1.put(num, count);
        }

        for (int num: nums2) {
            int count = map2.containsKey(num) ? map2.get(num) + 1 : 1;
            map2.put(num, count);
        }

        for (Map.Entry<Integer, Integer> entry: map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int occurrences = Math.min(entry.getValue(), map2.get(entry.getKey()));

                for (int i = 0; i < occurrences; i++) {
                    result.add(entry.getKey());
                }
            }
        }

        int[] resultArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] result = intersect(new int[] {1, 2, 3, 1}, new int[] {1, 1});
        assert result.length == 2;
        assert result[0] == 1;
        assert result[1] == 1;
    }
}
