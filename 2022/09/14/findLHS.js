/**
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 * @author Andrew Jarombek
 * @since 9/14/2022
 */

const findLHS = function(nums) {
    nums.sort((a, b) => a - b);

    let result = 0;

    let prev = null;
    let prevCount = 0;

    let current = null;
    let currentCount = 0;

    for (let num of nums) {
        if (num === current) {
            currentCount++;
        } else {
            prev = current;
            prevCount = current === num - 1 ? currentCount : 0;
            current = num;
            currentCount = 1;
        }

        if (prevCount && currentCount)
            result = Math.max(result, prevCount + currentCount);
    }

    return result;
};

console.assert(findLHS([1,1,3,2,2,5,2,3,7]) === 5);
console.assert(findLHS([1,2,3,4]) === 2);
console.assert(findLHS([1,1,1,1]) === 0);
