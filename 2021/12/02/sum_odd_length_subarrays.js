/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * @author Andrew Jarombek
 * @since 12/2/2021
 */

const sumOddLengthSubarrays = function(arr) {
    let result = 0;

    for (let i = 1; i <= arr.length; i += 2) {
        for (let j = 0; j < arr.length; j++) {
            const count = Math.min(i, j + 1, arr.length - j, arr.length - i + 1);
            result += arr[j] * count;
        }
    }

    return result;
};