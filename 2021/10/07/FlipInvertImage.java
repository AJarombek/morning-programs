/**
 * https://leetcode.com/problems/flipping-an-image/
 * @author Andrew Jarombek
 * @since 10/7/2021
 */

public class FlipInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < row.length / 2; i++) {
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
        }

        for (int[] row : image) {
            for (int i = 0; i < row.length; i++) {
                row[i] = 1 ^ row[i];
            }
        }

        return image;
    }
}
