/**
 * https://leetcode.com/problems/goat-latin/
 * @author Andrew Jarombek
 * @since 4/30/2022
 */

function toGoatLatin(sentence: string): string {
    let vowels = new Set<string>(['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']);
    let words = sentence.split(" ");

    for (let i = 0; i < words.length; i++) {
        let chars = words[i].split("");
        let start = 0;

        if (!vowels.has(chars[0])) {
            start = 1;
            chars.push(chars[0]);
        }

        chars.push("ma");

        for (let index = 0; index <= i; index++)
            chars.push("a");

        words[i] = chars.join("").substring(start);
    }

    return words.join(" ");
}