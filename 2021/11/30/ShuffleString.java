/**
 * https://leetcode.com/problems/shuffle-string/
 * @author Andrew Jarombek
 * @since 11/30/2021
 */

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}
