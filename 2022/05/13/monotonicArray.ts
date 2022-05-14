/**
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 5/13/2022
 */

function isMonotonic(nums: number[]): boolean {
    const increasing = nums[nums.length - 1] >= nums[0];

    for (let i = 1; i < nums.length; i++) {
        if (increasing) {
            if (nums[i] < nums[i-1])
                return false;
        } else {
            if (nums[i] > nums[i-1])
                return false;
        }
    }

    return true;
}