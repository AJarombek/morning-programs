// Program: https://leetcode.com/problems/license-key-formatting/
// Author: Andrew Jarombek
// Date: 1/14/2024

#include <assert.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <stdio.h>

char toUpper(char ch) {
    return (char) toupper((unsigned char) ch);
}

char* licenseKeyFormatting(char* s, int k) {
    char* result = malloc(sizeof(char) * (strlen(s) + 1) * 2);
    int resultIndex = 0;
    int dashCount = 0;

    for (int i = (int) strlen(s) - 1; i >= 0; i--) {
        if (s[i] != '-') {
            result[resultIndex++] = toUpper(s[i]);
            dashCount++;
        }

        if (dashCount == k) {
            result[resultIndex++] = '-';
            dashCount = 0;
        }
    }

    if (result[resultIndex - 1] == '-') {
        result[resultIndex - 1] = '\0';
        resultIndex--;
    } else {
        result[resultIndex] = '\0';
    }

    for (int i = 0; i < resultIndex / 2; i++) {
        char temp = result[i];
        result[i] = result[resultIndex - i - 1];
        result[resultIndex - i - 1] = temp;
    }

    return result;
}

int main() {
    char* result = licenseKeyFormatting("5F3Z-2e-9-w", 4);
    printf("%s\n", result);
    assert(strcmp(result, "5F3Z-2E9W") == 0);

    result = licenseKeyFormatting("2-5g-3-J", 2);
    printf("%s\n", result);
    assert(strcmp(result, "2-5G-3J") == 0);

    result = licenseKeyFormatting("aaaa", 2);
    printf("%s\n", result);
    assert(strcmp(result, "AA-AA") == 0);

    result = licenseKeyFormatting("---", 3);
    printf("%s\n", result);
    assert(strcmp(result, "") == 0);

    return 0;
}