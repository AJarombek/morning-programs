/**
 * https://leetcode.com/problems/flood-fill/
 * @author Andrew Jarombek
 * @since 12/25/2022
 */

const toLowerCase = function(s) {
    let chars = s.split("");

    for (let i = 0; i < s.length; i++) {
        const code = chars[i].charCodeAt(0);
        if (code >= 65 && code <= 90) {
            chars[i] = String.fromCharCode(code + 32);
        }
    }

    return chars.join("");
};

console.assert(toLowerCase("Hello") === "hello");
