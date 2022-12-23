/**
 * https://leetcode.com/problems/robot-return-to-origin/
 * @author Andrew Jarombek
 * @since 12/23/2022
 */

const hasAlternatingBits = function(n) {
    let prev = (n & 1) ? 0 : 1;

    while (n > 0) {
        if ((n & 1) === prev) {
            return false;
        }

        prev = prev ? 0 : 1;
        n >>= 1;
    }

    return true;
};

console.assert(hasAlternatingBits(5));
console.assert(!hasAlternatingBits(7));
console.assert(!hasAlternatingBits(11));