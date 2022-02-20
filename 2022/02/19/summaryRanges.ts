/**
 * https://leetcode.com/problems/summary-ranges/
 * @author Andrew Jarombek
 * @since 2/19/2022
 */

function summaryRanges(nums: number[]): string[] {
    if (!nums) {
        return [];
    }

    nums.push(nums[-1]);
    let first = nums[0];
    let prev = nums[0];
    let result = [];

    for (let index = 1; index < nums.length; index++) {
        const num = nums[index];

        if (num == prev + 1) {
            prev += 1;
        } else {
            if (prev == first) {
                result.push(`${first}`);
            } else {
                result.push(`${first}->${prev}`);
            }

            first = num;
            prev = num;
        }
    }

    return result;
}