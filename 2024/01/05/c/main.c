// Program: https://leetcode.com/problems/repeated-substring-pattern/
// Author: Andrew Jarombek
// Date: 1/5/2024

#include <assert.h>
#include <stdbool.h>
#include <string.h>

bool repeatedSubstringPattern(char* s) {
    unsigned long length = strlen(s);

    for (int i = 1; i <= length / 2; i++) {
        if (length % i == 0) {
            bool match = true;

            for (int j = 0; j < length; j++) {
                if (s[j] != s[j % i]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }
    }

    return false;
}

int main() {
    assert(repeatedSubstringPattern("abab"));
    assert(!repeatedSubstringPattern("aba"));

    return 0;
}