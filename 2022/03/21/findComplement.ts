/**
 * https://leetcode.com/problems/number-complement/
 * @author Andrew Jarombek
 * @since 3/21/2022
 */

function findComplement(num: number): number {
    let mask = 0;

    while (mask < num) {
        mask <<= 1;
        mask += 1;
    }

    return num ^ mask;
}