// https://leetcode.com/problems/path-sum/
// Author: Andrew Jarombek
// Date: 11/14/2022

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

bool hasPathSum(TreeNode* root, int targetSum);
bool dfs(TreeNode* root, int currentSum, int targetSum);

bool hasPathSum(TreeNode* root, int targetSum) {
    if (root == nullptr)
        return false;

    return dfs(root, 0, targetSum);
}

bool dfs(TreeNode* root, int currentSum, int targetSum) {
    if (root->left == nullptr && root->right == nullptr)
        return currentSum + root->val == targetSum;

    bool left = false;
    bool right = false;

    if (root->left != nullptr) {
        left = dfs(root->left, currentSum + root->val, targetSum);
    }

    if (root->right != nullptr) {
        right = dfs(root->right, currentSum + root->val, targetSum);
    }

    return left || right;
}

int main() {
    auto* tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    assert(!hasPathSum(tree, 1));
    assert(!hasPathSum(tree, 2));
    assert(hasPathSum(tree, 3));
    assert(hasPathSum(tree, 4));
}