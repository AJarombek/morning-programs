/**
 * https://leetcode.com/problems/maximum-repeating-substring/
 * @author Andrew Jarombek
 * @since 12/8/2021
 */

const maxRepeating = function(sequence, word) {
    let max = 0;

    let index = 0;
    while (index <= sequence.length - word.length) {
        let currentMax = 0;

        while (word === sequence.substring(index, index + word.length)) {
            currentMax++;
            index += word.length;
        }

        if (!currentMax) {
            index++;
        } else {
            max = Math.max(max, currentMax);
            index -= word.length - 1;
        }
    }

    return max;
};