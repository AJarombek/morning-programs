/**
 * https://leetcode.com/problems/intersection-of-multiple-arrays/
 * @author Andrew Jarombek
 * @since 3/9/2023
 */

function intersection(nums: number[][]): number[] {
    let map = new Map<number, number>();

    for (let numArray of nums) {
        for (let num of numArray) {
            map.set(num, (map.get(num) ?? 0) + 1);
        }
    }

    const result = [];

    map.forEach((value, key) => {
        if (value == nums.length) {
            result.push(key);
        }
    });

    result.sort((a, b) => a - b);
    return result;
}
