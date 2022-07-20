/**
 * https://leetcode.com/problems/find-the-difference/
 * @author Andrew Jarombek
 * @since 7/19/2022
 */

import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int val = map.getOrDefault(c, 0);

            if (val == 0) {
                return c;
            }

            map.put(c, val - 1);
        }

        return ' ';
    }

    public static void main(String[] args) {
        assert findTheDifference("ab", "abc") == 'c';
    }
}
