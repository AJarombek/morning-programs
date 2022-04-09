/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 * @author Andrew Jarombek
 * @since 4/8/2022
 */

function findLengthOfLCIS(nums: number[]): number {
    let longest = 1;
    let streak = 1;
    let previous = nums[0];

    for (let i = 1; i < nums.length; i++) {
        let current = nums[i];

        if (current > previous) {
            streak++;
            longest = Math.max(streak, longest);
        } else {
            streak = 1;
        }

        previous = current;
    }

    return longest;
}