/**
 * https://leetcode.com/problems/smallest-range-i/
 * @author Andrew Jarombek
 * @since 5/13/2023
 */

const assert = require('assert');

const smallestRangeI = function(nums, k) {
    let max = -Infinity;
    let min = Infinity;

    for (let num of nums) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }

    return Math.max(0, max - min - k * 2);
}

let nums = [1, 2, 3, 4, 5];
let k = 2;
let expected = 0;
let result = smallestRangeI(nums, k);
assert.strictEqual(result, expected);

nums = [4, 7, 2, 8, 1];
k = 3;
expected = 1;
result = smallestRangeI(nums, k);
assert.strictEqual(result, expected);
