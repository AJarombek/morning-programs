/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * @author Andrew Jarombek
 * @since 5/28/2022
 */

function repeatedNTimes(nums: number[]): number {
    let set = new Set<number>();

    for (let num of nums) {
        if (set.has(num)) {
            return num;
        } else {
            set.add(num);
        }
    }

    return -1;
}