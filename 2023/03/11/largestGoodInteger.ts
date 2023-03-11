/**
 * https://leetcode.com/problems/largest-3-same-digit-number-in-string/
 * @author Andrew Jarombek
 * @since 3/11/2023
 */

function largestGoodInteger(num: string): string {
    const nums = num.split("");
    let result = "";
    let value = -1;

    for (let i = 0; i < nums.length - 2; i++) {
        if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
            const val = num.substring(i, i + 3);

            if (+val > value) {
                result = val;
                value = +val;
            }
        }
    }

    return result;
}