/**
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 * @author Andrew Jarombek
 * @since 11/15/2021
 */

const removePalindromeSub = function(s) {
    return s === s.split("").reverse().join("") ? 1 : 2;
};


// Doesn't work for all test cases.  Needed to check responses to understand the proper answer.
const removePalindromeSubInitialAttempt = function(s) {
    let steps = 0;

    while (s) {
        let startIndex = 1;
        let start = s[0];

        let endIndex = s.length - 1;
        let end = '';

        let startRemainder = '';
        let endRemainder = '';

        while (startIndex <= endIndex) {
            if (start.length > end.length) {
                if (s[endIndex] === start[start.length - 1]) {
                    end = s[endIndex] + end;
                } else {
                    endRemainder = s[endIndex] + endRemainder;
                }

                endIndex--;
            } else {
                start += s[startIndex];
                startIndex++;
            }
        }

        steps++;
        s = startRemainder + endRemainder;
    }

    return steps;
};
