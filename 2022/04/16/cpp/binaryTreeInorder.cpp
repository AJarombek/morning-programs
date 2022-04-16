// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author: Andrew Jarombek
// Date: 4/16/2022

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

vector<int> inorderTraversal(TreeNode* root);
void dfs(TreeNode* node, vector<int>& v);

vector<int> inorderTraversal(TreeNode* root) {
    vector<int> v {};
    dfs(root, v);
    return v;
}

void dfs(TreeNode* node, vector<int>& v) {
    if (node == nullptr) {
        return;
    }

    dfs(node->left, v);
    v.push_back(node->val);
    dfs(node->right, v);
}

int main() {
    auto node3 = TreeNode(3);
    auto node2 = TreeNode(2, &node3, nullptr);
    auto node = TreeNode(1, nullptr, &node2);
    vector<int> result = inorderTraversal(&node);

    assert(result[0] == 1);
    assert(result[1] == 3);
    assert(result[2] == 2);
}