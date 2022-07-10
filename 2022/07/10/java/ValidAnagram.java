/**
 * https://leetcode.com/problems/valid-anagram/
 * @author Andrew Jarombek
 * @since 7/10/2022
 */

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = map.getOrDefault(c, 0);

            if (count == 0) {
                return false;
            }

            map.put(c, count - 1);
        }

        for (int value : map.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert !isAnagram("cat", "rat");
        assert isAnagram("dog", "god");
    }
}
