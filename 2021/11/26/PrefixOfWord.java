/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * @author Andrew Jarombek
 * @since 11/26/2021
 */

public class PrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= searchWord.length() &&
                    searchWord.equals(words[i].substring(0, searchWord.length()))) {
                return i + 1;
            }
        }

        return -1;
    }
}
