/**
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/
 * @author Andrew Jarombek
 * @since 6/2/2022
 */

const isOneBitCharacter = function(bits) {
    if (bits.length === 1)
        return true;

    if (bits[bits.length - 1] === 1)
        return false;

    if (bits[bits.length - 2] === 0) {
        return true;
    }

    let count = 0;
    let index = bits.length - 2;

    do {
        count++;
        index--;
    } while (index >= 0 && bits[index] === 1);

    return count % 2 === 0;
}
