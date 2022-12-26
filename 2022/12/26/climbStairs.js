/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * @author Andrew Jarombek
 * @since 12/26/2022
 */

const minCostClimbingStairsV1 = function(cost) {
    let result = 0;
    let index = -1;

    while (index < cost.length - 3) {
        if ((cost[index+1] + cost[index+3]) <= cost[index+2]) {
            result += cost[index+1];
            index += 1;
        } else {
            result += cost[index+2];
            index += 2;
        }
    }

    if (index === cost.length - 3) {
        result += Math.min(cost[cost.length - 2], cost[cost.length - 1])
    }

    return result;
};

const minCostClimbingStairs = function(cost) {
    let index = 2;

    while (index < cost.length) {
        cost[index] += Math.min(cost[index - 2], cost[index - 1]);
        index++;
    }

    return Math.min(cost[cost.length - 2], cost[cost.length - 1]);
};

console.assert(minCostClimbingStairs([10,15,20]) === 15);
console.assert(minCostClimbingStairs([1,100,1,1,1,100,1,1,100,1]) === 6);
