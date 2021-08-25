/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * @author Andrew Jarombek
 * @since 8/25/2021
 */

public class GuessGame {
    private int guess(int num) { return 0; }

    public int guessNumber(int n) {
        long min = 1;
        long max = ((long) Math.pow(2, 31)) - 1;

        while (max >= min) {
            int mid = (int) ((max + min) / 2);
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == 1) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return -1;
    }
}