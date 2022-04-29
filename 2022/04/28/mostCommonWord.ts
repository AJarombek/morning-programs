/**
 * https://leetcode.com/problems/most-common-word/
 * @author Andrew Jarombek
 * @since 4/28/2022
 */

function mostCommonWord(paragraph: string, banned: string[]): string {
    let map = new Map<string, number>();
    let set = new Set<string>(banned);

    let rawWords = paragraph.split(" ");
    let words = [];

    for (let word of rawWords) {
        let chars = word.split("");
        let val = [];

        for (let char of chars) {
            let lowerChar = char.toLowerCase();

            if (lowerChar >= 'a' && lowerChar <= 'z') {
                val.push(lowerChar);
            }
        }

        words.push(val.join(""));
    }

    for (let word of words) {
        map.set(word, (map.get(word) ?? 0) + 1);
    }

    let max = 0;
    let result = "";

    for (let [key, value] of map.entries()) {
        if (value > max && !set.has(key)) {
            max = value;
            result = key;
        }
    }

    return result;
}