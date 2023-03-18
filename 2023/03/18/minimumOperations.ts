/**
 * https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
 * @author Andrew Jarombek
 * @since 3/18/2023
 */

function minimumOperations(nums: number[]): number {
    const set = new Set<number>();

    for (let num of nums) {
        set.add(num);
    }

    if (set.has(0)) {
        return set.size - 1;
    }

    return set.size;
}
