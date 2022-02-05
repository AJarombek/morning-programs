// Program: https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 2/5/2022

#include <stddef.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int dfs(struct TreeNode* root, int depth) {
    if (root->left == NULL && root->right == NULL) {
        return depth;
    }

    if (root->left == NULL) {
        return dfs(root->right, depth + 1);
    }

    if (root->right == NULL) {
        return dfs(root->left, depth + 1);
    }

    int left = dfs(root->left, depth + 1);
    int right = dfs(root->right, depth + 1);

    return (left < right) ? left : right;
}

int minDepth(struct TreeNode* root){
    if (root == NULL) {
        return 0;
    }

    return dfs(root, 1);
}

int main() {
    struct TreeNode node1 = {2, NULL, NULL};
    struct TreeNode node2 = {1, &node1, NULL};
    assert(minDepth(&node2) == 2);
}
