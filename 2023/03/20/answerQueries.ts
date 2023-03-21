/**
 * https://leetcode.com/problems/longest-subsequence-with-limited-sum/
 * @author Andrew Jarombek
 * @since 3/20/2023
 */

function answerQueries(nums: number[], queries: number[]): number[] {
    nums.sort((a, b) => a - b);

    for (let i = 1; i < nums.length; i++) {
        nums[i] += nums[i-1];
    }

    const result = [];

    for (let value of queries) {
        let low = 0;
        let high = nums.length - 1;

        while (low <= high) {
            const mid = Math.floor((low + high) / 2);

            if (nums[mid] == value) {
                high = mid;
                break;
            }

            if (nums[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        result.push(high + 1);
    }

    return result;
}
