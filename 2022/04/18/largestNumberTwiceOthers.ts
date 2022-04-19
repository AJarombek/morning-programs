/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * @author Andrew Jarombek
 * @since 4/18/2022
 */

function dominantIndex(nums: number[]): number {
    if (nums.length == 1) {
        return 0;
    }

    let first = -1;
    let index = -1;
    let second = -1;

    for (let i = 0; i < nums.length; i++) {
        const val = nums[i];

        if (val > first) {
            second = first;
            first = val;
            index = i;
        } else if (val > second) {
            second = val;
        }
    }

    return second <= first / 2 ? index : -1;
}