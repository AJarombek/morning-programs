// Program: https://leetcode.com/problems/find-the-difference/
// Author: Andrew Jarombek
// Date: 4/11/2023

#include <assert.h>
#include <string.h>
#include <stdbool.h>

bool isSubsequence(char * s, char * t) {
    int sIndex = 0;
    int tIndex = 0;

    while (sIndex < strlen(s) && tIndex < strlen(t)) {
        if (s[sIndex] == t[tIndex]) {
            sIndex++;
        }

        tIndex++;
    }

    return sIndex == strlen(s);
}

int main() {
    assert(isSubsequence("abc", "ahbgdc"));
    assert(!isSubsequence("axc", "ahbgdc"));
}