/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * @author Andrew Jarombek
 * @since 12/15/2022
 */

const maximumProduct = function(nums) {
    nums.sort((x, y) => x - y);

    if (nums[nums.length - 1] < 0) {
        return nums.slice(nums.length - 3).reduce((acc, val) => acc * val, 1);
    }

    return Math.max(
        nums[0] * nums[1] * nums[nums.length - 1],
        nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]
    );
};

console.assert(maximumProduct([1, 2, 3, 4]) === 24);
console.assert(maximumProduct([-100, -98, -1, 2, 3, 4]) === 39200);
