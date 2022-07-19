/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * @author Andrew Jarombek
 * @since 7/18/2022
 */

public class GuessNumber {
    private static int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num < 6) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int guessNumber(int n) {
        long low = 1;
        long high = n;

        while (low <= high) {
            long mid = (low + high) / 2;
            int result = guess((int) mid);

            if (result == 0) {
                return (int) mid;
            } else if (result == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    public static void main(String[] args) {
        assert guessNumber(10) == 6;
    }
}
