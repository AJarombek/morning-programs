/**
 * https://leetcode.com/problems/unique-morse-code-words/
 * @author Andrew Jarombek
 * @since 4/26/2022
 */

function uniqueMorseRepresentations(words: string[]): number {
    let codes = [
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    ];

    let set = new Set<string>();
    let offset = "a".charCodeAt(0);

    for (let word of words) {
        let code = [];

        for (let c of word) {
            code.push(codes[c.charCodeAt(0) - offset]);
        }

        set.add(code.join(""));
    }

    return set.size;
}