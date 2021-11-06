/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 * @author Andrew Jarombek
 * @since 11/5/2021
 */

import java.util.HashSet;
import java.util.Set;

public class CanBeTyped {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;

        Set<Character> brokenSet = new HashSet<>();

        for (char c: brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        for (String word: text.split(" ")) {
            int index = 0;
            while (index < word.length() && !brokenSet.contains(word.charAt(index))) {
                index++;
            }

            if (index == word.length()) {
                count++;
            }
        }

        return count;
    }
}
