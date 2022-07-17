/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * @author Andrew Jarombek
 * @since 7/17/2022
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                list.add(num);
                map.put(num, count - 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 2, 2, 1};
        int[] nums2 = new int[] {2, 2};
        int[] result = intersect(nums1, nums2);

        assert result.length == 2;
        assert result[0] == 2;
        assert result[1] == 2;
    }
}
