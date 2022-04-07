/**
 * https://leetcode.com/problems/set-mismatch/
 * @author Andrew Jarombek
 * @since 4/6/2022
 */

function findErrorNums(nums: number[]): number[] {
    nums.push(nums.length + 1);
    nums.sort((a, b) => a - b);
    let prev = 0;
    let result = [0, 0];
    let i = 0;

    while (result[0] == 0 || result[1] == 0) {
        let current = nums[i];

        if (current == prev + 2) {
            result[1] = prev + 1;
        } else if (current == prev) {
            result[0] = current;
        }

        prev = current;
        i++;
    }

    return result;
}