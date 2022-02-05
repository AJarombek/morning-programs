// Program: https://leetcode.com/problems/path-sum/
// Author: Andrew Jarombek
// Date: 2/5/2022

#include <stddef.h>
#include <stdbool.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

bool dfs(struct TreeNode* root, int targetSum, int currentSum) {
    int sum = root->val + currentSum;
    if (root->left == NULL && root->right == NULL) {
        return sum == targetSum;
    }

    bool left = false;
    bool right = false;

    if (root->left != NULL) {
        left = dfs(root->left, targetSum, sum);
    }

    if (root->right != NULL) {
        right = dfs(root->right, targetSum, sum);
    }

    return left || right;
}

bool hasPathSum(struct TreeNode* root, int targetSum){
    if (root == NULL) {
        return false;
    }

    return dfs(root, targetSum, 0);
}