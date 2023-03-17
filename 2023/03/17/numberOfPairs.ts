/**
 * https://leetcode.com/problems/maximum-number-of-pairs-in-array/
 * @author Andrew Jarombek
 * @since 3/17/2023
 */

function numberOfPairs(nums: number[]): number[] {
    const map = new Map<number, number>();

    for (let num of nums) {
        map.set(num, (map.get(num) ?? 0) + 1);
    }

    const result = [0, 0];

    map.forEach((value) => {
        result[0] += Math.floor(value / 2);
        result[1] += value % 2;
    });

    return result;
}
