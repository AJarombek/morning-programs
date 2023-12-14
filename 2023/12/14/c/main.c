// Program: https://leetcode.com/problems/longest-palindrome/
// Author: Andrew Jarombek
// Date: 12/14/2023

#include <assert.h>
#include <string.h>

int longestPalindrome(char* s) {
    int result = 0;
    int charCount[52];
    memset(charCount, 0, sizeof(charCount));

    for (int i = 0; i < strlen(s); i++) {
        int index = s[i] - 'A';

        if (index < 26) {
            charCount[index]++;
        } else {
            charCount[index - 6]++;
        }
    }

    for (int i = 0; i < 52; i++) {
        if (charCount[i] % 2 == 0) {
            result += charCount[i];
        } else {
            result += charCount[i] - 1;
        }
    }

    if (result < strlen(s)) {
        result++;
    }

    return result;
}

int main() {
    int result = longestPalindrome("abccccdd");
    assert(result == 7);

    result = longestPalindrome("a");
    assert(result == 1);

    result = longestPalindrome("bb");
    assert(result == 2);

    return 0;
}