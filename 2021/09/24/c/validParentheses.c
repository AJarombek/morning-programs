// Program: https://leetcode.com/problems/valid-parentheses/
// Author: Andrew Jarombek
// Date: 9/24/2021

#include <string.h>
#include <stdbool.h>
#include <assert.h>

bool isValid(char * s){
    size_t length = strlen(s);
    char stack[length];
    int stackLength = 0;

    for (char* p = s; *p != '\0'; p++) {
        if (*p == '[') {
            stack[stackLength] = ']';
            stackLength++;
        } else if (*p == '(') {
            stack[stackLength] = ')';
            stackLength++;
        } else if (*p == '{') {
            stack[stackLength] = '}';
            stackLength++;
        } else if (stackLength != 0 && *p == stack[stackLength - 1]) {
            stackLength--;
        } else {
            return false;
        }
    }

    return stackLength == 0;
}

int main() {
    char* firstValid = "()";
    char* secondValid = "[{}]";
    char* firstInvalid = "[}";
    char* secondInvalid = "([])}";

    assert(isValid(firstValid));
    assert(isValid(secondValid));
    assert(!isValid(firstInvalid));
    assert(!isValid(secondInvalid));
}