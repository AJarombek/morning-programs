/**
 * https://leetcode.com/problems/shortest-completing-word/
 * @author Andrew Jarombek
 * @since 12/27/2022
 */

const shortestCompletingWord = function(licensePlate, words) {
    const letters = licensePlate.toLowerCase();
    const map = new Map();

    let result = null;

    for (let letter of letters) {
        if (letter >= 'a' && letter <= 'z')
            map.set(letter, (map.get(letter) ?? 0) + 1);
    }

    for (let word of words) {
        let valid = true;
        const wordMap = new Map();

        for (let c of word) {
            wordMap.set(c, (wordMap.get(c) ?? 0) + 1);
        }

        for (let [key, value] of map) {
            if (value > (wordMap.get(key) ?? 0)) {
                valid = false;
                break;
            }
        }

        if (valid && (!result || word.length < result.length)) {
            result = word;
        }
    }

    return result;
}

console.assert(shortestCompletingWord("1s3 PSt", ["step","steps","stripe","stepple"]) === "steps");
