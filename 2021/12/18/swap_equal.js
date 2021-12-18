/**
 * https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
 * @author Andrew Jarombek
 * @since 12/18/2021
 */

const areAlmostEqual = function(s1, s2) {
    if (s1.length !== s2.length) {
        return false;
    }

    let swapChar1 = null;
    let swapChar2 = null;
    let swapped = false;

    for (let i = 0; i < s1.length; i++) {
        if (s1.charAt(i) !== s2.charAt(i)) {
            if (!swapChar1) {
                swapChar1 = s1.charAt(i);
                swapChar2 = s2.charAt(i);
            } else if (!swapped) {
                if (s1.charAt(i) === swapChar2 && s2.charAt(i) === swapChar1) {
                    swapped = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    return !swapChar1 || swapped;
};
