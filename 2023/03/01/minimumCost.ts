/**
 * https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 * @author Andrew Jarombek
 * @since 3/1/2023
 */

function minimumCost(cost: number[]): number {
    let result = 0;

    cost.sort((a, b) => a - b);
    let i = cost.length - 1;

    while (i >= 0) {
        result += cost[i];

        if (i >= 1) {
            result += cost[i-1];
        }

        i -= 3;
    }

    return result;
}
