/**
 * https://leetcode.com/problems/hamming-distance/
 * @author Andrew Jarombek
 * @since 3/20/2022
 */

function hammingDistance(x: number, y: number): number {
    let count = 0;
    let z = x ^ y;

    while (z > 0) {
        if (z & 1)
            count++;

        z >>= 1;
    }

    return count;
}