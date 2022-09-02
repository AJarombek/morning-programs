/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 * @author Andrew Jarombek
 * @since 9/2/2022
 */

public class CountOddsInRange {
    public static int countOdds(int low, int high) {
        int result = (high - low) / 2;

        if (low % 2 == 1 || high % 2 == 1)
            result++;

        return result;
    }

    public static void main(String[] args) {
        assert countOdds(3, 7) == 3;
        assert countOdds(2, 4) == 1;
    }
}
