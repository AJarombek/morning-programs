// Program: https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author: Andrew Jarombek
// Date: 2/19/2022

#include <stdlib.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int dfs(struct TreeNode* root, int* result, int index) {
    if (root == NULL) {
        return index;
    }

    index = dfs(root->left, result, index);
    index = dfs(root->right, result, index);
    result[index] = root->val;
    return index + 1;
}

int* postorderTraversal(struct TreeNode* root, int* returnSize){
    int* result = (int*) malloc(sizeof(int) * 100);
    int size = dfs(root, result, 0);
    *returnSize = size;
    return result;
}

int main() {
    struct TreeNode node3 = { .val = 3, .left = NULL, .right = NULL };
    struct TreeNode node2 = { 2,  &node3, NULL };
    struct TreeNode node1 = { 1, NULL, &node2 };

    int size = 0;
    int* returnSize = &size;

    int* result = postorderTraversal(&node1, returnSize);

    assert(*returnSize == 3);
    assert(result[0] == 3);
    assert(result[1] == 2);
    assert(result[2] == 1);

    free(result);
}
