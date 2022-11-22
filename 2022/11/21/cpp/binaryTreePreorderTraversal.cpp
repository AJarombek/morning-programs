// https://leetcode.com/problems/binary-tree-preorder-traversal/
// Author: Andrew Jarombek
// Date: 11/21/2022

#include <vector>
#include "binaryTreePreorderTraversal.h"

using namespace std;

vector<int> preorderTraversal(TreeNode* root) {
    vector<int> result {};

    if (root != nullptr)
        preorderDfs(root, result);

    return result;
}

void preorderDfs(TreeNode* node, vector<int>& result) {
    result.push_back(node->val);

    if (node->left != nullptr)
        preorderDfs(node->left, result);

    if (node->right != nullptr)
        preorderDfs(node->right, result);
}
