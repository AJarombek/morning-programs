/**
 * https://leetcode.com/problems/divide-array-into-equal-pairs/
 * @author Andrew Jarombek
 * @since 3/5/2023
 */

function divideArray(nums: number[]): boolean {
    let map = new Map<number, number>();

    for (let num of nums) {
        map.set(num, (map.get(num) ?? 0) + 1);
    }

    for (let value of map.values()) {
        if (value % 2 == 1) {
            return false;
        }
    }

    return true;
}