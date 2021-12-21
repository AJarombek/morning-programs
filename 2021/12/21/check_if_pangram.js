/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * @author Andrew Jarombek
 * @since 12/21/2021
 */

const checkIfPangram = function(sentence) {
    const set = new Set([
        'a', 'b', 'c', 'd', 'e',
        'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y',
        'z'
    ]);

    let index = 0;

    while (index < sentence.length && set.size) {
        set.delete(sentence.charAt(index));
        index++;
    }

    return !set.size
};