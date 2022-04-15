/**
 * https://leetcode.com/problems/to-lower-case/
 * @author Andrew Jarombek
 * @since 4/14/2022
 */

function toLowerCase(s: string): string {
    const result = [];

    for (let c of s) {
        const code = c.charCodeAt(0);
        if (code >= 65 && code <= 90) {
            result.push(String.fromCharCode(code + 26 + 6));
        } else {
            result.push(c);
        }
    }

    return result.join("");
}