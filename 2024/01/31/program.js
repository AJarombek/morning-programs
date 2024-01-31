/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 * @author Andrew Jarombek
 * @since 1/31/2024
 */

/**
 * @param {string[]} strs
 * @return {number}
 */
const minDeletionSize = function(strs) {
    let result = 0;

    for (let i = 0; i < strs[0].length; i++) {
        for (let j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) < strs[j-1].charAt(i)) {
                result++;
                break;
            }
        }
    }

    return result;
};
