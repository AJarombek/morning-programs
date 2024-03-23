/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 * @author Andrew Jarombek
 * @since 3/23/2024
 */

/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
const addToArrayForm = function(num, k) {
    let remainder = 0;
    let index = num.length - 1;
    const result = [];

    while (index >= 0 || k > 0 || remainder > 0) {
        let val = (num[index] ?? 0) + (k % 10) + remainder;
        result.push(val % 10);

        k = Math.floor(k / 10);
        remainder = Math.floor(val / 10);
        index--;
    }

    result.reverse();
    return result;
};
