/**
 * https://leetcode.com/problems/number-of-arithmetic-triplets/
 * @author Andrew Jarombek
 * @since 3/18/2023
 */

function arithmeticTriplets(nums: number[], diff: number): number {
    let result = 0;

    for (let i = 0; i < nums.length; i++) {
        let first = nums[i];
        for (let j = i + 1; j < nums.length; j++) {
            let second = nums[j];

            if (second - first == diff) {
                for (let k = j + 1; k < nums.length; k++) {
                    let third = nums[k];

                    if (third - second == diff) {
                        result++;
                    }
                }
            }
        }
    }

    return result;
}