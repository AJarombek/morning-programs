/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * @author Andrew Jarombek
 * @since 4/3/2022
 */

function maximumProduct(nums: number[]): number {
    nums.sort((a, b) => a - b);

    let option1 = nums[0] * nums[1] * nums[nums.length - 1];
    let option2 = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
    return Math.max(option1, option2);
}