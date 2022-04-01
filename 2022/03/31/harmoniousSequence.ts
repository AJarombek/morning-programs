/**
 * https://leetcode.com/problems/longest-harmonious-subsequence/
 * @author Andrew Jarombek
 * @since 3/31/2022
 */

function findLHS(nums: number[]): number {
    nums.sort((a, b) => a - b);

    let result = 0;
    let first = 0;
    let second = 0;
    let value: number | null = null;

    for (let num of nums) {
        if (num == value) {
            first++;
        } else {
            second = (value == null || value + 1 == num) ? first : 0;
            first = 1;
            value = num;
        }

        if (second) {
            result = Math.max(result, first + second);
        }
    }

    return result;
}