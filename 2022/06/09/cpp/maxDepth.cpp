// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 6/9/2022

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

int maxDepth(TreeNode* root);
int dfs(TreeNode* node, int depth);

int maxDepth(TreeNode* root) {
    if (root == nullptr)
        return 0;

    return dfs(root, 1);
}

int dfs(TreeNode* node, int depth) {
    int left = 0;
    int right = 0;

    if (node->left != nullptr) {
        left = dfs(node->left, depth + 1);
    }

    if (node->right != nullptr) {
        right = dfs(node->right, depth + 1);
    }

    int maxDepth = max(left, right);
    return max(depth, maxDepth);
}

int main() {
    auto node3 = TreeNode(3);
    auto node2 = TreeNode(2, &node3, nullptr);
    auto node = TreeNode(1, nullptr, &node2);
    int result = maxDepth(&node);

    assert(result == 3);
}