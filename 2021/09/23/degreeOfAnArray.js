/**
 * https://leetcode.com/problems/degree-of-an-array/
 * @author Andrew Jarombek
 * @since 9/23/2021
 */

const findShortestSubArray = function(nums) {
    const info = {};

    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        const numInfo = info[num] || { count: 0, start: i, end: i };
        numInfo.count = numInfo.count + 1;
        numInfo.end = i;

        info[num] = numInfo;
    }

    let maxCount = 0;
    let minLength = 0;

    for (const [key, value] of Object.entries(info)) {
        const { count, start, end } = value;
        const length = end - start + 1;

        if (count > maxCount) {
            maxCount = count;
            minLength = length;
        } else if (count === maxCount) {
            minLength = Math.min(length, minLength);
        }
    }

    return minLength;
};