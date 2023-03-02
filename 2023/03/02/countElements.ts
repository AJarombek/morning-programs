/**
 * https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/
 * @author Andrew Jarombek
 * @since 3/2/2023
 */

function countElements(nums: number[]): number {
    if (nums.length <= 2) {
        return 0;
    }

    let min = Infinity;
    let max = -Infinity;

    for (let num of nums) {
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    let result = 0;

    for (let num of nums) {
        if (num != min && num != max) {
            result++;
        }
    }

    return result;
}
