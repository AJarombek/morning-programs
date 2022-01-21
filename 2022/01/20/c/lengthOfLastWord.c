// Program: https://leetcode.com/problems/maximum-subarray/
// Author: Andrew Jarombek
// Date: 1/20/2022

#include <stdbool.h>
#include <assert.h>

int lengthOfLastWord(char * s) {
    int length = 0;
    bool space = true;

    for (char* t = s; *t != '\0'; t++) {
        if (*t == ' ') {
            space = true;
        } else if (space) {
            length = 1;
            space = false;
        } else {
            length++;
        }
    }

    return length;
}

int main() {
    int result = lengthOfLastWord("My name is Andy");
    assert(result == 4);
}