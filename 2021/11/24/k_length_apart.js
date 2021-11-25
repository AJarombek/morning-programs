/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * @author Andrew Jarombek
 * @since 11/24/2021
 */

const kLengthApart = function(nums, k) {
    let oneFound = false;
    let zeroCount = 0;

    for (let num of nums) {
        if (num) {
            if (oneFound && zeroCount < k) {
                return false;
            }

            oneFound = true;
            zeroCount = 0;
        } else {
            zeroCount++;
        }
    }

    return true;
};
