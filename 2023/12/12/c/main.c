// Program: https://leetcode.com/problems/sum-of-left-leaves/
// Author: Andrew Jarombek
// Date: 12/12/2023

#include <assert.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

int sumOfLeftLeaves(struct TreeNode* root) {
    if (root == NULL) {
        return 0;
    }

    int sum = 0;

    if (root->left != NULL && root->left->left == NULL && root->left->right == NULL) {
        sum += root->left->val;
    } else {
        sum += sumOfLeftLeaves(root->left);
    }

    return sum + sumOfLeftLeaves(root->right);
}

int main() {
    struct TreeNode* root = malloc(sizeof(struct TreeNode));
    root->val = 3;

    struct TreeNode* left = malloc(sizeof(struct TreeNode));
    left->val = 9;

    struct TreeNode* right = malloc(sizeof(struct TreeNode));
    right->val = 20;

    struct TreeNode* rightLeft = malloc(sizeof(struct TreeNode));
    rightLeft->val = 15;

    struct TreeNode* rightRight = malloc(sizeof(struct TreeNode));
    rightRight->val = 7;

    root->left = left;
    root->right = right;
    right->left = rightLeft;
    right->right = rightRight;

    int result = sumOfLeftLeaves(root);
    assert(result == 24);

    return 0;
}