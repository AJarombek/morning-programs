/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * @author Andrew Jarombek
 * @since 9/11/2022
 */

const reverseWords = function(s) {
    const words = s.split(" ");
    let result = [];

    for (let i = 0; i < words.length; i++) {
        const word = words[i];

        if (i > 0)
            result.push(" ");

        for (let j = word.length - 1; j >= 0; j--) {
            result.push(word.charAt(j));
        }
    }

    return result.join("");
}

console.assert(reverseWords("my name is andy") === "ym eman si ydna");
