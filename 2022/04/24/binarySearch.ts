/**
 * https://leetcode.com/problems/binary-search/
 * @author Andrew Jarombek
 * @since 4/24/2022
 */

function search(nums: number[], target: number): number {
    let low = 0;
    let high = nums.length;

    while (low <= high) {
        const mid = Math.floor((low + high) / 2);
        const val = nums[mid];

        if (val == target) {
            return mid;
        } else if (val > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return -1;
}