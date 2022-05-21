/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * @author Andrew Jarombek
 * @since 5/21/2022
 */

function sortArrayByParityII(nums: number[]): number[] {
    let i = 0;
    let j = 1;

    while (i < nums.length) {
        let x = nums[i];

        if (x % 2 == 1) {
            let y = nums[j];

            while (y % 2 == 1) {
                j += 2;
                y = nums[j];
            }

            nums[i] = y;
            nums[j] = x;
            j += 2;
        }

        i += 2;
    }

    return nums;
}