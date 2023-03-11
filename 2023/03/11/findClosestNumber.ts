/**
 * https://leetcode.com/problems/find-closest-number-to-zero/
 * @author Andrew Jarombek
 * @since 3/11/2023
 */

function findClosestNumber(nums: number[]): number {
    let result = Infinity;

    for (let num of nums) {
        if (Math.abs(0 - result) > Math.abs(0 - num)) {
            result = num;
        }

        if (Math.abs(0 - result) == Math.abs(0 - num) && num > result) {
            result = num;
        }
    }

    return result;
}