/**
 * https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
 * @author Andrew Jarombek
 * @since 3/6/2023
 */

function countHillValley(nums: number[]): number {
    let start = 1;
    let end = 0;
    let prev = nums[0];

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] != prev) {
            end++;
            nums[end] = nums[i];
            prev = nums[i];
        }
    }

    let result = 0;

    for (let i = start; i < end; i++) {
        const previous = nums[i-1];
        const current = nums[i];
        const next = nums[i+1];

        if ((previous > current && next > current) || (previous < current && next < current)) {
            result++;
        }
    }

    return result;
}
