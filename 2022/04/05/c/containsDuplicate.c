// Program: https://leetcode.com/problems/contains-duplicate-ii/
// Author: Andrew Jarombek
// Date: 4/5/2022

#include <stdbool.h>
#include <stdlib.h>
#include <assert.h>

typedef struct entry {
    int value;
    int index;
} Entry;

int compare (const void* a, const void* b) {
    Entry *entryA = (Entry*) a;
    Entry *entryB = (Entry*) b;

    if (entryA->value > entryB->value) {
        return 1;
    } else if (entryA->value < entryB->value) {
        return -1;
    }

    return entryA->index - entryB->index;
}

bool containsNearbyDuplicate(int* nums, int numsSize, int k){
    Entry entries[numsSize];

    for (int i = 0; i < numsSize; i++) {
        entries[i].value = nums[i];
        entries[i].index = i;
    }

    qsort(entries, numsSize, sizeof(Entry), compare);

    for (int i = 1; i < numsSize; i++) {
        if (entries[i-1].value == entries[i].value && abs(entries[i-1].index - entries[i].index) <= k) {
            return true;
        }
    }

    return false;
}

int main() {
    int* nums = malloc(sizeof(int) * 4);
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 1;

    bool result = containsNearbyDuplicate(nums, 4, 3);
    assert(result);
}
