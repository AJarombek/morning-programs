/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * @author Andrew Jarombek
 * @since 3/2/2024
 */

/**
 * @param {number[]} nums
 * @return {number[]}
 */
const sortedSquares = function(nums) {
    let mid = 0;

    while (mid + 1 < nums.length && Math.abs(nums[mid+1]) <= Math.abs(nums[mid]))
        mid++;

    const result = [nums[mid] * nums[mid]];
    let high = mid + 1;
    let low = mid - 1;

    while (high < nums.length && low >= 0) {
        if (Math.abs(nums[low]) <= Math.abs(nums[high])) {
            result.push(nums[low] * nums[low]);
            low--;
        } else {
            result.push(nums[high] * nums[high]);
            high++;
        }
    }

    while (high < nums.length) {
        result.push(nums[high] * nums[high]);
        high++;
    }

    while (low >= 0) {
        result.push(nums[low] * nums[low]);
        low--;
    }

    return result;
};
