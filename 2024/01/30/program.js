/**
 * https://leetcode.com/problems/di-string-match/
 * @author Andrew Jarombek
 * @since 1/30/2024
 */

/**
 * @param {string} s
 * @return {number[]}
 */
const diStringMatch = function(s) {
    let i = 0;
    let d = s.length;
    const result = [];

    for (let c of s) {
        if (c === 'I') {
            result.push(i++);
        } else {
            result.push(d--);
        }
    }

    result.push(i);
    return result;
};
