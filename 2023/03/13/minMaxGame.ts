/**
 * https://leetcode.com/problems/min-max-game/
 * @author Andrew Jarombek
 * @since 3/13/2023
 */

function minMaxGame(nums: number[]): number {
    while (nums.length > 1) {
        let next = [];

        for (let i = 0; i < nums.length; i += 2) {
            if (i % 4 == 0) {
                next.push(Math.min(nums[i], nums[i+1]));
            } else {
                next.push(Math.max(nums[i], nums[i+1]));
            }
        }

        nums = next;
    }

    return nums[0];
}