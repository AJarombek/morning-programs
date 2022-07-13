/**
 * https://leetcode.com/problems/word-pattern
 * @author Andrew Jarombek
 * @since 7/13/2022
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] words = s.split(" ");
        int index = 0;

        if (words.length != pattern.length()) {
            return false;
        }

        for (String word : words) {
            char c = pattern.charAt(index);
            String value = map.get(c);

            if (value == null) {
                if (set.contains(word)) {
                    return false;
                }

                map.put(c, word);
                set.add(word);
            } else if (!word.equals(value)) {
                return false;
            }

            index++;
        }

        return true;
    }

    public static void main(String[] args) {
        assert wordPattern("abba", "cat dog dog cat");
        assert !wordPattern("abba", "cat dog dog deer");
    }
}
