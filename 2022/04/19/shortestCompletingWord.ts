/**
 * https://leetcode.com/problems/shortest-completing-word/
 * @author Andrew Jarombek
 * @since 4/19/2022
 */

function shortestCompletingWord(licensePlate: string, words: string[]): string {
    let lpMap = new Map<string, number>();

    for (let c of licensePlate) {
        c = c.toLowerCase();

        if (c >= 'a' && c <= 'z')
            lpMap.set(c, (lpMap.get(c) ?? 0) + 1);
    }

    let result = "";
    for (let word of words) {
        let charMap = new Map<string, number>();

        for (let c of word) {
            charMap.set(c, (charMap.get(c) ?? 0) + 1);
        }

        let valid = true;
        for (let [key, value] of lpMap.entries()) {
            let count = charMap.get(key) ?? 0;
            if (count == 0 || value > count) {
                valid = false;
                break;
            }
        }

        if (valid && (!result || result.length > word.length)) {
            result = word;
        }
    }

    return result;
}