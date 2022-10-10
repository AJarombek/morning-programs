/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * @author Andrew Jarombek
 * @since 10/10/2022
 */

function balancedStringSplit(s: string): number {
    let l = 0;
    let r = 0;
    let result = 0;

    for (let c of s) {
        if (c == 'L') {
            l++;
        } else {
            r++;
        }

        if (l == r)
            result++;
    }

    return result;
}