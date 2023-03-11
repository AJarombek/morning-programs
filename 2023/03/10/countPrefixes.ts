/**
 * https://leetcode.com/problems/count-prefixes-of-a-given-string/
 * @author Andrew Jarombek
 * @since 3/10/2023
 */

function countPrefixes(words: string[], s: string): number {
    let result = 0;

    for (let word of words) {
        if (s.length >= word.length && word == s.substring(0, word.length)) {
            result++;
        }
    }

    return result;
}