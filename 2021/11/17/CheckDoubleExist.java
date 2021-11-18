/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * @author Andrew Jarombek
 * @since 11/17/2021
 */

import java.util.HashMap;
import java.util.Map;

public class CheckDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> doubleMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i] * 2;
            doubleMap.put(value, doubleMap.getOrDefault(value, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (doubleMap.containsKey(value)) {
                if (value == arr[i] * 2) {
                    if (doubleMap.get(value) > 1) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}
