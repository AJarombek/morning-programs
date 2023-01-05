/**
 * https://leetcode.com/problems/unique-morse-code-words/
 * @author Andrew Jarombek
 * @since 1/4/2023
 */

const uniqueMorseRepresentations = function(words) {
    const set = new Set();
    const codes = [
        ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
        ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."
    ];

    for (let word of words) {
        const chars = word.split("").map((c) => codes[c.charCodeAt(0) - 97]);
        set.add(chars.join(""));
    }

    return set.size;
}

console.assert(uniqueMorseRepresentations(["gin","zen","gig","msg"]) === 2);
console.assert(uniqueMorseRepresentations(["a"]) === 1);
