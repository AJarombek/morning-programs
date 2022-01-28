// Program: https://leetcode.com/problems/symmetric-tree/
// Author: Andrew Jarombek
// Date: 1/28/2022

#include <stdbool.h>
#include <stddef.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

// Successful Attempt

int match(struct TreeNode* left, struct TreeNode* right) {
    if (left == NULL && right == NULL) {
        return true;
    }

    if (left == NULL || right == NULL || left->val != right->val) {
        return false;
    }

    return match(left->left, right->right) && match(left->right, right->left);
}

bool isSymmetric(struct TreeNode* root) {
    return match(root->left, root->right);
}

// Attempt #1 - Works on Some Scenarios

int dfs1(struct TreeNode* root, int* values, int index) {
    if (root == NULL) {
        values[index] = -1;
        return index + 1;
    }

    index = dfs1(root->left, values, index);
    values[index] = root->val;
    index++;
    index = dfs1(root->right, values, index);
    return index;
}

int count1(struct TreeNode* root) {
    if (root == NULL) {
        return 1;
    } else {
        return 1 + count1(root->left) + count1(root->right);
    }
}

bool isSymmetric1(struct TreeNode* root){
    int nodeCount = count1(root);

    int* values = (int*) malloc(sizeof(int) * nodeCount);
    int index = dfs1(root, values, 0);

    int i = 0;
    int j = index - 1;

    while (i < j) {
        if (values[i] != values[j]) {
            return false;
        }

        i++;
        j--;
    }

    return true;
}