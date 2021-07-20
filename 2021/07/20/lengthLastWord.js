/**
 * https://leetcode.com/problems/length-of-last-word/
 * @author Andrew Jarombek
 * @since 7/20/2021
 */

const assert = (assertion) => {
    console.assert(assertion, `Assertion failed!`);
};

const lengthOfLastWord = function(s) {
    s = s.trim()

    let length = 0
    let latinRegex = /^[A-Za-z]{1}$/

    for (let i = s.length - 1; i >= 0; i--) {
        if (latinRegex.test(s.charAt(i))) {
            length++;
        } else {
            break;
        }
    }

    return length;
};

assert(lengthOfLastWord("Hello World") === 5)
