/**
 * https://leetcode.com/problems/ransom-note/
 * @author Andrew Jarombek
 * @since 7/18/2022
 */

import java.util.HashMap;
import java.util.Map;

public class ConstructNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int count = map.getOrDefault(c, 0);

            if (count > 0) {
                map.put(c, count - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        assert canConstruct("aa", "aab");
        assert !canConstruct("aa", "ab");
    }
}
