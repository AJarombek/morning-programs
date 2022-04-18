// https://leetcode.com/problems/same-tree/
// Author: Andrew Jarombek
// Date: 4/17/2022

#include <cassert>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

bool isSameTree(TreeNode* p, TreeNode* q) {
    if (p == nullptr && q == nullptr) {
        return true;
    }

    if (p == nullptr || q == nullptr) {
        return false;
    }

    if (p->val != q->val) {
        return false;
    }

    bool left = isSameTree(p->left, q->left);
    bool right = isSameTree(p->right, q->right);
    return left && right;
}

int main() {
    auto tree1node3 = TreeNode(3);
    auto tree1node2 = TreeNode(2);
    auto tree1 = TreeNode(1, &tree1node2, &tree1node3);

    auto tree2node3 = TreeNode(3);
    auto tree2node2 = TreeNode(2);
    auto tree2 = TreeNode(1, &tree2node2, &tree2node3);

    assert(isSameTree(&tree1, &tree2));
}