// Program: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Author: Andrew Jarombek
// Date: 4/3/2023

#include <assert.h>
#include <string.h>

char* reverseVowels(char * s){
    unsigned long start = 0;
    unsigned long end = strlen(s) - 1;
    char* vowels = "aeiouAEIOU";

    while (start < end) {
        while (start < end && strchr(vowels, s[start]) == NULL) {
            start++;
        }

        while (start < end && strchr(vowels, s[end]) == NULL) {
            end--;
        }

        if (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    return s;
}

int main() {
    char* s = "hello";
    char* result = reverseVowels(s);
    assert(strcmp(result, "holle") == 0);
}