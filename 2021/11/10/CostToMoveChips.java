/**
 * https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 * @author Andrew Jarombek
 * @since 11/10/2021
 */

public class CostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        int odds = 0;
        int evens = 0;

        for (int value: position) {
            if (value % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        return Math.min(odds, evens);
    }
}
