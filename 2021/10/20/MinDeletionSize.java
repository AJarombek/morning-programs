/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 * @author Andrew Jarombek
 * @since 10/20/2021
 */

public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int count = 0;

        for (int column = 0; column < strs[0].length(); column++) {
            int row = 1;

            while (row < strs.length && strs[row].charAt(column) >= strs[row - 1].charAt(column)) {
                row++;
            }

            if (row != strs.length) {
                count++;
            }
        }

        return count;
    }
}
