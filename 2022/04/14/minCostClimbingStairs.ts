/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * @author Andrew Jarombek
 * @since 4/14/2022
 */

function minCostClimbingStairs(cost: number[]): number {
    let index = 2;

    while (index < cost.length) {
        cost[index] = cost[index] + Math.min(cost[index - 1], cost[index - 2]);
        index++;
    }

    return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
}