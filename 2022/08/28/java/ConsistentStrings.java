/*
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 * @author Andrew Jarombek
 * @since 8/28/2022
 */

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        int result = 0;

        for (String word: words) {
            int index = 0;
            boolean matches = true;

            while (matches && index < word.length()) {
                if (!set.contains(word.charAt(index)))
                    matches = false;

                index++;
            }

            if (matches)
                result++;
        }

        return result;
    }

    public static void main(String[] args) {
        assert countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}) == 2;
        assert countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}) == 7;
        assert countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}) == 4;
    }
}
