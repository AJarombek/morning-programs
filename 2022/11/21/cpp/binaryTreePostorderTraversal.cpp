// https://leetcode.com/problems/binary-tree-postorder-traversal/
// Author: Andrew Jarombek
// Date: 11/21/2022

#include <vector>
#include "binaryTreePostorderTraversal.h"

using namespace std;

vector<int> postorderTraversal(TreeNode* root) {
    vector<int> result {};

    if (root != nullptr)
        dfs(root, result);

    return result;
}

void dfs(TreeNode* node, vector<int>& result) {
    if (node->left != nullptr)
        dfs(node->left, result);

    if (node->right != nullptr)
        dfs(node->right, result);

    result.push_back(node->val);
}
