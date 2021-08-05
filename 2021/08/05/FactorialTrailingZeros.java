/**
 * https://leetcode.com/problems/factorial-trailing-zeroes
 * Solution: This approach works while the numbers remain small.  To properly solve the problem, there is a pattern you
 * need to recognize in the factorial results.
 * @author Andrew Jarombek
 * @since 8/5/2021
 */

public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        int trailingCount = 0;

        while (result > 0) {
            if (result % 10 == 0) {
                trailingCount++;
                result /= 10;
            } else {
                break;
            }
        }

        return trailingCount;
    }

    public static void main(String[] args) {
        assert trailingZeroes(13) == 2;
    }
}
