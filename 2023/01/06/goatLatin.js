/**
 * https://leetcode.com/problems/goat-latin/
 * @author Andrew Jarombek
 * @since 1/6/2023
 */

const toGoatLatin = function(sentence) {
    const words = sentence.split(" ");
    const vowels = new Set();
    vowels.add("a");
    vowels.add("e");
    vowels.add("i");
    vowels.add("o");
    vowels.add("u");
    vowels.add("A");
    vowels.add("E");
    vowels.add("I");
    vowels.add("O");
    vowels.add("U");

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        const result = [];
        if (vowels.has(word.charAt(0))) {
            result.push(word);
        } else {
            result.push(word.substring(1));
            result.push(word.charAt(0));
        }

        result.push("ma");

        for (j = 0; j <= i; j++)
            result.push("a");

        words[i] = result.join("");
    }

    return words.join(" ");
};

console.assert(toGoatLatin("I speak Goat Latin") === "Imaa peaksmaaa oatGmaaaa atinLmaaaaa");
