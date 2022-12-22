/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 * @author Andrew Jarombek
 * @since 12/21/2022
 */

const findLengthOfLCIS = function(nums) {
    let result = 1;
    let count = 1;
    let prev = nums[0];

    for (let val of nums.slice(1)) {
        if (val > prev) {
            count += 1;
            result = Math.max(count, result);
        } else {
            count = 1;
        }

        prev = val;
    }

    return result;
};

console.assert(findLengthOfLCIS([1,3,5,4,7]) === 3);
console.assert(findLengthOfLCIS([2,2,2,2,2]) === 1);
