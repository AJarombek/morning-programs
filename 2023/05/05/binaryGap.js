/**
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 5/5/2023
 */

const binaryGap = function(n) {
    let result = 0;
    let index = 0;
    let prev = null;

    while (n > 0) {
        if (n % 2 === 1) {
            if (prev !== null) {
                result = Math.max(result, index - prev);
            }

            prev = index;
        }

        index++;
        n >>= 1;
    }

    return result;
}

console.assert(binaryGap(22) === 2);
console.assert(binaryGap(8) === 0);
console.assert(binaryGap(5) === 2);
