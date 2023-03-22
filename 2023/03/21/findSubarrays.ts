/**
 * https://leetcode.com/problems/find-subarrays-with-equal-sum/
 * @author Andrew Jarombek
 * @since 3/21/2023
 */

function findSubarrays(nums: number[]): boolean {
    const set = new Set<number>();

    for (let i = 1; i < nums.length; i++) {
        const val = nums[i] + nums[i-1];

        if (set.has(val))
            return true;

        set.add(val);
    }

    return false;
}
