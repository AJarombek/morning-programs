/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * @author Andrew Jarombek
 * @since 5/16/2023
 */

const assert = require('assert');

const sortArrayByParityII = function(nums) {
    let odd = 1;
    let even = 0;

    while (odd < nums.length && even < nums.length) {
        if (nums[odd] % 2 === 1) {
            odd += 2;
        } else if (nums[even] % 2 === 0) {
            even += 2;
        } else {
            let temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
            odd += 2;
            even += 2;
        }
    }

    return nums;
}

// Test case 1: Even and odd elements are already sorted
const nums1 = [2, 1, 4, 3, 6, 5];
const expected1 = [2, 1, 4, 3, 6, 5];
assert.deepStrictEqual(sortArrayByParityII(nums1), expected1, 'Test case 1 failed');

// Test case 2: Even and odd elements need to be swapped
const nums2 = [3, 4, 2, 5, 1, 6];
const expected2 = [4, 3, 2, 5, 6, 1];
assert.deepStrictEqual(sortArrayByParityII(nums2), expected2, 'Test case 2 failed');
