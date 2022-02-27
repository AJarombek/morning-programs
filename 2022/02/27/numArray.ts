/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 * @author Andrew Jarombek
 * @since 2/27/2022
 */

class NumArray {
    constructor(private nums: number[]) {}

    sumRange(left: number, right: number): number {
        let sum = 0;

        for (let i = left; i <= right; i++) {
            sum += this.nums[i];
        }

        return sum;
    }
}