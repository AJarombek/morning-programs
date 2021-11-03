// Program: https://leetcode.com/problems/implement-strstr/
// Author: Andrew Jarombek
// Date: 11/2/2021

#include <assert.h>
#include <stdbool.h>

int strStr(char* haystack, char* needle){
    if (*needle == '\0') {
        return 0;
    }

    int index = 0;
    for (char* p = haystack; *p != '\0'; p++) {
        if (*p == *needle) {
            char* hp = p + 1;
            int equal = true;

            for (char* np = needle + 1; *np != '\0'; np++) {
                if (*hp == '\0' || *hp != *np) {
                    equal = false;
                    break;
                }

                hp++;
            }

            if (equal) {
                return index;
            }
        }

        index++;
    }

    return -1;
}

int main() {
    char* haystack = "aaaaaa";
    char* needle = "aab";
    int result = strStr(haystack, needle);
    assert(result == -1);
}