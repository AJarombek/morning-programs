/**
 * https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/
 * @author Andrew Jarombek
 * @since 1/4/2022
 */

public class CheckAlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            freq1[c1 - 'a'] += 1;

            char c2 = word2.charAt(i);
            freq2[c2 - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}
