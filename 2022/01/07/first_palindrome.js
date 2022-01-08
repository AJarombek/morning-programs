/**
 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 * @author Andrew Jarombek
 * @since 1/7/2022
 */

const firstPalindrome = function(words) {
    for (let word of words) {
        let i = 0;
        let equal = true;

        while (i < word.length / 2 && equal) {
            if (word.charAt(i) !== word.charAt(word.length - i - 1))
                equal = false;

            i++;
        }

        if (equal)
            return word;
    }

    return "";
};
