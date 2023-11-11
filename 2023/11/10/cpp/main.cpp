// https://leetcode.com/problems/binary-tree-paths/
// Author: Andrew Jarombek
// Date: 11/10/2023

#include <cassert>
#include <string>
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

class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        if (root == nullptr) {
            return {};
        }

        return binaryTreePaths(root, "");
    }

    vector<string> binaryTreePaths(TreeNode* root, const string& path) {
        if (root == nullptr) {
            return {};
        }

        vector<string> paths;

        if (root->left == nullptr && root->right == nullptr) {
            paths.push_back(path + to_string(root->val));
        } else {
            paths = binaryTreePaths(root->left, path + to_string(root->val) + "->");
            vector<string> rightPaths = binaryTreePaths(root->right, path + to_string(root->val) + "->");
            paths.insert(paths.end(), rightPaths.begin(), rightPaths.end());
        }

        return paths;
    }
};

int main() {
    auto solution = Solution();

    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->left->right = new TreeNode(5);
    root->right = new TreeNode(3);

    vector<string> paths = solution.binaryTreePaths(root);
    assert(paths.size() == 2);
    assert(paths[0] == "1->2->5");
    assert(paths[1] == "1->3");

    return 0;
}
