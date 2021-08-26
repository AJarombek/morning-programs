/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * @author Andrew Jarombek
 * @since 8/26/2021
 */

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqueChar(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : s.toCharArray()) {
            int value = charCounts.containsKey(c) ? charCounts.get(c) + 1 : 1;
            charCounts.put(c, value);
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        assert firstUniqueChar("hello") == 0;
        assert firstUniqueChar("hhello") == 2;
        assert firstUniqueChar("hh") == -1;
    }
}
