// Program: https://leetcode.com/problems/binary-tree-preorder-traversal/
// Author: Andrew Jarombek
// Date: 2/18/2022

#include <stdlib.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int preorder(struct TreeNode* node, int* result, int index) {
    if (node == NULL) {
        return index;
    }

    result[index] = node->val;
    int newIndex = preorder(node->left, result, index + 1);
    return preorder(node->right, result, newIndex);
}

int* preorderTraversal(struct TreeNode* root, int* returnSize){
    int* result = (int*) malloc(sizeof(int) * 100);
    int size = preorder(root, result, 0);
    *returnSize = size;
    return result;
}

int main() {
    struct TreeNode node3 = { .val = 3, .left = NULL, .right = NULL };
    struct TreeNode node2 = { 2,  &node3, NULL };
    struct TreeNode node1 = { 1, NULL, &node2 };

    int size = 0;
    int* returnSize = &size;

    int* result = preorderTraversal(&node1, returnSize);

    assert(*returnSize == 3);
    assert(result[0] == 1);
    assert(result[1] == 2);
    assert(result[2] == 3);

    free(result);
}
