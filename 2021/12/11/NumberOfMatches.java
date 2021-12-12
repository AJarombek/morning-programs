/**
 * https://leetcode.com/problems/count-of-matches-in-tournament/
 * @author Andrew Jarombek
 * @since 12/11/2021
 */

public class NumberOfMatches {
    public int numberOfMatches(int n) {
        int count = 0;

        while (n > 1) {
            count += n / 2;
            n = (n / 2) + (n % 2);
        }

        return count;
    }
}
