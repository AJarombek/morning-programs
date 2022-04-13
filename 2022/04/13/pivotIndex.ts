/**
 * https://leetcode.com/problems/degree-of-an-array/
 * @author Andrew Jarombek
 * @since 4/13/2022
 */

function pivotIndex(nums: number[]): number {
    let left = 0;
    let right = nums.reduce((acc, val) => acc + val);
    let prev = 0;

    for (let i = 0; i < nums.length; i++) {
        left += prev;

        const val = nums[i]
        prev = val;
        right -= val;

        if (left == right) {
            return i;
        }
    }

    return -1;
}