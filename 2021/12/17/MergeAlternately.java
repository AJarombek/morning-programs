/**
 * https://leetcode.com/problems/merge-strings-alternately/
 * @author Andrew Jarombek
 * @since 12/17/2021
 */

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index1 = 0;
        int index2 = 0;

        while (index1 < word1.length() || index2 < word2.length()) {
            if (index1 == word1.length()) {
                sb.append(word2.substring(index2));
                index2 = word2.length();
            } else if (index2 == word2.length()) {
                sb.append(word1.substring(index1));
                index1 = word1.length();
            } else {
                sb.append(word1.charAt(index1));
                sb.append(word2.charAt(index2));
                index1++;
                index2++;
            }
        }

        return sb.toString();
    }
}
