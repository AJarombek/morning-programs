/**
 * https://leetcode.com/problems/self-dividing-numbers/
 * @author Andrew Jarombek
 * @since 7/22/2022
 */

const selfDividingNumbers = function(left, right) {
    const result = [];

    for (let i = left; i <= right; i++) {
        let x = i;
        let valid = true;

        while (x && valid) {
            if (i % (x % 10) !== 0) {
                valid = false;
            } else {
                x = Math.floor(x / 10);
            }
        }

        if (valid)
            result.push(i);
    }

    return result;
}

const result = selfDividingNumbers(1, 22);
const expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22];

console.assert(expected.every((value, index) => value === result[index]));