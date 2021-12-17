/**
 * https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
 * @author Andrew Jarombek
 * @since 12/16/2021
 */

const minOperations = function(s) {
    let mismatches = 0;

    for (let i = 0; i < s.length; i++) {
        const c = s.charAt(i);

        if (+s.charAt(i) === i % 2) {
            mismatches++;
        }
    }

    return Math.min(mismatches, s.length - mismatches);
};
