/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * @author Andrew Jarombek
 * @since 11/10/2021
 */

const balancedStringSplit = function(s) {
    let left = 0;
    let right = 0;
    let result = 0;

    for (const c of s) {
        if (c === 'R') {
            right++;
        } else {
            left++;
        }

        if (right === left) {
            result++;
        }
    }

    return result;
};