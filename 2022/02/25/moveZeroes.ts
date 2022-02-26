/**
 * https://leetcode.com/problems/move-zeroes/
 * @author Andrew Jarombek
 * @since 2/25/2022
 */

function moveZeroes(nums: number[]): void {
    let slow = 0;
    let fast = 0;

    while (fast < nums.length) {
        if (nums[fast] != 0) {
            nums[slow] = nums[fast];
            slow++;
        }

        fast++;
    }

    while (slow < nums.length) {
        nums[slow] = 0;
        slow++;
    }
}