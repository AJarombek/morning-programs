/**
 * https://leetcode.com/problems/find-pivot-index/
 * @author Andrew Jarombek
 * @since 7/22/2022
 */

const pivotIndex = function(nums) {
    let left = nums.reduce((acc, val) => acc + val);
    let right = 0;

    for (let i = 0; i < nums.length; i++) {
        const val = nums[i];
        left -= val;

        if (right === left)
            return i;

        right += val;
    }

    return -1;
}

let result = pivotIndex([2, 1, -1]);
console.assert(result === 0);

result = pivotIndex([-1, 1, 2]);
console.assert(result === 2);