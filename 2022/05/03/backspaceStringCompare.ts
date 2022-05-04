/**
 * https://leetcode.com/problems/backspace-string-compare/
 * @author Andrew Jarombek
 * @since 5/3/2022
 */

function backspaceCompare(s: string, t: string): boolean {
    return typeString(s) == typeString(t);
}

function typeString(s: string): string {
    let result = [];

    for (let c of s) {
        if (c == '#') {
            result.pop();
        } else {
            result.push(c);
        }
    }

    return result.join("");
}