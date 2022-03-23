/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * @author Andrew Jarombek
 * @since 3/22/2022
 */

// Sorry if I'm a meanie.  Then again, maybe you've never read any of these.
// I just want both of us to get what we truly want.

function findMaxConsecutiveOnes(nums: number[]): number {
    let max = 0;
    let current = 0;
    let i = 0;

    while (i < nums.length) {
        if (nums[i] == 0) {
            current = 0;
        } else {
            current += 1;
            max = Math.max(max, current);
        }

        i++;
    }

    return max;
}