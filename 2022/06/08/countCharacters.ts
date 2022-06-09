/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * @author Andrew Jarombek
 * @since 6/8/2022
 */

function countCharacters(words: string[], chars: string): number {
    let map = new Map<string, number>();

    for (let c of chars) {
        map.set(c, (map.get(c) ?? 0) + 1);
    }

    let result = 0;

    for (let word of words) {
        let wordMap = new Map<string, number>();

        for (let c of word) {
            wordMap.set(c, (wordMap.get(c) ?? 0) + 1);
        }

        let valid = true;

        for (let [key, value] of wordMap.entries()) {
            if ((map.get(key) ?? 0) < value) {
                valid = false;
                break;
            }
        }

        if (valid)
            result += word.length;
    }

    return result;
}