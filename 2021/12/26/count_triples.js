/**
 * https://leetcode.com/problems/count-square-sum-triples/
 * @author Andrew Jarombek
 * @since 12/26/2021
 */

const countTriples = function(n) {
    let result = 0;

    for (let x = 1; x < n; x++) {
        for (let y = x + 1; y < n; y++) {
            const val = Math.sqrt(x ** 2 + y ** 2);

            if (Number.isInteger(val) && val <= n) {
                result += 2;
            } else if (val > n) {
                break;
            }
        }
    }

    return result;
};