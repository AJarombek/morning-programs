/**
 * https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
 * @author Andrew Jarombek
 * @since 3/6/2023
 */

function mostFrequent(nums: number[], key: number): number {
    let map = new Map<number, number>();
    let target = false;

    for (let num of nums) {
        if (target) {
            map.set(num, (map.get(num) ?? 0) + 1);
        }

        target = num == key;
    }

    let result = 0;
    let value = 0;

    map.forEach((val: number, key: number) => {
        if (val > value) {
            result = key;
            value = val;
        }
    });

    return result;
}
