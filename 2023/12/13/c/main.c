// Program: https://leetcode.com/problems/convert-a-number-to-hexadecimal/
// Author: Andrew Jarombek
// Date: 12/13/2023

#include <assert.h>
#include <string.h>
#include <stdlib.h>
#include <printf.h>

char* toHex(int num) {
    char* values = "0123456789abcdef";
    char* result = malloc(sizeof(char) * 9);
    int i = 7;

    if (num == 0) {
        return "0";
    }

    unsigned int n = num;

    result[8] = '\0';

    while (n != 0) {
        int index = n & 15U;
        result[i] = values[index];
        n >>= 4;
        i--;
    }

    return result + i + 1;
}

int main() {
    char* result = toHex(26);
    printf("%s\n", result);
    assert(strcmp(result, "1a") == 0);

    result = toHex(-1);
    printf("%s\n", result);
    assert(strcmp(result, "ffffffff") == 0);

    return 0;
}