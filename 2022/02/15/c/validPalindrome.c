// Program: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Author: Andrew Jarombek
// Date: 2/15/2022

#include <stdbool.h>
#include <ctype.h>
#include <string.h>
#include <assert.h>

bool isPalindrome(char * s){
    int start = 0;
    int end = strlen(s) - 1;

    while (start < end) {
        char c1 = s[start];

        if (!isalpha(c1) && !isdigit(c1)) {
            start++;
            continue;
        }

        char c2 = s[end];

        if (!isalpha(c2) && !isdigit(c2)) {
            end--;
            continue;
        }

        if (tolower(c1) != tolower(c2)) {
            return false;
        }

        start++;
        end--;
    }

    return true;
}

int main() {
    char* s1 = " ";
    assert(isPalindrome(s1));

    char* s2 = "race car";
    assert(isPalindrome(s2));

    char* s3 = "race a car";
    assert(!isPalindrome(s3));
}
