/**
 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 * @author Andrew Jarombek
 * @since 1/8/2022
 */

const checkString = function(s) {
    let a = false;

    for (let i = s.length - 1; i >= 0; i--) {
        if (s.charAt(i) === 'a') {
            a = true;
        } else if (a) {
            return false;
        }
    }

    return true;
};