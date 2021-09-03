// Program: https://leetcode.com/problems/longest-common-prefix/
// Author: Andrew Jarombek
// Date: 9/3/2021

#include <string.h>
#include <assert.h>
#include <stdlib.h>

char* longestCommonPrefix(char** strs, int strsSize) {
    char* commonPrefix = strs[0];

    for (int i = 1; i < strsSize; i++) {
        char* current = strs[i];
        int currentLength = strlen(current);
        int prefixLength = strlen(commonPrefix);

        if (currentLength < prefixLength) {
            prefixLength = currentLength;
            commonPrefix[prefixLength] = '\0';
        } else if (prefixLength < currentLength) {
            current[prefixLength] = '\0';
        }

        while (strcmp(commonPrefix, current) != 0) {
            int newLength = strlen(commonPrefix) - 1;

            if (newLength == 0) {
                return "";
            }

            commonPrefix[newLength] = '\0';
            current[newLength] = '\0';
        }
    }

    return commonPrefix;
}

int main() {
    char* first = "flower";
    char* second = "flow";
    char* third = "flight";

    char** str = (char**) calloc(3, sizeof(char*));
    str[0] = first;
    str[1] = second;
    str[2] = third;

    char* result = longestCommonPrefix(str, 3);
    assert(strcmp(result, "fl") == 0);

    return 0;
}
