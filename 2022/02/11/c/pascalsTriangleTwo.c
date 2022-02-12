// Program: https://leetcode.com/problems/pascals-triangle-ii/
// Author: Andrew Jarombek
// Date: 2/11/2022

#include <stdlib.h>
#include <assert.h>

int* getRow(int rowIndex, int* returnSize){
    int* result = (int*) malloc(sizeof(int) * (rowIndex + 1));
    *returnSize = rowIndex + 1;

    if (rowIndex < 2) {
        for (int i = 0; i <= rowIndex; i++) {
            result[i] = 1;
        }

        return result;
    }

    result[0] = 1;
    result[1] = 1;

    for (int i = 2; i <= rowIndex; i++) {
        result[i] = 1;

        for (int j = i - 1; j > 0; j--) {
            result[j] = result[j] + result[j - 1];
        }
    }

    return result;
}

int main() {
    int size = 0;
    int* returnSize = &size;
    int* result = getRow(4, returnSize);

    assert(result[0] == 1);
    assert(result[1] == 4);
    assert(result[2] == 6);
    assert(result[3] == 4);
    assert(result[4] == 1);

    free(result);
}
