// Program: https://leetcode.com/problems/reverse-string/
// Author: Andrew Jarombek
// Date: 4/2/2023

#include <assert.h>
#include <string.h>

void reverseString(char* s, int sSize){
    int start = 0;
    int end = sSize - 1;

    while (start < end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
    }
}

int main() {
    char* s = "hello";
    reverseString(s, 5);
    assert(strcmp(s, "olleh") == 0);
}