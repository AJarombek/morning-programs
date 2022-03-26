/**
 * https://leetcode.com/problems/detect-capital/
 * @author Andrew Jarombek
 * @since 3/26/2022
 */

function detectCapitalUse(word: string): boolean {
    let words = word.split(" ");

    for (let word of words) {
        if (word.length > 1) {
            let first = word.charAt(0);
            let second = word.charAt(1);

            if (first.toUpperCase() == first && second.toUpperCase() == second) {
                for (let i = 2; i < word.length; i++) {
                    let c = word.charAt(i);
                    if (c.toUpperCase() != c) {
                        return false;
                    }
                }
            } else {
                for (let i = 1; i < word.length; i++) {
                    let c = word.charAt(i);
                    if (c.toUpperCase() == c) {
                        return false;
                    }
                }
            }
        }
    }

    return true;
}
