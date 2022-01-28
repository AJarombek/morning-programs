// Program: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 1/28/2022

#include <stddef.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int maxDepth(struct TreeNode* root) {
    if (root == NULL) {
        return 0;
    }

    int left = maxDepth(root->left) + 1;
    int right = maxDepth(root->right) + 1;

    return (left > right) ? left : right;
}

int main() {
    struct TreeNode node1 = {2, NULL, NULL};
    struct TreeNode node2 = {1, &node1, NULL};
    assert(maxDepth(&node2) == 2);
}
