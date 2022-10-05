/**
 * https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 * @author Andrew Jarombek
 * @since 10/4/2022
 */

function canBeTypedWords(text: string, brokenLetters: string): number {
    let broken = new Set<string>();

    for (let c of brokenLetters.split("")) {
        broken.add(c);
    }

    let result = 0;

    for (let word of text.split(" ")) {
        let typed = true;
        let index = 0;

        while (index < word.length && typed) {
            if (broken.has(word.charAt(index))) {
                typed = false;
            } else {
                index++;
            }
        }

        if (typed)
            result++;
    }

    return result;
}
