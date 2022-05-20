/**
 * https://leetcode.com/problems/smallest-range-i/
 * @author Andrew Jarombek
 * @since 5/19/2022
 */

function smallestRangeI(nums: number[], k: number): number {
    let max = -Infinity;
    let min = Infinity;

    for (let num of nums) {
        max = Math.max(max, num);
        min = Math.min(min, num);
    }

    return Math.max(0, max - min - k * 2);
}