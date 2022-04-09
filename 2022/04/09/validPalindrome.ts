/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * @author Andrew Jarombek
 * @since 4/9/2022
 */

// What is stopping your dream from coming true these days?

function validPalindrome(s: string): boolean {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        if (s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        } else {
            let left = false;
            let right = false;

            if (s.charAt(start) == s.charAt(end - 1)) {
                left = isPalindrome(s.substring(start + 1, end - 1));
            }

            if (s.charAt(start + 1) == s.charAt(end)) {
                right = isPalindrome(s.substring(start + 2, end));
            }

            return left || right;
        }
    }

    return true;
}

function isPalindrome(s: string): boolean {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        if (s.charAt(start) == s.charAt(end)) {
            start++;
            end--;
        } else {
            return false;
        }
    }

    return true;
}
