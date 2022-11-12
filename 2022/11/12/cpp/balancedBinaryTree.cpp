// https://leetcode.com/problems/balanced-binary-tree/
// Author: Andrew Jarombek
// Date: 11/12/2022

#include <queue>
#include <cassert>
#include <iostream>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

bool isBalanced(TreeNode* root) {
    if (root == nullptr)
        return true;

    int maxDepth = -1;
    int minDepth = -1;

    queue<TreeNode*> nodes;
    nodes.push(root);

    while (!nodes.empty()) {
        maxDepth++;
        int length = nodes.size();

        for (int i = 0; i < length; i++) {
            TreeNode* node = nodes.front();
            nodes.pop();

            if (node->right == nullptr || node->left == nullptr) {
                if (minDepth == -1)
                    minDepth = maxDepth;

                if (maxDepth - minDepth > 1) {
                    cout << maxDepth << "\n";
                    cout << minDepth << "\n";
                    return false;
                }
            }

            if (node->left != nullptr) {
                nodes.push(node->left);
            }

            if (node->right != nullptr) {
                nodes.push(node->right);
            }
        }
    }

    cout << maxDepth << "\n";
    cout << minDepth << "\n";
    return maxDepth - minDepth <= 1;
}

int main() {
    auto* tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    assert(isBalanced(tree));
}