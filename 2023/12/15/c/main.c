// Program: https://leetcode.com/problems/fizz-buzz/
// Author: Andrew Jarombek
// Date: 12/15/2023

#include <assert.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

char** fizzBuzz(int n, int* returnSize) {
    char** result = malloc(sizeof(char*) * n);

    for (int i = 1; i <= n; i++) {
        char* str = malloc(sizeof(char) * 9);
        memset(str, 0, sizeof(char) * 9);

        if (i % 3 == 0) {
            strcat(str, "Fizz");
        }

        if (i % 5 == 0) {
            strcat(str, "Buzz");
        }

        if (strlen(str) == 0) {
            sprintf(str, "%d", i);
        }

        strcat(str, "\0");
        result[i - 1] = str;
    }

    *returnSize = n;
    return result;
}

int main() {
    int returnSize;
    char** result = fizzBuzz(15, &returnSize);

    assert(strcmp(result[0], "1") == 0);
    assert(strcmp(result[1], "2") == 0);
    assert(strcmp(result[2], "Fizz") == 0);
    assert(strcmp(result[3], "4") == 0);
    assert(strcmp(result[4], "Buzz") == 0);
    assert(strcmp(result[5], "Fizz") == 0);
    assert(strcmp(result[6], "7") == 0);
    assert(strcmp(result[7], "8") == 0);
    assert(strcmp(result[8], "Fizz") == 0);
    assert(strcmp(result[9], "Buzz") == 0);
    assert(strcmp(result[10], "11") == 0);
    assert(strcmp(result[11], "Fizz") == 0);
    assert(strcmp(result[12], "13") == 0);
    assert(strcmp(result[13], "14") == 0);
    assert(strcmp(result[14], "FizzBuzz") == 0);

    return 0;
}