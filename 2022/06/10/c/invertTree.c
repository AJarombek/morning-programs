// Program: https://leetcode.com/problems/invert-binary-tree/
// Author: Andrew Jarombek
// Date: 6/10/2022

#include <stdlib.h>
#include <assert.h>

struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};


struct TreeNode* invertTree(struct TreeNode* root){
    if (root == NULL) {
        return NULL;
    }

    struct TreeNode* temp = root->left;
    root->left = root->right;
    root->right = temp;

    if (root->left != NULL) {
        invertTree(root->left);
    }

    if (root->right != NULL) {
        invertTree(root->right);
    }

    return root;
}

int main() {
    struct TreeNode node2 = {2, NULL, NULL};
    struct TreeNode node3 = {3, NULL, NULL};
    struct TreeNode node = {1, &node2, &node3};

    assert(node.val == 1);
    assert(node.left->val == 2);
    assert(node.right->val == 3);

    invertTree(&node);

    assert(node.val == 1);
    assert(node.left->val == 3);
    assert(node.right->val == 2);
}
