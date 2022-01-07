/**
 * https://leetcode.com/problems/finding-3-digit-even-numbers/
 * @author Andrew Jarombek
 * @since 1/6/2022
 */

const findEvenNumbers = function(digits) {
    const result = new Set();
    digits.sort();

    for (let x = 0; x < digits.length; x++) {
        if (digits[x] !== 0) {
            for (let y = 0; y < digits.length; y++) {
                if (x !== y) {
                    for (let z = 0; z < digits.length; z++) {
                        if (x !== z && y !== z && digits[z] % 2 === 0) {
                            result.add((digits[x] * 100) + (digits[y] * 10) + digits[z]);
                        }
                    }
                }
            }
        }
    }

    return Array.from(result);
};