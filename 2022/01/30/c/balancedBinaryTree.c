// Program: https://leetcode.com/problems/balanced-binary-tree/
// Author: Andrew Jarombek
// Date: 1/30/2022

#include <stddef.h>
#include <stdbool.h>
#include <stdlib.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

// Attempt #2 (Successful)

int dfs(struct TreeNode* root){
    if (root == NULL) {
        return 0;
    }

    int left = dfs(root->left);
    int right = dfs(root->right);

    if (left == -1 || right == -1 || abs(left - right) > 1) {
        return -1;
    }

    return 1 + (left > right ? left : right);
}

bool isBalanced(struct TreeNode* root){
    return dfs(root) != -1;
}

// Attempt #1

bool isBalanced1(struct TreeNode* root){
    if (root == NULL) {
        return true;
    }

    struct TreeNode* queue[5000];
    int start = 0;
    int end = 1;

    queue[0] = root;

    int highest = 0;
    int lowest = 0;
    int level = 1;

    while (start < end) {
        int newEnd = end;

        for (int i = start; i < end; i++) {
            struct TreeNode* node = queue[i];

            if (node->left == NULL && node->right == NULL) {
                if (!highest || level < highest) {
                    highest = level;
                }

                lowest = level;
            } else if (node->left == NULL || node->right == NULL) {
                if (!highest) {
                    highest = level + 1;
                }

                lowest = level + 1;
            }

            if (node->left != NULL) {
                queue[newEnd] = node->left;
                newEnd++;
            }

            if (node->right != NULL) {
                queue[newEnd] = node->right;
                newEnd++;
            }
        }

        level++;
        start = end;
        end = newEnd;
    }

    return (lowest - highest) <= 1;
}
