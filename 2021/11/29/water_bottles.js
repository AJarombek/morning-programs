/**
 * https://leetcode.com/problems/water-bottles/
 * @author Andrew Jarombek
 * @since 11/29/2021
 */

const numWaterBottles = function(numBottles, numExchange) {
    let numEmpties = 0;
    let result = 0;

    while (numBottles > 0) {
        result += numBottles;

        numEmpties += numBottles;
        numBottles = 0;

        const exchange = numEmpties - (numEmpties % numExchange);
        numEmpties %= numExchange;
        numBottles = exchange / numExchange;
    }

    return result;
};