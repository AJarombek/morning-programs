// https://leetcode.com/problems/sum-of-left-leaves/
// Author: Andrew Jarombek
// Date: 12/7/2023

#include <cassert>
#include <string>

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
    static int sumOfLeftLeaves(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        int sum = 0;

        if (root->left != nullptr && root->left->right == nullptr && root->left->left == nullptr) {
            sum += root->left->val;
        } else {
            sum += sumOfLeftLeaves(root->left);
        }

        return sum + sumOfLeftLeaves(root->right);
    }
};

int main() {
    auto* root = new TreeNode(3);
    root->left = new TreeNode(9);
    root->right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

    assert(Solution::sumOfLeftLeaves(root) == 24);
    return 0;
}
