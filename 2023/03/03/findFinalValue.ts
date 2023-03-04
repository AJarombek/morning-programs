/**
 * https://leetcode.com/problems/keep-multiplying-found-values-by-two/
 * @author Andrew Jarombek
 * @since 3/3/2023
 */

function findFinalValue(nums: number[], original: number): number {
    let set = new Set<number>(nums);
    let val = original;

    while (set.has(val)) {
        val *= 2;
    }

    return val;
}