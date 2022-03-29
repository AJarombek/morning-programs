/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * @author Andrew Jarombek
 * @since 3/28/2022
 */

function reverseWords(s: string): string {
    let words = s.split(" ");
    let reversedWords = [];

    for (let word of words) {
        let reverse = [];

        for (let i = word.length - 1; i >= 0; i--) {
            reverse.push(word.charAt(i));
        }

        reversedWords.push(reverse.join(""));
    }

    return reversedWords.join(" ");
}