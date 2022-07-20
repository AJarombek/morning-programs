/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * @author Andrew Jarombek
 * @since 7/19/2022
 */

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.getOrDefault(s.charAt(i), 0) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        assert firstUniqChar("aab") == 2;
    }
}
