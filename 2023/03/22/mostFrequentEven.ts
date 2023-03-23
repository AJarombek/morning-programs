/**
 * https://leetcode.com/problems/most-frequent-even-element/
 * @author Andrew Jarombek
 * @since 3/22/2023
 */

function mostFrequentEven(nums: number[]): number {
    const map = new Map<number, number>();
    let val = 0;
    let min = -1;

    for (let num of nums) {
        if (num % 2 == 0) {
            const value = (map.get(num) ?? 0) + 1;

            if (value > val) {
                min = num;
                val = value;
            } else if (value == val && num < min) {
                min = num;
            }

            map.set(num, value);
        }
    }

    return min;
}