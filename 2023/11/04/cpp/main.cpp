// https://leetcode.com/problems/invert-binary-tree/
// Author: Andrew Jarombek
// Date: 11/4/2023

#include <cassert>
#include <queue>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if (root == nullptr || (root->left == nullptr && root->right == nullptr)) {
            return root;
        }

        TreeNode* temp = root->left;
        root->left = invertTree(root->right);
        root->right = invertTree(temp);
        return root;
    }
};

int main() {
    auto solution = Solution();
    auto root = new TreeNode(
        4,
        new TreeNode(
            2,
            new TreeNode(1),
            new TreeNode(3)
        ),
        new TreeNode(
            7,
            new TreeNode(6),
            new TreeNode(9)
        )
    );

    TreeNode* result = solution.invertTree(root);
    assert(result->val == 4);
    assert(result->left->val == 7);
    assert(result->right->val == 2);
    assert(result->left->left->val == 9);
    assert(result->left->right->val == 6);
    assert(result->right->left->val == 3);
    assert(result->right->right->val == 1);
}
