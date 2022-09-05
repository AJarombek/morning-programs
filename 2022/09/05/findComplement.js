/**
 * https://leetcode.com/problems/number-complement/
 * @author Andrew Jarombek
 * @since 9/5/2022
 */

const findComplement = function(num) {
    let mask = 0;
    let val = num;

    while (val > 0) {
        mask = mask << 1;
        mask++;
        val = val >> 1;
    }

    return num ^ mask;
};

let result = findComplement(5);
console.assert(result === 2);

result = findComplement(1);
console.assert(result === 0);
