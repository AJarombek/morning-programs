/**
 * https://leetcode.com/problems/minimum-moves-to-convert-string/
 * @author Andrew Jarombek
 * @since 1/2/2022
 */

public class MinimumMoves {
    public int minimumMoves(String s) {
        int count = 0;
        int index = 0;

        while (index < s.length()) {
            if (s.charAt(index) == 'X') {
                count++;
                index += 3;
            } else {
                index++;
            }
        }

        return count;
    }
}
