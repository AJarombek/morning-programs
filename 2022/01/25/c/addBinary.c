// Program: https://leetcode.com/problems/add-binary/
// Author: Andrew Jarombek
// Date: 1/25/2022

#include <string.h>
#include <stdio.h>

char * addBinary(char * a, char * b){
    //long value = getValue(a) + getValue(b);
    int i = strlen(a) - 1;
    int j = strlen(b) - 1;
    int index = (i > j) ? i + 1 : j + 1;

    char result[index + 2];
    result[index + 1] = '\0';
    int remainder = 0;

    while (i >= 0 || j >= 0) {
        int v = remainder;

        if (i >= 0 && a[i] == '1')
            v++;

        if (j >= 0 && b[j] == '1')
            v++;

        if (v >= 2) {
            remainder = 1;
        } else {
            remainder = 0;
        }

        result[index] = (v == 1 || v == 3) ? '1' : '0';

        index--;
        i--;
        j--;
    }

    char* p = result;

    if (remainder) {
        result[0] = '1';
        return p;
    }

    return p + 1;
}

int main() {
    char* a = "10";
    char* b = "101";

    char* result = addBinary(a, b);
    printf("%s", result);
}