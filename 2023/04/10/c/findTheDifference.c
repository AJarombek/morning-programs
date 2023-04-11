// Program: https://leetcode.com/problems/find-the-difference/
// Author: Andrew Jarombek
// Date: 4/10/2023

#include <assert.h>
#include <string.h>

char findTheDifference(char * s, char * t) {
    int chars[26] = {0};

    for (int i = 0; i < strlen(s); i++) {
        int index = s[i] - 97;
        chars[index] = chars[index] + 1;
    }

    for (int i = 0; i < strlen(t); i++) {
        int index = t[i] - 97;

        if (chars[index] == 0) {
            return t[i];
        }

        chars[index] = chars[index] - 1;
    }

    return ' ';
}

int main() {
    assert(findTheDifference("abcd", "abcde") == 'e');
}