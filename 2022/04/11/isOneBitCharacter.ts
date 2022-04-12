/**
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/
 * @author Andrew Jarombek
 * @since 4/11/2022
 */

function isOneBitCharacter(bits: number[]): boolean {
    if (bits.length == 1) {
        return true;
    }

    if (bits[bits.length - 1] == 1) {
        return false;
    }

    let index = 0;

    while (index < bits.length - 1) {
        if (bits[index] == 1) {
            index++;
        }

        index++;
    }

    return index < bits.length;
}