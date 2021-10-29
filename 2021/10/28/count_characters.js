/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * @author Andrew Jarombek
 * @since 10/28/2021
 */

const countCharacters = function(words, chars) {
    const map = new Map();
    let result = 0;

    for (const c of chars) {
        const val = map.get(c) ?? 0;
        map.set(c, val + 1);
    }

    for (const word of words) {
        const wordMap = new Map();

        for (const c of word) {
            const val = wordMap.get(c) ?? 0;
            wordMap.set(c, val + 1);
        }

        let valid = true;
        for (const [key, value] of wordMap) {
            const charsValue = map.get(key) ?? 0;

            if (value > charsValue) {
                valid = false;
                break;
            }
        }

        if (valid) {
            result += word.length;
        }
    }

    return result;
};