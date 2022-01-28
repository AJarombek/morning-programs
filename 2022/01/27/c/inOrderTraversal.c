// Program: https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author: Andrew Jarombek
// Date: 1/27/2022

#include <stddef.h>
#include <stdlib.h>
#include <assert.h>

struct TreeNode {
     int val;
     struct TreeNode *left;
     struct TreeNode *right;
};

int traversal(struct TreeNode* root, int* result, int index) {
    if (root->left != NULL) {
        index = traversal(root->left, result, index);
    }

    result[index] = root->val;
    index++;

    if (root->right != NULL) {
        index = traversal(root->right, result, index);
    }

    return index;
}

int* inorderTraversal(struct TreeNode* root, int* returnSize){
    if (root == NULL) {
        *returnSize = 0;
        return NULL;
    }

    int* result = (int*) malloc(sizeof(int) * 100);

    int size = traversal(root, result, 0);
    *returnSize = size;

    return result;
}

int main() {
    struct TreeNode node1 = {3, NULL, NULL};
    struct TreeNode node2 = {2, &node1, NULL};
    struct TreeNode node3 = {1, NULL, &node2};

    int val = 0;
    int* size = &val;
    int* result = inorderTraversal(&node3, size);

    assert(*size == 3);
    assert(result[0] == 1);
    assert(result[1] == 3);
    assert(result[2] == 2);

    free(result);
}