// Program: https://leetcode.com/problems/pascals-triangle/
// Author: Andrew Jarombek
// Date: 2/10/2022

#include <stdlib.h>
#include <assert.h>

int** generate(int numRows, int* returnSize, int** returnColumnSizes){
    int** result = (int**) malloc(sizeof(int*) * numRows);

    *returnColumnSizes = (int*) malloc(sizeof(int) * numRows);
    *returnSize = numRows;

    int* first = (int*) malloc(sizeof(int) * 1);
    first[0] = 1;
    (*returnColumnSizes)[0] = 1;
    result[0] = first;

    if (numRows == 1) {
        return result;
    }

    int* prev = (int*) malloc(sizeof(int) * 2);
    prev[0] = 1;
    prev[1] = 1;
    (*returnColumnSizes)[1] = 2;
    result[1] = prev;

    int row = 3;
    while (row <= numRows) {
        int* current = (int*) malloc(sizeof(int) * row);
        (*returnColumnSizes)[row - 1] = row;
        current[0] = 1;

        for (int i = 0; i < row - 2; i++) {
            current[i + 1] = prev[i] + prev[i + 1];
        }

        current[row - 1] = 1;
        result[row - 1] = current;
        prev = current;

        row += 1;
    }

    return result;
}

int main() {
    int size = 0;
    int* returnSize = &size;

    int* columnSizes = &size;
    int** returnColumnSizes = &columnSizes;
    int** result = generate(5, returnSize, returnColumnSizes);

    assert(result[0][0] == 1);

    assert(result[1][0] == 1);
    assert(result[1][1] == 1);

    assert(result[2][0] == 1);
    assert(result[2][1] == 2);
    assert(result[2][2] == 1);

    assert(result[3][0] == 1);
    assert(result[3][1] == 3);
    assert(result[3][2] == 3);
    assert(result[3][3] == 1);

    assert(result[4][0] == 1);
    assert(result[4][1] == 4);
    assert(result[4][2] == 6);
    assert(result[4][3] == 4);
    assert(result[4][4] == 1);

    free(columnSizes);
    free(result);
}
