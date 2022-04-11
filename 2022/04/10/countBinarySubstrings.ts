/**
 * https://leetcode.com/problems/count-binary-substrings/
 * @author Andrew Jarombek
 * @since 4/10/2022
 */

function countBinarySubstrings(s: string): number {
    let result = 0;
    let prev = 0;
    let current = 0;
    let value = "0";

    for (let c of s) {
        if (c != value) {
            result += Math.min(prev, current);

            value = c;
            prev = current;
            current = 1;
        } else {
            current++;
        }
    }

    return result + Math.min(prev, current);
}