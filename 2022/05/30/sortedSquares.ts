/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * @author Andrew Jarombek
 * @since 5/30/2022
 */

function sortedSquares(nums: number[]): number[] {
    let i = 0;
    let j = 0;

    while (nums[j] < 0) {
        j++;
    }

    i = j - 1;
    const result = [];

    while (i >= 0 || j < nums.length) {
        if (i < 0) {
            result.push(nums[j] ** 2);
            j++;
        } else if (j >= nums.length) {
            result.push(nums[i] ** 2);
            i--;
        } else {
            let x = nums[i];
            let y = nums[j];

            if (Math.abs(x) > Math.abs(y)) {
                result.push(y ** 2);
                j++;
            } else {
                result.push(x ** 2);
                i--;
            }
        }
    }

    return result;
}