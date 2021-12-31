/**
 * https://leetcode.com/problems/reverse-prefix-of-word/
 * @author Andrew Jarombek
 * @since 12/31/2021
 */

const reversePrefix = function(word, ch) {
    let index = 0;

    while (index < word.length && word.charAt(index) !== ch) {
        index++;
    }

    if (index < word.length) {
        let result = [];

        for (let i = index; i >= 0; i--) {
            result.push(word.charAt(i));
        }

        return result.join("") + word.substring(index + 1, word.length);
    } else {
        return word;
    }
};