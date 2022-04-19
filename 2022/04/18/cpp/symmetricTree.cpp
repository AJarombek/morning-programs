// https://leetcode.com/problems/symmetric-tree/
// Author: Andrew Jarombek
// Date: 4/18/2022

#include <cassert>
#include <vector>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

bool dfs(TreeNode* node1, TreeNode* node2);
bool isSymmetric(TreeNode* root);

bool isSymmetric(TreeNode* root) {
    return dfs(root, root);
}

bool dfs(TreeNode* node1, TreeNode* node2) {
    if (node1 == nullptr && node2 == nullptr)
        return true;

    if (node1 == nullptr || node2 == nullptr)
        return false;

    if (node1->val != node2->val)
        return false;

    bool left = dfs(node1->left, node2->right);
    bool right = dfs(node2->left, node1->right);
    return left && right;
}

int main() {
    auto node3 = TreeNode(3);
    auto node2 = TreeNode(2, &node3, nullptr);
    auto node = TreeNode(1, nullptr, &node2);
    assert(!isSymmetric(&node));
}