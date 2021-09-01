/**
 * https://leetcode.com/problems/arranging-coins/
 * @author Andrew Jarombek
 * @since 8/31/2021
 */

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int steps = 0;
        while (n > 0) {
            n -= steps + 1;

            if (n >= 0) {
                steps++;
            }
        }

        return steps;
    }

    public int arrangeCoinsV2(int n) {
        long start = 0;
        long end = n;

        while (start <= end) {
            // https://cseweb.ucsd.edu/groups/tatami/kumo/exs/sum/
            long k = (start + end) / 2;
            long m = k * (k + 1) / 2;

            if (m == n) {
                return (int) k;
            } else if (n < m) {
                end = k - 1;
            } else {
                start = k + 1;
            }
        }

        return (int) end;
    }
}
