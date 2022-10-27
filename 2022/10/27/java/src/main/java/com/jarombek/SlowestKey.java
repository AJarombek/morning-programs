/*
 * https://leetcode.com/problems/slowest-key/
 * @author Andrew Jarombek
 * @since 10/27/2022
 */

package com.jarombek;

import java.util.HashMap;
import java.util.Map;

public class SlowestKey {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character, Integer> keys = new HashMap<>();
        int prev = 0;

        for (int i = 0; i < releaseTimes.length; i++) {
            char key = keysPressed.charAt(i);
            int time = releaseTimes[i];
            int val = time - prev;

            prev = time;
            keys.put(key, Math.max(keys.getOrDefault(key, 0), val));
        }

        int resultVal = 0;
        char result = ' ';

        for (Map.Entry<Character, Integer> entry : keys.entrySet()) {
            int val = entry.getValue();

            if (val > resultVal) {
                resultVal = val;
                result = entry.getKey();
            } else if (val == resultVal) {
                char key = entry.getKey();

                if (key > result) {
                    resultVal = val;
                    result = key;
                }
            }
        }

        return result;
    }
}
