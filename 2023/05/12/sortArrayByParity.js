/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * @author Andrew Jarombek
 * @since 5/12/2023
 */

const assert = require('assert');

const sortArrayByParity = function(nums) {
    let start = 0;
    let end = nums.length - 1;

    while (start < end) {
        if (nums[start] % 2 === 0) {
            start++;
        } else if (nums[end] % 2 === 1) {
            end--;
        } else {
            let temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    return nums;
}

let nums = [3, 1, 2, 4];
let expected = [4, 2, 1, 3];
let result = sortArrayByParity(nums);
assert.deepStrictEqual(result, expected);

nums = [2, 4, 6, 8];
expected = [2, 4, 6, 8];
result = sortArrayByParity(nums);
assert.deepStrictEqual(result, expected);
