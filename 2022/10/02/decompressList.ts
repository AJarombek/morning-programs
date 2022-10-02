/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * @author Andrew Jarombek
 * @since 10/2/2022
 */

function decompressRLElist(nums: number[]): number[] {
    let result = [];

    for (let i = 1; i < nums.length; i += 2) {
        const freq = nums[i-1];
        const val = nums[i];

        for (let j = 0; j < freq; j++)
            result.push(val);
    }

    return result;
}