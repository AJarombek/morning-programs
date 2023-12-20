// Program: https://leetcode.com/problems/add-strings/
// Author: Andrew Jarombek
// Date: 12/20/2023

#include <assert.h>
#include <stdlib.h>
#include <string.h>

char* addStrings(char* num1, char* num2) {
    unsigned long size1 = strlen(num1);
    unsigned long size2 = strlen(num2);
    unsigned long size = size1 > size2 ? size1 : size2;
    char* result = malloc(sizeof(char) * size + 2);

    int carry = 0;

    for (int i = 0; i < size; i++) {
        int digit1 = i < size1 ? num1[size1 - i - 1] - '0' : 0;
        int digit2 = i < size2 ? num2[size2 - i - 1] - '0' : 0;

        int sum = digit1 + digit2 + carry;
        carry = sum / 10;
        result[size - i] = (sum % 10) + '0';
    }

    if (carry > 0) {
        result[0] = carry + '0';
        result[size + 1] = '\0';
    } else {
        result++;
        result[size] = '\0';
    }

    return result;
}

int main() {
    char* result = addStrings("123", "456");
    assert(strcmp(result, "579") == 0);

    result = addStrings("1", "9");
    assert(strcmp(result, "10") == 0);

    return 0;
}