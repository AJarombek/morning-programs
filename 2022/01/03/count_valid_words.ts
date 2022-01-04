/**
 * https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
 * @author Andrew Jarombek
 * @since 1/3/2022
 */

function countValidWords(sentence: string): number {
    let count = 0;
    let words = sentence.split(" ");

    for (let word of words) {
        if (word.length === 0) {
            continue;
        }

        if (word.charAt(0) == '-' || word.charAt(word.length - 1) == '-') {
            continue;
        }

        let dashes = 0;
        let dashesIndex = 0;
        let punctuation = 0;
        let punctuationIndex = 0;
        let digits = 0;

        for (let i = 0; i < word.length; i++) {
            let c = word.charAt(i);

            if (c === '-') {
                dashes++;
                dashesIndex = i;
            } else if (c === ',' || c === '!' || c === '.') {
                punctuation++;
                punctuationIndex = i;
            } else if (c >= '0' && c <= '9') {
                digits++;
            }
        }

        if (digits > 0) {
            continue;
        }

        if (dashes > 1 || punctuation > 1) {
            continue;
        }

        if (dashes === 1) {
            if (dashesIndex === 0 || dashesIndex === word.length - 1) {
                continue;
            }

            const prev = word.charAt(dashesIndex - 1);
            const next = word.charAt(dashesIndex + 1);
            if (prev < 'a' || prev > 'z' || next < 'a' || next > 'z') {
                continue;
            }
        }

        if (punctuation === 1 && punctuationIndex !== word.length - 1) {
            continue;
        }

        count++;
    }

    return count;
}
