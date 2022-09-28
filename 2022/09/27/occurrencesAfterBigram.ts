/**
 * https://leetcode.com/problems/occurrences-after-bigram/
 * @author Andrew Jarombek
 * @since 9/27/2022
 */

function findOccurrences(text: string, first: string, second: string): string[] {
    let one = false;
    let two = false;
    const result = [];

    for (let word of text.split(" ")) {
        if (two) {
            result.push(word);
        }

        two = one && word == second;
        one = word == first;
    }

    return result;
}