/**
 * https://leetcode.com/problems/backspace-string-compare/
 * @author Andrew Jarombek
 * @since 1/8/2023
 */

const backspaceCompare = function(s, t) {
    return generateString(s) === generateString(t);
};

const generateString = function(s) {
    const result = [];

    for (let c of s) {
        if (c === "#") {
            result.pop();
        } else {
            result.push(c);
        }
    }

    return result.join("");
}

console.assert(backspaceCompare("ab#c", "ad#c"));
console.assert(backspaceCompare("ab##", "c#d#"));
console.assert(!backspaceCompare("a#c", "b"));
