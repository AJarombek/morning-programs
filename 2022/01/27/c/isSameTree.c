// Program: https://leetcode.com/problems/same-tree/
// Author: Andrew Jarombek
// Date: 1/27/2022

#include <stddef.h>
#include <stdbool.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};

bool isSameTree(struct TreeNode* p, struct TreeNode* q){
    if (p == NULL && q == NULL) {
        return true;
    }

    if ((p == NULL && q != NULL) || (p != NULL && q == NULL) || p->val != q->val) {
        return false;
    }

    return isSameTree(p->left, q->left) && isSameTree(p->right, q->right);
}