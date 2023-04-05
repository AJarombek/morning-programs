// Program: https://leetcode.com/problems/intersection-of-two-arrays/
// Author: Andrew Jarombek
// Date: 4/4/2023

#include <assert.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>

int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    int* result = malloc(sizeof(int) * 1000);
    int index = 0;

    if (!result) {
        exit(EXIT_FAILURE);
    }

    bool values[1001] = {false};

    for (int i = 0; i < nums1Size; i++) {
        values[nums1[i]] = true;
    }

    for (int i = 0; i < nums2Size; i++) {
        int val = nums2[i];

        if (values[val]) {
            result[index] = val;

            index++;
            values[val] = false;
        }
    }

    *returnSize = index;
    return result;
}

int main() {
    int* nums1 = malloc(sizeof(int) * 3);
    int* nums2 = malloc(sizeof(int) * 5);

    if (!nums1 || !nums2) {
        exit(EXIT_FAILURE);
    }

    nums1[0] = 4;
    nums1[1] = 9;
    nums1[2] = 5;

    nums2[0] = 9;
    nums2[1] = 4;
    nums2[2] = 9;
    nums2[3] = 8;
    nums2[4] = 4;

    int* resultLength = malloc(sizeof(int));
    int* result = intersection(nums1, 3, nums2, 5, resultLength);

    assert(resultLength[0] == 2);
    assert(result[0] == 9);
    assert(result[1] == 4);
}