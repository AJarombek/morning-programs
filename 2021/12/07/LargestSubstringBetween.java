/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 * @author Andrew Jarombek
 * @since 12/7/2021
 */

public class LargestSubstringBetween {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] chars = new int[26];
        int largest = -1;

        char[] characters = s.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            int code = characters[i] - 97;

            if (chars[code] != 0) {
                largest = Math.max(largest, i - chars[code]);
            } else {
                chars[code] = i + 1;
            }
        }

        return largest;
    }
}
