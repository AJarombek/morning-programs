// Program: https://leetcode.com/problems/excel-sheet-column-number/
// Author: Andrew Jarombek
// Date: 3/17/2022

#include <assert.h>

int titleToNumber(char * columnTitle){
    int result = 0;

    for (char* c = columnTitle; *c != '\0'; c++) {
        result *= 26;
        int val = *c - 'A' + 1;
        result += val;
    }

    return result;
}

int main() {
    assert(titleToNumber("A") == 1);
}
