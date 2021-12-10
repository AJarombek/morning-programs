/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 * @author Andrew Jarombek
 * @since 12/9/2021
 */

const arrayStringsAreEqual = function(word1, word2) {
    let word1Index = 0;
    let word1CharIndex = 0;
    let word2Index = 0;
    let word2CharIndex = 0;

    while (word1Index < word1.length && word2Index < word2.length) {
        if (word1[word1Index].charAt(word1CharIndex) !== word2[word2Index].charAt(word2CharIndex)) {
            return false;
        }

        if (word1CharIndex + 1 === word1[word1Index].length) {
            word1Index++;
            word1CharIndex = 0;
        } else {
            word1CharIndex++;
        }

        if (word2CharIndex + 1 === word2[word2Index].length) {
            word2Index++;
            word2CharIndex = 0;
        } else {
            word2CharIndex++;
        }
    }

    return word1Index === word1.length && word2Index === word2.length;
};
