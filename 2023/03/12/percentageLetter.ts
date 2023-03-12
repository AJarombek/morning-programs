/**
 * https://leetcode.com/problems/largest-3-same-digit-number-in-string/
 * @author Andrew Jarombek
 * @since 3/12/2023
 */

function percentageLetter(s: string, letter: string): number {
    let count = 0;

    for (let c of s) {
        if (c == letter) {
            count++;
        }
    }

    return Math.floor(count / s.length * 100);
}