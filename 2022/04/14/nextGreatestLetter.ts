/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * @author Andrew Jarombek
 * @since 4/14/2022
 */

function nextGreatestLetter(letters: string[], target: string): string {
    for (let letter of letters) {
        if (letter > target) {
            return letter;
        }
    }

    return letters[0];
}