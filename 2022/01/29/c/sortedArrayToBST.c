// Program: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Author: Andrew Jarombek
// Date: 1/29/2022

#include <stddef.h>
#include <stdlib.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

struct TreeNode* createTree(int* nums, struct TreeNode* node, int start, int end) {
    if (start == end) {
        node->val = nums[start];
        node->left = NULL;
        node->right = NULL;
        return node;
    } else {
        int mid = (start + end) / 2;
        node->val = nums[mid];
        node->left = NULL;
        node->right = NULL;

        if (start != mid) {
            struct TreeNode* left = malloc(sizeof(struct TreeNode));
            node->left = left;
            createTree(nums, left, start, mid - 1);
        }

        if (end != mid) {
            struct TreeNode* right = malloc(sizeof(struct TreeNode));
            node->right = right;
            createTree(nums, right, mid + 1, end);
        }
    }

    return node;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    struct TreeNode* node = malloc(sizeof(struct TreeNode));
    createTree(nums, node, 0, numsSize - 1);
    return node;
}

int main() {
    int* nums = malloc(sizeof(int) * 5);
    nums[0] = 1;
    nums[1] = 2;
    nums[3] = 3;

    struct TreeNode* node = sortedArrayToBST(nums, 3);

    free(nums);
    free(node);
}
