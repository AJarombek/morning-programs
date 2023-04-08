// Program: https://leetcode.com/problems/ransom-note/
// Author: Andrew Jarombek
// Date: 4/8/2023

#include <assert.h>
#include <stdbool.h>
#include <string.h>

bool canConstruct(char * ransomNote, char * magazine) {
    int letters[26] = {0};

    for (int i = 0; i < strlen(magazine); i++) {
        int index = magazine[i] - 97;
        letters[index] = letters[index] + 1;
    }

    for (int i = 0; i < strlen(ransomNote); i++) {
        int index = ransomNote[i] - 97;

        if (letters[index] <= 0) {
            return false;
        }

        letters[index] = letters[index] - 1;
    }

    return true;
}

int main() {
    assert(!canConstruct("aa", "ab"));
    assert(canConstruct("aa", "aab"));
}