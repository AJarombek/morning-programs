/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * @author Andrew Jarombek
 * @since 12/21/2022
 */

const validPalindrome = function(s) {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        if (s.charAt(start) !== s.charAt(end)) {
            return (
                isPalindrome(s.substring(start, end)) ||
                isPalindrome(s.substring(start + 1, end + 1))
            )
        }

        start++;
        end--;
    }

    return true;
};

const isPalindrome = function(s) {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        if (s.charAt(start) !== s.charAt(end)) {
            return false;
        }

        start++;
        end--;
    }

    return true;
}

console.assert(validPalindrome("aba"));
console.assert(validPalindrome("abca"));
console.assert(!validPalindrome("abc"));
