// Program: https://leetcode.com/problems/first-unique-character-in-a-string/
// Author: Andrew Jarombek
// Date: 4/9/2023

#include <assert.h>
#include <string.h>

int firstUniqChar(char * s){
    int chars[26] = {0};

    for (int i = 0; i < strlen(s); i++) {
        int index = s[i] - 97;
        chars[index] = chars[index] + 1;
    }

    for (int i = 0; i < strlen(s); i++) {
        int index = s[i] - 97;

        if (chars[index] == 1) {
            return i;
        }
    }

    return -1;
}

int main() {
    assert(firstUniqChar("leetcode") == 0);
    assert(firstUniqChar("aabb") == -1);
}