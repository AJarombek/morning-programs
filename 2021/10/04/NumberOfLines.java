/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 * @author Andrew Jarombek
 * @since 10/4/2021
 */

public class NumberOfLines {
    public int[] numberOfLines(int[] widths, String s) {
        int rows = 1;
        int width = 0;

        for (char c : s.toCharArray()) {
            int i = c - 'a';

            if (widths[i] + width > 100) {
                width = 0;
                rows++;
            }

            width = widths[i] + width;
        }

        return new int[] {rows, width};
    }
}
