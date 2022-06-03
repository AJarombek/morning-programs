/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 * @author Andrew Jarombek
 * @since 6/2/2022
 */

function largestSumAfterKNegations(nums: number[], k: number): number {
    nums.sort((a, b) => a - b);
    let index = 0;

    while (k > 0) {
        if (nums[index] < 0) {
            nums[index] = -nums[index];
            index++;
            k--;
        } else {
            let i = 0;

            if (index == 0 || nums[index - 1] > nums[index]) {
                i = index;
            } else {
                i = index - 1;
            }

            if (k % 2 == 1)
                nums[i] = -nums[i];

            k = 0;
        }
    }

    return nums.reduce((acc, val) => acc + val);
}
