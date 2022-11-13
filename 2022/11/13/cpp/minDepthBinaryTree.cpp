// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 11/13/2022

#include <cassert>
#include <algorithm>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

int minDepth(TreeNode* root);
int dfs(TreeNode* node, int depth);

int minDepth(TreeNode* root) {
    if (root == nullptr)
        return 0;

    return dfs(root, 1);
}

int dfs(TreeNode* node, int depth) {
    if (node->left == nullptr && node->right == nullptr) {
        return depth;
    }

    int minDepth = INT32_MAX;

    if (node->left != nullptr) {
        minDepth = dfs(node->left, depth + 1);
    }

    if (node->right != nullptr) {
        minDepth = min(dfs(node->right, depth + 1), minDepth);
    }

    return minDepth;
}

int main() {
    auto* tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    assert(minDepth(tree) == 2);
}