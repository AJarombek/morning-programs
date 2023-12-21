// Program: https://leetcode.com/problems/number-of-segments-in-a-string/
// Author: Andrew Jarombek
// Date: 12/21/2023

#include <assert.h>
#include <string.h>

int countSegments(char* s) {
    int count = 0;
    unsigned long length = strlen(s);

    for (int i = 0; i < length; i++) {
        if (s[i] != ' ' && (i == 0 || s[i - 1] == ' ')) {
            count++;
        }
    }

    return count;
}

int main() {
    char* s1 = "Hello, my name is Andrew Jarombek.";
    int result1 = countSegments(s1);
    assert(result1 == 6);

    return 0;
}