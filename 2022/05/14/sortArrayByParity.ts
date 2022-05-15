/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * @author Andrew Jarombek
 * @since 5/14/2022
 */

function sortArrayByParity(nums: number[]): number[] {
    let start = 0;
    let end = nums.length - 1;

    while (start < end) {
        if (nums[end] % 2 == 1) {
            end--;
        } else {
            if (nums[start] % 2 == 0) {
                start++;
            } else {
                let temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                start++;
            }
        }
    }

    return nums;
}