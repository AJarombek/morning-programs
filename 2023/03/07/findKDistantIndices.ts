/**
 * https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/
 * @author Andrew Jarombek
 * @since 3/7/2023
 */

function findKDistantIndices(nums: number[], key: number, k: number): number[] {
    let keys = [];

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] == key) {
            keys.push(i);
        }
    }

    let index = 0;
    let result = [];

    for (let i = 0; i < nums.length; i++) {
        if (index > 0 && i - keys[index-1] <= k) {
            result.push(i);
        } else if (index < keys.length && keys[index] - i <= k) {
            result.push(i);
        }

        if (i == keys[index]) {
            index++;
        }
    }

    return result;
}