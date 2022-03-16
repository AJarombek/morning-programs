// Program: https://leetcode.com/problems/excel-sheet-column-title/
// Author: Andrew Jarombek
// Date: 3/15/2022

#include <stdlib.h>
#include <assert.h>
#include <string.h>

char * convertToTitle(int columnNumber){
    int x = columnNumber;
    int length = 0;

    while (x > 0) {
        length++;
        x /= 26;
    }

    char* result = (char*) malloc(sizeof(char) * (length + 1));
    int index = 0;
    int offset = 'A';

    while (columnNumber > 0) {
        char c = ((columnNumber - 1) % 26) + offset;
        result[index] = c;
        index++;
        columnNumber = (columnNumber - 1) / 26;
    }

    result[index] = '\0';

    int start = 0;
    int end = index - 1;

    while (start < end) {
        char temp = result[start];
        result[start] = result[end];
        result[end] = temp;

        start++;
        end--;
    }

    return result;
}

int main() {
    char* result = convertToTitle(1);
    assert(strcmp(result, "A") == 0);
    free(result);
}
