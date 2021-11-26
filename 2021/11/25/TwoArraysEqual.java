/**
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * @author Andrew Jarombek
 * @since 11/25/2021
 */

import java.util.HashMap;
import java.util.Map;

public class TwoArraysEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> targetMap = new HashMap<>();
        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int value : target) {
            targetMap.put(value, targetMap.getOrDefault(value, 0) + 1);
        }

        for (int value : arr) {
            arrMap.put(value, arrMap.getOrDefault(value, 0) + 1);
        }

        for (int key : targetMap.keySet()) {
            if (targetMap.get(key) != arrMap.get(key)) {
                return false;
            }
        }

        for (int key : arrMap.keySet()) {
            if (arrMap.get(key) != targetMap.get(key)) {
                return false;
            }
        }

        return true;
    }
}
