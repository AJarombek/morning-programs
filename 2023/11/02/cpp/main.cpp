// Lambda functions in C++.
// Author: Andrew Jarombek
// Date: 11/1/2023

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

class Solution {
public:
    int countNodes(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        int leftDepth = getDepth(root->left);
        int rightDepth = getDepth(root->right);

        if (leftDepth == rightDepth) {
            return (1 << leftDepth) + countNodes(root->right);
        } else {
            return (1 << rightDepth) + countNodes(root->left);
        }
    }

    int getDepth(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        return 1 + getDepth(root->left);
    }
};

int main() {
    Solution solution;

    auto root = new TreeNode(
        1,
        new TreeNode(
            2,
            new TreeNode(4),
            new TreeNode(5)
        ),
        new TreeNode(
            3,
            new TreeNode(6),
            nullptr
        )
    );

    assert(solution.countNodes(root) == 6);
}