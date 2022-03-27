/**
 * https://leetcode.com/problems/reverse-string-ii/
 * @author Andrew Jarombek
 * @since 3/27/2022
 */

function reverseStr(s: string, k: number): string {
    let i = 0;
    let j = 0;
    let result = [];

    while (i < s.length) {
        if (j % 2 == 0) {
            for (let index = Math.min(s.length - 1, i + k - 1); index >= i; index--) {
                result.push(s.charAt(index));
            }
        } else {
            for (let index = i; index < Math.min(s.length, i + k); index++) {
                result.push(s.charAt(index));
            }
        }

        i += k;
        j++;
    }

    return result.join("");
}