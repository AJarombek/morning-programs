/**
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * @author Andrew Jarombek
 * @since 5/28/2022
 */

function isAlienSorted(words: string[], order: string): boolean {
    if (words.length <= 1)
        return true;

    const map = new Map<string, number>();

    for (let i = 0; i < order.length; i++) {
        map.set(order.charAt(i), i);
    }

    let prev = words[0];

    for (let i = 1; i < words.length; i++) {
        const word = words[i];

        if (compare(prev, word, map) == 1) {
            return false;
        }

        prev = word;
    }

    return true;
}

function compare(word1: string, word2: string, map: Map<string, number>): number {
    if (word1 == word2)
        return 0;

    let index = 0;

    while (word1.length > index && word2.length > index) {
        let x = map.get(word1.charAt(index));
        let y = map.get(word2.charAt(index));

        if (x < y) {
            return -1;
        } else if (x > y) {
            return 1;
        } else {
            index++;
        }
    }

    return word1.length > word2.length ? 1 : -1;
}