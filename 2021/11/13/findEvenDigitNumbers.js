/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * @author Andrew Jarombek
 * @since 11/13/2021
 */

const findNumbers = function(nums) {
    return nums.reduce((acc, num) => acc + +(`${num}`.length % 2 === 0), 0);
};
