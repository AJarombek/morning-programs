/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * @author Andrew Jarombek
 * @since 11/26/2021
 */

const finalPrices = function(prices) {
    const result = [];

    for (let i = 0; i < prices.length; i++) {
        let index = i + 1;

        while (index < prices.length && prices[index] > prices[i]) {
            index++;
        }

        if (index === prices.length) {
            result.push(prices[i]);
        } else {
            result.push(prices[i] - prices[index]);
        }
    }

    return result;
};
