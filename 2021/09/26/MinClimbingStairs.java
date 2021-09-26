/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * @author Andrew Jarombek
 * @since 9/26/2021
 */

public class MinClimbingStairs {
    /* Attempt #3 */
    public int minCostClimbingStairs(int[] cost) {
        int[] totalCosts = new int[cost.length];

        for (int i = 0; i < cost.length; i++) {
            int a = i - 1 >= 0 ? totalCosts[i - 1] : 0;
            int b = i - 2 >= 0 ? totalCosts[i - 2] : 0;

            int value = Math.min(a + cost[i], b + cost[i]);

            if (totalCosts[i] != 0) {
                value = Math.min(value, totalCosts[i]);
            }

            totalCosts[i] = value;
        }

        return Math.min(totalCosts[cost.length - 1], totalCosts[cost.length - 2]);
    }

    /* Attempt #1 */
    public int minCostClimbingStairsV1(int[] cost) {
        int index = 0;
        int totalCost = 0;

        while (index < cost.length) {
            int a = cost[index];
            int b = index + 1 < cost.length ? cost[index + 1] : 0;
            int c = index + 2 < cost.length ? cost[index + 2] : 0;
            int d = index + 3 < cost.length ? cost[index + 3] : 0;

            if (a + Math.min(b + d, c) < b + Math.min(c, d)) {
                totalCost += a;
                index++;
            } else {
                totalCost += b;
                index += 2;
            }
        }

        return totalCost;
    }

    /* Attempt #2 */
    public int minCostClimbingStairsV2(int[] cost) {
        return Math.min(
            cost[0] + minCostClimbingStairsV2(cost, 0),
            cost[1] + minCostClimbingStairsV2(cost, 1)
        );
    }

    private int minCostClimbingStairsV2(int[] cost, int index) {
        int a = 0;
        int b = 0;

        if (index + 1 < cost.length) {
            a = cost[index + 1] + minCostClimbingStairsV2(cost, index + 1);
        }

        if (index + 2 < cost.length) {
            b = cost[index + 2] + minCostClimbingStairsV2(cost, index + 2);
        }

        return Math.min(a, b);
    }
}
