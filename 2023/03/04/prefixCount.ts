/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/
 * @author Andrew Jarombek
 * @since 3/4/2023
 */

function prefixCount(words: string[], pref: string): number {
    let result = 0;

    for (let word of words) {
        if (pref.length <= word.length && word.substring(0, pref.length) == pref) {
            result++;
        }
    }

    return result;
}