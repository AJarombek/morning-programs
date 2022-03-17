// Program: https://leetcode.com/problems/majority-element/
// Author: Andrew Jarombek
// Date: 3/16/2022

#include <stdlib.h>

struct HashMap {
    int key;
    int val;
    struct HashMap* next;
};

int majorityElement(int* nums, int numsSize) {
    if (numsSize == 1) {
        return nums[0];
    }

    int target = numsSize / 2 + 1;
    struct HashMap** map = (struct HashMap**) malloc(sizeof(struct HashMap*) * target);

    struct HashMap entry = {nums[0], 1, NULL};
    map[0] = &entry;

    for (int i = 1; i < numsSize; i++) {
        int key = nums[i];

        struct HashMap* current = *map;

        while (current != NULL) {
            if (current->key == key) {
                current->val += 1;

                if (current->val == target) {
                    return current->key;
                }

                break;
            }

            if (current->next == NULL) {
                struct HashMap* next = (struct HashMap*) malloc(sizeof(struct HashMap*));
                next->key = key;
                next->val = 1;

                current->next = next;
                break;
            }

            current = current->next;
        }
    }

    return 0;
}

int main() {}
