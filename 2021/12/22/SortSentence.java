/**
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 * @author Andrew Jarombek
 * @since 12/22/2021
 */

import java.util.Arrays;

public class SortSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(" ");
            sb.append(word.substring(0, word.length() - 1));
        }

        return sb.toString().substring(1);
    }
}
