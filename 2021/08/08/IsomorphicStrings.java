/**
 * https://leetcode.com/problems/isomorphic-strings/
 * @author Andrew Jarombek
 * @since 8/8/2021
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> firstCharMap = new HashMap<>();
        Map<Character, Character> secondCharMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character firstChar = firstCharMap.get(s.charAt(i));
            Character secondChar = secondCharMap.get(t.charAt(i));

            if (firstChar == null && secondChar == null) {
                firstCharMap.put(s.charAt(i), t.charAt(i));
                secondCharMap.put(t.charAt(i), s.charAt(i));
            } else {
                if (firstChar == null || secondChar == null) {
                    return false;
                }

                if (!firstChar.equals(t.charAt(i)) || !secondChar.equals(s.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert !isIsomorphic("foo", "bar");
        assert isIsomorphic("paper", "title");
    }
}
